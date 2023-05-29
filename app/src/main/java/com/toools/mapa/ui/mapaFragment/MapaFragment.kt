package com.toools.mapa.ui.mapaFragment

import android.Manifest
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.preference.PreferenceManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.toools.mapa.R
import com.toools.mapa.core.Resource
import com.toools.mapa.databinding.FragmentMapaBinding
import com.toools.mapa.domain.model.Punto
import com.toools.mapa.domain.model.Sendero
import com.toools.mapa.helpers.PermissionUtils
import com.toools.tooolsdialog.DialogHelper
import dagger.hilt.android.AndroidEntryPoint
import es.dmoral.toasty.Toasty
import org.osmdroid.bonuspack.kml.KmlDocument
import org.osmdroid.bonuspack.kml.KmlMultiGeometry
import org.osmdroid.bonuspack.kml.KmlPlacemark
import org.osmdroid.bonuspack.kml.Style
import org.osmdroid.config.Configuration
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.overlay.FolderOverlay
import org.osmdroid.views.overlay.Polyline
import org.osmdroid.views.overlay.compass.CompassOverlay
import org.osmdroid.views.overlay.compass.InternalCompassOrientationProvider
import org.osmdroid.views.overlay.gestures.RotationGestureOverlay
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors


@AndroidEntryPoint
class MapaFragment : Fragment() {
    private val TAG = "MapaFragment"
    private lateinit var binding: FragmentMapaBinding
    private var numeroSendero : Int ? = null

    var isCenterMap = false

    private val viewModel: MapaViewModel by viewModels()

    //Permisos
    private val WRITE_PERMISSION_REQUEST_CODE = 3
    private val LOCATION_PERMISSION_REQUEST_CODE = 1
    private var mPermissionDenied = false

    //Localizacion
    private var locationUpdates: LocationCallback?  = null
    var fusedLocationClient: FusedLocationProviderClient? = null
    val reqSetting: LocationRequest = LocationRequest.create().apply {
        fastestInterval = 1500
        interval = 1500
        priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        smallestDisplacement = 1.0f
    }
    var lastLocation: LocationResult? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMapaBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Cargar/inicializar la configuración de osmdroid
        Configuration.getInstance().load(
            requireContext(),
            PreferenceManager.getDefaultSharedPreferences(requireContext())
        )
        setUpObservers()
    }

    override fun onResume() {
        super.onResume()
        Configuration.getInstance().load(
            requireContext(),
            PreferenceManager.getDefaultSharedPreferences(requireContext())
        )
        //Ver cual es la posicion actual del usuario y cargar el mapa desde ahi
        setUpLocation()
        binding.mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        Configuration.getInstance().save(
            requireContext(),
            PreferenceManager.getDefaultSharedPreferences(requireContext())
        )
        binding.mapView.onPause()
    }

    private fun setUpLocation() {

        checkPermission(
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION
        )

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireActivity())

        locationUpdates = object : LocationCallback() {
            override fun onLocationResult(lr: LocationResult) {

                lastLocation = lr

                lr.lastLocation.let { loadMaps(it.latitude, it.longitude) }

            }
        }
        fusedLocationClient?.requestLocationUpdates(reqSetting, locationUpdates as LocationCallback, Looper.getMainLooper())
    }

    var mLocationOverlay: MyLocationNewOverlay? = null
    var mCompassOverlay: CompassOverlay? = null
    var mRotationGestureOverlay: RotationGestureOverlay? = null
    private fun loadMaps(latitude: Double, longitude: Double) {

        binding.apply{
            //capas
            val tileSource = TileSourceFactory.MAPNIK
            mapView.setTileSource(tileSource)

            //My Location
            //note you have handle the permissions yourself, the overlay did not do it for you
            mLocationOverlay = MyLocationNewOverlay(GpsMyLocationProvider(context), mapView)
            mLocationOverlay!!.enableMyLocation()
            context?.resources?.let { resources ->

                val defaultMarker = ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.adventurer_map,
                    null
                )
                val defaultBitmap = (defaultMarker as BitmapDrawable).bitmap
                mLocationOverlay!!.setPersonIcon(
                    Bitmap.createScaledBitmap(
                        defaultBitmap,
                        50,
                        50,
                        false
                    )
                )
            }

            mapView.overlays.add(mLocationOverlay)

            //On screen compass Activar la brujula
            mCompassOverlay = CompassOverlay(
                context,
                InternalCompassOrientationProvider(context),
                mapView
            )
            mCompassOverlay!!.enableCompass()
            mapView.overlays.add(mCompassOverlay)

            //support for map rotation
            mRotationGestureOverlay = RotationGestureOverlay(mapView)
            mRotationGestureOverlay!!.isEnabled = true
            mapView.overlays.add(mRotationGestureOverlay)

            //scales tiles to the current screen's DPI, helps with readability of labels
            mapView.isTilesScaledToDpi = true

            //activar zoom y desplazamiento
            mapView.setMultiTouchControls(true)

            //the rest of this is restoring the last map location the user looked at
            mapView.controller.setCenter(GeoPoint(latitude, longitude))
            mapView.controller.zoomTo(8.0)

            isCenterMap = true

            setHasOptionsMenu(true)

            //todo crear dialogo para elegir sendero
            numeroSendero = 1
            viewModel.getSendero(numeroSendero!!)

            /*
            val resourceId = resources.getIdentifier("url_sendero_$numeroSendero", "string", "com.toools.mapa")
            cargarSendero(getString(resourceId))*/

            //viewModel.getSendero(numeroSendero!!) //si el resultado de esto es nulo vamos a llamar a insertar sendero
        }
    }

    fun cargarSendero(url: String){

        //ESTO ES PARA QUE NO TE DE EL ERROR android.os.NetworkOnMainThreadException
        val executor: ExecutorService = Executors.newSingleThreadExecutor()
        val handler = Handler(Looper.getMainLooper())
        var sendero: Sendero? = null

        executor.execute {

            val kmlDocument = KmlDocument()
            val ok = kmlDocument.parseKMLUrl(url)

            if (ok) {
                val puntos : MutableList<Punto> = mutableListOf()
                kmlDocument.mKmlRoot?.mItems?.get(0)?.let { kmlPlacemark ->

                    val placemark = kmlPlacemark as KmlPlacemark
                    val geometry = placemark.mGeometry as KmlMultiGeometry

                    for (item in geometry.mItems) {
                        item.mCoordinates.forEach {
                            val punto = Punto(it.latitude, it.longitude,1)
                            puntos.add(punto)
                        }
                    }
                }

                //Obtener nombre
                val nombre = kmlDocument.mKmlRoot?.mName ?: "Nombre"

                //Obtener la descripcion de la ruta
                val descripcion = kmlDocument.mKmlRoot?.mDescription ?: "Descripcion"

                //Obtener el estilo de la ruta
                val estilo = kmlDocument.mKmlRoot?.mStyle ?: "Estilo"

                sendero = puntos.let {
                    Sendero(
                        numeroSendero!!,
                        url,
                        nombre,
                        descripcion,
                        estilo,
                        it
                    )
                }
            }else{
                Toasty.warning(requireContext(),R.string.sendero_error,Toast.LENGTH_SHORT,true)
            }
            handler.post {
                sendero?.let {
                    viewModel.insertaSendero(it)
                }
            }
        }
    }

    //********************************************
    // MARK: Funciones del Mapa
    //********************************************
    var kmlOverlay: FolderOverlay? = null
    val listPolyline: MutableList<Polyline> = mutableListOf()
    private fun dibujaSendero(sendero: Sendero){

        val kmlDocument = KmlDocument()

        kmlOverlay?.let {
            binding.mapView.overlays.remove(it)
        }

        for (polyline in listPolyline){
            binding.mapView.overlays.remove(polyline)
        }

        listPolyline.clear()

        var defaultStyle: Style? = null

        context?.resources?.let { resources ->
            val defaultMarker = ResourcesCompat.getDrawable(
                getResources(),
                R.drawable.marker,
                null
            )
            val defaultBitmap = (defaultMarker as BitmapDrawable).bitmap
            defaultStyle = Style(
                defaultBitmap,
                ContextCompat.getColor(requireContext(),R.color.red_app),
                50.0f,
                ContextCompat.getColor(requireContext(),R.color.green_app)
            )
        }

        //Crear la linea de la ruta
        val polyline = Polyline(binding.mapView)
        //crear un geopoint a partir de mi punto
        sendero.puntos?.forEach {
            var geoPoint = GeoPoint(it.latitud,it.longitud)
            polyline.addPoint(geoPoint)
        }
        polyline.outlinePaint.strokeJoin = Paint.Join.ROUND
        polyline.outlinePaint.strokeCap = Paint.Cap.ROUND
        polyline.infoWindow = null
        polyline.outlinePaint.color = ContextCompat.getColor(requireContext(),R.color.orange_app)

        listPolyline.add(polyline)
        binding.mapView.overlays.add(polyline)

    }

    //********************************************
    // Permiso de localización
    //********************************************
    @SuppressLint("MissingPermission")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        @NonNull permissions: Array<String>,
        @NonNull grantResults: IntArray
    ) {

        if (requestCode != WRITE_PERMISSION_REQUEST_CODE || requestCode != LOCATION_PERMISSION_REQUEST_CODE)
            return

        if (PermissionUtils.isPermissionGranted(
                permissions,
                grantResults,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) &&
            PermissionUtils.isPermissionGranted(
                permissions,
                grantResults,
                Manifest.permission.ACCESS_FINE_LOCATION
            )) {

        } else {
                // Display the missing permission error dialog when the fragments resume.
                Toast.makeText(requireActivity(), R.string.permission_required_toast, Toast.LENGTH_LONG).show()
                mPermissionDenied = false
        }
    }

    private val PERMISSION_ID = 42
    private fun checkPermission(vararg perm: String) : Boolean {

            val havePermissions = perm.toList().all {
                ContextCompat.checkSelfPermission(requireActivity(), it) ==
                        PackageManager.PERMISSION_GRANTED
            }
            if (!havePermissions) {
                if (perm.toList().any {
                        ActivityCompat.shouldShowRequestPermissionRationale(
                            requireActivity(),
                            it
                        )
                    }) {
                    val dialog = AlertDialog.Builder(context)
                        .setTitle(resources.getString(R.string.titu_localizacion))
                        .setMessage(resources.getString(R.string.desc_localizacion))
                        .setPositiveButton(resources.getString(R.string.ok)) { _, _ ->
                            ActivityCompat.requestPermissions(requireActivity(), perm, PERMISSION_ID)
                        }
                        .setNegativeButton(resources.getString(R.string.no)) { _, _ ->
                            checkPermission(
                                Manifest.permission.ACCESS_COARSE_LOCATION,
                                Manifest.permission.ACCESS_FINE_LOCATION
                            )
                        }
                        .create()
                    dialog.show()
                } else {
                    ActivityCompat.requestPermissions(requireActivity(), perm, PERMISSION_ID)
                }
                return false
            }
            return true
    }

    fun setUpObservers() {

        viewModel.insertaSenderoLiveData.observe(viewLifecycleOwner) { response ->
            Log.e(TAG, "insertaSendero: {${response.status}}")

            when (response.status) {
                Resource.Status.LOADING -> {
                    DialogHelper.getInstance().showLoadingAlert(requireActivity() as AppCompatActivity, null, true)
                }

                Resource.Status.SUCCESS -> {
                    DialogHelper.getInstance().showLoadingAlert(requireActivity() as AppCompatActivity, null, false)
                    viewModel.getSendero(numeroSendero!!)
                }

                Resource.Status.ERROR -> {
                    DialogHelper.getInstance().showOKAlert(activity = requireActivity() as AppCompatActivity,
                        title = R.string.ups,
                        text = response.exception ?: R.string.inserta_sendero_error,
                        icon = R.drawable.mapa,
                        completion = {}
                    )
                }
            }
        }

        var numeroIntentos = 0
        viewModel.getSenderoLiveData.observe(viewLifecycleOwner) { response ->
            Log.e(TAG, "getSendero: {${response.status}}")

            when (response.status) {
                Resource.Status.LOADING -> {
                    DialogHelper.getInstance().showLoadingAlert(requireActivity() as AppCompatActivity, null, true)
                }

                Resource.Status.SUCCESS -> {
                    DialogHelper.getInstance().showLoadingAlert(requireActivity() as AppCompatActivity, null, false)
                    val sendero = response.data
                    sendero?.let{
                        dibujaSendero(sendero)
                    }
                }

                Resource.Status.ERROR -> {
                    //si el sendero es nulo o no tiene ningun punto volver a insertarlo en la base de datos
                    numeroIntentos++
                    if(numeroIntentos < 2){
                        val resourceId = resources.getIdentifier("url_sendero_$numeroSendero", "string", "com.toools.mapa")
                        cargarSendero(getString(resourceId))
                    }else{
                        DialogHelper.getInstance().showOKAlert(activity = requireActivity() as AppCompatActivity,
                            title = R.string.ups,
                            text = R.string.recupera_sendero_error,
                            icon = R.drawable.mapa,
                            completion = {}
                        )
                    }
                }
            }
        }
    }
}