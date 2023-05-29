package com.toools.mapa.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/toools/mapa/data/SenderoRepository;", "", "senderoDao", "Lcom/toools/mapa/data/model/database/dao/SenderoDao;", "(Lcom/toools/mapa/data/model/database/dao/SenderoDao;)V", "clearSendero", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSenderoByIdFromDatabase", "Lcom/toools/mapa/domain/model/Sendero;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSendero", "sendero", "Lcom/toools/mapa/data/model/database/entities/SenderoEntity;", "(Lcom/toools/mapa/data/model/database/entities/SenderoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SenderoRepository {
    private final com.toools.mapa.data.model.database.dao.SenderoDao senderoDao = null;
    
    @javax.inject.Inject
    public SenderoRepository(@org.jetbrains.annotations.NotNull
    com.toools.mapa.data.model.database.dao.SenderoDao senderoDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSenderoByIdFromDatabase(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.toools.mapa.domain.model.Sendero> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertSendero(@org.jetbrains.annotations.NotNull
    com.toools.mapa.data.model.database.entities.SenderoEntity sendero, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearSendero(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}