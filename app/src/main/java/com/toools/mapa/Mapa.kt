package com.toools.mapa

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import androidx.multidex.MultiDexApplication
import com.toools.tooolsdialog.DialogHelper

@HiltAndroidApp
class Mapa : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        mInstance = this

        //Inicializar fuente por defecto TODO
        /*ViewPump.init(
            ViewPump.builder().addInterceptor(
                CalligraphyInterceptor(
                    CalligraphyConfig.Builder()
                        .setFontAttrId(androidx.core.R.attr.font)
                        .build()
                )
            )
                .build()
        )*/


        DialogHelper.getInstance().initDefaultValues(imgDefault = R.drawable.mapa, backgroundColor = R.color.white, iconThinColor = null,
            iconBackgroundColor = R.color.white, textColor = R.color.black, buttonColor = R.color.colorPrimary,
            isLoadingBlack = true ,buttonTextColor = R.color.white)
    }

    //region STATIC ACCESS
    companion object {
        private lateinit var mInstance: Application
        fun getInstance(): Application {
            return mInstance
        }
    }
}