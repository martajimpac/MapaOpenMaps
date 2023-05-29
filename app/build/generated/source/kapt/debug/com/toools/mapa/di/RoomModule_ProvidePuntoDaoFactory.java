package com.toools.mapa.di;

import com.toools.mapa.data.database.PuntoDatabase;
import com.toools.mapa.data.database.dao.PuntoDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RoomModule_ProvidePuntoDaoFactory implements Factory<PuntoDao> {
  private final Provider<PuntoDatabase> dbProvider;

  public RoomModule_ProvidePuntoDaoFactory(Provider<PuntoDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public PuntoDao get() {
    return providePuntoDao(dbProvider.get());
  }

  public static RoomModule_ProvidePuntoDaoFactory create(Provider<PuntoDatabase> dbProvider) {
    return new RoomModule_ProvidePuntoDaoFactory(dbProvider);
  }

  public static PuntoDao providePuntoDao(PuntoDatabase db) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.providePuntoDao(db));
  }
}
