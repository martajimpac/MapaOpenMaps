package com.toools.mapa.di;

import com.toools.mapa.data.database.SenderoDatabase;
import com.toools.mapa.data.database.dao.SenderoDao;
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
public final class RoomModule_ProvideSenderoDaoFactory implements Factory<SenderoDao> {
  private final Provider<SenderoDatabase> dbProvider;

  public RoomModule_ProvideSenderoDaoFactory(Provider<SenderoDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public SenderoDao get() {
    return provideSenderoDao(dbProvider.get());
  }

  public static RoomModule_ProvideSenderoDaoFactory create(Provider<SenderoDatabase> dbProvider) {
    return new RoomModule_ProvideSenderoDaoFactory(dbProvider);
  }

  public static SenderoDao provideSenderoDao(SenderoDatabase db) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideSenderoDao(db));
  }
}
