package com.toools.mapa.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/toools/mapa/helpers/PermissionUtils;", "", "()V", "isPermissionGranted", "", "grantPermissions", "", "", "grantResults", "", "permission", "([Ljava/lang/String;[ILjava/lang/String;)Z", "app_debug"})
public final class PermissionUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.toools.mapa.helpers.PermissionUtils INSTANCE = null;
    
    private PermissionUtils() {
        super();
    }
    
    /**
     * Checks if the result contains a [PackageManager.PERMISSION_GRANTED] result for a
     * permission from a runtime permissions request.
     *
     * @see android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
     */
    public final boolean isPermissionGranted(@org.jetbrains.annotations.NotNull
    java.lang.String[] grantPermissions, @org.jetbrains.annotations.NotNull
    int[] grantResults, @org.jetbrains.annotations.NotNull
    java.lang.String permission) {
        return false;
    }
}