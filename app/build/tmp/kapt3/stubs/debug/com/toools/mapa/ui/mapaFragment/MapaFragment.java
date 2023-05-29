package com.toools.mapa.ui.mapaFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0007J!\u0010K\u001a\u00020\u00122\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070M\"\u00020\u0007H\u0002\u00a2\u0006\u0002\u0010NJ\u0010\u0010O\u001a\u00020I2\u0006\u0010P\u001a\u00020QH\u0002J\u0018\u0010R\u001a\u00020I2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020TH\u0002J$\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\b\u0010^\u001a\u00020IH\u0016J/\u0010_\u001a\u00020I2\u0006\u0010`\u001a\u00020\u00042\u000e\b\u0001\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070M2\b\b\u0001\u0010b\u001a\u00020cH\u0017\u00a2\u0006\u0002\u0010dJ\b\u0010e\u001a\u00020IH\u0016J\u001a\u0010f\u001a\u00020I2\u0006\u0010g\u001a\u00020W2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\b\u0010h\u001a\u00020IH\u0002J\u0006\u0010i\u001a\u00020IR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0012\u0010<\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010=R\u0011\u0010>\u001a\u00020?\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001b\u0010B\u001a\u00020C8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bD\u0010E\u00a8\u0006j"}, d2 = {"Lcom/toools/mapa/ui/mapaFragment/MapaFragment;", "Landroidx/fragment/app/Fragment;", "()V", "LOCATION_PERMISSION_REQUEST_CODE", "", "PERMISSION_ID", "TAG", "", "WRITE_PERMISSION_REQUEST_CODE", "binding", "Lcom/toools/mapa/databinding/FragmentMapaBinding;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "isCenterMap", "", "()Z", "setCenterMap", "(Z)V", "kmlOverlay", "Lorg/osmdroid/views/overlay/FolderOverlay;", "getKmlOverlay", "()Lorg/osmdroid/views/overlay/FolderOverlay;", "setKmlOverlay", "(Lorg/osmdroid/views/overlay/FolderOverlay;)V", "lastLocation", "Lcom/google/android/gms/location/LocationResult;", "getLastLocation", "()Lcom/google/android/gms/location/LocationResult;", "setLastLocation", "(Lcom/google/android/gms/location/LocationResult;)V", "listPolyline", "", "Lorg/osmdroid/views/overlay/Polyline;", "getListPolyline", "()Ljava/util/List;", "locationUpdates", "Lcom/google/android/gms/location/LocationCallback;", "mCompassOverlay", "Lorg/osmdroid/views/overlay/compass/CompassOverlay;", "getMCompassOverlay", "()Lorg/osmdroid/views/overlay/compass/CompassOverlay;", "setMCompassOverlay", "(Lorg/osmdroid/views/overlay/compass/CompassOverlay;)V", "mLocationOverlay", "Lorg/osmdroid/views/overlay/mylocation/MyLocationNewOverlay;", "getMLocationOverlay", "()Lorg/osmdroid/views/overlay/mylocation/MyLocationNewOverlay;", "setMLocationOverlay", "(Lorg/osmdroid/views/overlay/mylocation/MyLocationNewOverlay;)V", "mPermissionDenied", "mRotationGestureOverlay", "Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;", "getMRotationGestureOverlay", "()Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;", "setMRotationGestureOverlay", "(Lorg/osmdroid/views/overlay/gestures/RotationGestureOverlay;)V", "numeroSendero", "Ljava/lang/Integer;", "reqSetting", "Lcom/google/android/gms/location/LocationRequest;", "getReqSetting", "()Lcom/google/android/gms/location/LocationRequest;", "viewModel", "Lcom/toools/mapa/ui/mapaFragment/MapaViewModel;", "getViewModel", "()Lcom/toools/mapa/ui/mapaFragment/MapaViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "cargarSendero", "", "url", "checkPermission", "perm", "", "([Ljava/lang/String;)Z", "dibujaSendero", "sendero", "Lcom/toools/mapa/domain/model/Sendero;", "loadMaps", "latitude", "", "longitude", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "setUpLocation", "setUpObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MapaFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = "MapaFragment";
    private com.toools.mapa.databinding.FragmentMapaBinding binding;
    private java.lang.Integer numeroSendero;
    private boolean isCenterMap = false;
    private final kotlin.Lazy viewModel$delegate = null;
    private final int WRITE_PERMISSION_REQUEST_CODE = 3;
    private final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private boolean mPermissionDenied = false;
    private com.google.android.gms.location.LocationCallback locationUpdates;
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    @org.jetbrains.annotations.NotNull
    private final com.google.android.gms.location.LocationRequest reqSetting = null;
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.location.LocationResult lastLocation;
    @org.jetbrains.annotations.Nullable
    private org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay mLocationOverlay;
    @org.jetbrains.annotations.Nullable
    private org.osmdroid.views.overlay.compass.CompassOverlay mCompassOverlay;
    @org.jetbrains.annotations.Nullable
    private org.osmdroid.views.overlay.gestures.RotationGestureOverlay mRotationGestureOverlay;
    @org.jetbrains.annotations.Nullable
    private org.osmdroid.views.overlay.FolderOverlay kmlOverlay;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<org.osmdroid.views.overlay.Polyline> listPolyline = null;
    private final int PERMISSION_ID = 42;
    
    public MapaFragment() {
        super();
    }
    
    public final boolean isCenterMap() {
        return false;
    }
    
    public final void setCenterMap(boolean p0) {
    }
    
    private final com.toools.mapa.ui.mapaFragment.MapaViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationClient() {
        return null;
    }
    
    public final void setFusedLocationClient(@org.jetbrains.annotations.Nullable
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.location.LocationRequest getReqSetting() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.android.gms.location.LocationResult getLastLocation() {
        return null;
    }
    
    public final void setLastLocation(@org.jetbrains.annotations.Nullable
    com.google.android.gms.location.LocationResult p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    private final void setUpLocation() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay getMLocationOverlay() {
        return null;
    }
    
    public final void setMLocationOverlay(@org.jetbrains.annotations.Nullable
    org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.osmdroid.views.overlay.compass.CompassOverlay getMCompassOverlay() {
        return null;
    }
    
    public final void setMCompassOverlay(@org.jetbrains.annotations.Nullable
    org.osmdroid.views.overlay.compass.CompassOverlay p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.osmdroid.views.overlay.gestures.RotationGestureOverlay getMRotationGestureOverlay() {
        return null;
    }
    
    public final void setMRotationGestureOverlay(@org.jetbrains.annotations.Nullable
    org.osmdroid.views.overlay.gestures.RotationGestureOverlay p0) {
    }
    
    private final void loadMaps(double latitude, double longitude) {
    }
    
    public final void cargarSendero(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.osmdroid.views.overlay.FolderOverlay getKmlOverlay() {
        return null;
    }
    
    public final void setKmlOverlay(@org.jetbrains.annotations.Nullable
    org.osmdroid.views.overlay.FolderOverlay p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.osmdroid.views.overlay.Polyline> getListPolyline() {
        return null;
    }
    
    private final void dibujaSendero(com.toools.mapa.domain.model.Sendero sendero) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    @androidx.annotation.NonNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    @androidx.annotation.NonNull
    int[] grantResults) {
    }
    
    private final boolean checkPermission(java.lang.String... perm) {
        return false;
    }
    
    public final void setUpObservers() {
    }
}