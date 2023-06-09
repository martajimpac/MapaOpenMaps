package com.toools.mapa.helpers

import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat

object PermissionUtils {


    /**
     * Checks if the result contains a [PackageManager.PERMISSION_GRANTED] result for a
     * permission from a runtime permissions request.
     *
     * @see android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
     */
    fun isPermissionGranted(grantPermissions: Array<String>, grantResults: IntArray, permission: String): Boolean {

        for (i in grantPermissions.indices) {

            if (permission == grantPermissions[i])
                return grantResults[i] == PackageManager.PERMISSION_GRANTED
        }
        return false
    }
}