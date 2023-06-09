package com.toools.mapa.ui.mapaFragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\nR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/toools/mapa/ui/mapaFragment/MapaViewModel;", "Landroidx/lifecycle/ViewModel;", "insertaSenderoUseCase", "Lcom/toools/mapa/domain/model/InsertaSenderoUseCase;", "getSenderoUseCase", "Lcom/toools/mapa/domain/model/GetSenderoUseCase;", "(Lcom/toools/mapa/domain/model/InsertaSenderoUseCase;Lcom/toools/mapa/domain/model/GetSenderoUseCase;)V", "getSenderoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/toools/mapa/core/Resource;", "Lcom/toools/mapa/domain/model/Sendero;", "getGetSenderoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "insertaSenderoLiveData", "", "getInsertaSenderoLiveData", "getSendero", "", "id", "", "insertaSendero", "sendero", "app_debug"})
public final class MapaViewModel extends androidx.lifecycle.ViewModel {
    private final com.toools.mapa.domain.model.InsertaSenderoUseCase insertaSenderoUseCase = null;
    private final com.toools.mapa.domain.model.GetSenderoUseCase getSenderoUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.toools.mapa.core.Resource<java.lang.String>> insertaSenderoLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.toools.mapa.core.Resource<com.toools.mapa.domain.model.Sendero>> getSenderoLiveData = null;
    
    @javax.inject.Inject
    public MapaViewModel(@org.jetbrains.annotations.NotNull
    com.toools.mapa.domain.model.InsertaSenderoUseCase insertaSenderoUseCase, @org.jetbrains.annotations.NotNull
    com.toools.mapa.domain.model.GetSenderoUseCase getSenderoUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.toools.mapa.core.Resource<java.lang.String>> getInsertaSenderoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.toools.mapa.core.Resource<com.toools.mapa.domain.model.Sendero>> getGetSenderoLiveData() {
        return null;
    }
    
    public final void insertaSendero(@org.jetbrains.annotations.NotNull
    com.toools.mapa.domain.model.Sendero sendero) {
    }
    
    public final void getSendero(int id) {
    }
}