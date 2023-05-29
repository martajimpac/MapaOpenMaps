package com.toools.mapa.data.model.database.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/toools/mapa/data/model/database/dao/SenderoDao;", "", "deleteSendero", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSenderoById", "Lcom/toools/mapa/data/model/database/entities/SenderoEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSendero", "sendero", "(Lcom/toools/mapa/data/model/database/entities/SenderoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SenderoDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM sendero_table WHERE id = :id")
    public abstract java.lang.Object getSenderoById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.toools.mapa.data.model.database.entities.SenderoEntity> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertSendero(@org.jetbrains.annotations.NotNull
    com.toools.mapa.data.model.database.entities.SenderoEntity sendero, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM sendero_table")
    public abstract java.lang.Object deleteSendero(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}