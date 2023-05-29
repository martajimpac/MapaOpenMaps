package com.toools.mapa.data;

import com.toools.mapa.data.database.dao.PuntoDao;
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
public final class PuntoRepository_Factory implements Factory<PuntoRepository> {
  private final Provider<PuntoDao> puntoDaoProvider;

  public PuntoRepository_Factory(Provider<PuntoDao> puntoDaoProvider) {
    this.puntoDaoProvider = puntoDaoProvider;
  }

  @Override
  public PuntoRepository get() {
    return newInstance(puntoDaoProvider.get());
  }

  public static PuntoRepository_Factory create(Provider<PuntoDao> puntoDaoProvider) {
    return new PuntoRepository_Factory(puntoDaoProvider);
  }

  public static PuntoRepository newInstance(PuntoDao puntoDao) {
    return new PuntoRepository(puntoDao);
  }
}
