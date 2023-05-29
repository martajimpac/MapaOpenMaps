package com.toools.mapa.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/toools/mapa/data/PuntoRepository;", "", "puntoDao", "Lcom/toools/mapa/data/model/database/dao/PuntoDao;", "(Lcom/toools/mapa/data/model/database/dao/PuntoDao;)V", "clearPuntos", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPuntosByIdFromDatabase", "", "Lcom/toools/mapa/domain/model/Punto;", "senderoId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPuntos", "puntos", "Lcom/toools/mapa/data/model/database/entities/PuntoEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PuntoRepository {
    private final com.toools.mapa.data.model.database.dao.PuntoDao puntoDao = null;
    
    @javax.inject.Inject
    public PuntoRepository(@org.jetbrains.annotations.NotNull
    com.toools.mapa.data.model.database.dao.PuntoDao puntoDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllPuntosByIdFromDatabase(int senderoId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.toools.mapa.domain.model.Punto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertPuntos(@org.jetbrains.annotations.NotNull
    java.util.List<com.toools.mapa.data.model.database.entities.PuntoEntity> puntos, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearPuntos(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}