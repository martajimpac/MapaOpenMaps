package com.toools.mapa.ui.mapaFragment;

import com.toools.mapa.domain.model.GetSenderoUseCase;
import com.toools.mapa.domain.model.InsertaSenderoUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapaViewModel_Factory implements Factory<MapaViewModel> {
  private final Provider<InsertaSenderoUseCase> insertaSenderoUseCaseProvider;

  private final Provider<GetSenderoUseCase> getSenderoUseCaseProvider;

  public MapaViewModel_Factory(Provider<InsertaSenderoUseCase> insertaSenderoUseCaseProvider,
      Provider<GetSenderoUseCase> getSenderoUseCaseProvider) {
    this.insertaSenderoUseCaseProvider = insertaSenderoUseCaseProvider;
    this.getSenderoUseCaseProvider = getSenderoUseCaseProvider;
  }

  @Override
  public MapaViewModel get() {
    return newInstance(insertaSenderoUseCaseProvider.get(), getSenderoUseCaseProvider.get());
  }

  public static MapaViewModel_Factory create(
      Provider<InsertaSenderoUseCase> insertaSenderoUseCaseProvider,
      Provider<GetSenderoUseCase> getSenderoUseCaseProvider) {
    return new MapaViewModel_Factory(insertaSenderoUseCaseProvider, getSenderoUseCaseProvider);
  }

  public static MapaViewModel newInstance(InsertaSenderoUseCase insertaSenderoUseCase,
      GetSenderoUseCase getSenderoUseCase) {
    return new MapaViewModel(insertaSenderoUseCase, getSenderoUseCase);
  }
}
