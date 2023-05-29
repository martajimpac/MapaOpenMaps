package com.toools.mapa.di;

import android.content.Context;
import com.toools.mapa.data.database.PuntoDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProvideRoomPuntoFactory implements Factory<PuntoDatabase> {
  private final Provider<Context> contextProvider;

  public RoomModule_ProvideRoomPuntoFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PuntoDatabase get() {
    return provideRoomPunto(contextProvider.get());
  }

  public static RoomModule_ProvideRoomPuntoFactory create(Provider<Context> contextProvider) {
    return new RoomModule_ProvideRoomPuntoFactory(contextProvider);
  }

  public static PuntoDatabase provideRoomPunto(Context context) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideRoomPunto(context));
  }
}
