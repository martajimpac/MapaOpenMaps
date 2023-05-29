package com.toools.mapa.domain.model;

import com.toools.mapa.data.PuntoRepository;
import com.toools.mapa.data.SenderoRepository;
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
public final class InsertaSenderoUseCase_Factory implements Factory<InsertaSenderoUseCase> {
  private final Provider<SenderoRepository> senderoRepositoryProvider;

  private final Provider<PuntoRepository> puntoRepositoryProvider;

  public InsertaSenderoUseCase_Factory(Provider<SenderoRepository> senderoRepositoryProvider,
      Provider<PuntoRepository> puntoRepositoryProvider) {
    this.senderoRepositoryProvider = senderoRepositoryProvider;
    this.puntoRepositoryProvider = puntoRepositoryProvider;
  }

  @Override
  public InsertaSenderoUseCase get() {
    return newInstance(senderoRepositoryProvider.get(), puntoRepositoryProvider.get());
  }

  public static InsertaSenderoUseCase_Factory create(
      Provider<SenderoRepository> senderoRepositoryProvider,
      Provider<PuntoRepository> puntoRepositoryProvider) {
    return new InsertaSenderoUseCase_Factory(senderoRepositoryProvider, puntoRepositoryProvider);
  }

  public static InsertaSenderoUseCase newInstance(SenderoRepository senderoRepository,
      PuntoRepository puntoRepository) {
    return new InsertaSenderoUseCase(senderoRepository, puntoRepository);
  }
}
