package com.toools.mapa.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/toools/mapa/di/RoomModule;", "", "()V", "PUNTO_DATABASE_NAME", "", "SENDERO_DATABASE_NAME", "providePuntoDao", "Lcom/toools/mapa/data/model/database/dao/PuntoDao;", "db", "Lcom/toools/mapa/data/model/database/PuntoDatabase;", "provideRoomPunto", "context", "Landroid/content/Context;", "provideRoomSendero", "Lcom/toools/mapa/data/model/database/SenderoDatabase;", "provideSenderoDao", "Lcom/toools/mapa/data/model/database/dao/SenderoDao;", "app_debug"})
@dagger.Module
public final class RoomModule {
    @org.jetbrains.annotations.NotNull
    public static final com.toools.mapa.di.RoomModule INSTANCE = null;
    private static final java.lang.String SENDERO_DATABASE_NAME = "sendero_database";
    private static final java.lang.String PUNTO_DATABASE_NAME = "punto_database";
    
    private RoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.toools.mapa.data.model.database.SenderoDatabase provideRoomSendero(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.toools.mapa.data.model.database.PuntoDatabase provideRoomPunto(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.toools.mapa.data.model.database.dao.SenderoDao provideSenderoDao(@org.jetbrains.annotations.NotNull
    com.toools.mapa.data.model.database.SenderoDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.toools.mapa.data.model.database.dao.PuntoDao providePuntoDao(@org.jetbrains.annotations.NotNull
    com.toools.mapa.data.model.database.PuntoDatabase db) {
        return null;
    }
}