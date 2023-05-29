package com.toools.mapa.di;

import android.content.Context;
import com.toools.mapa.data.database.SenderoDatabase;
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
public final class RoomModule_ProvideRoomSenderoFactory implements Factory<SenderoDatabase> {
  private final Provider<Context> contextProvider;

  public RoomModule_ProvideRoomSenderoFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SenderoDatabase get() {
    return provideRoomSendero(contextProvider.get());
  }

  public static RoomModule_ProvideRoomSenderoFactory create(Provider<Context> contextProvider) {
    return new RoomModule_ProvideRoomSenderoFactory(contextProvider);
  }

  public static SenderoDatabase provideRoomSendero(Context context) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideRoomSendero(context));
  }
}
