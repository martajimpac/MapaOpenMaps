package com.toools.mapa.data;

import com.toools.mapa.data.database.dao.SenderoDao;
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
public final class SenderoRepository_Factory implements Factory<SenderoRepository> {
  private final Provider<SenderoDao> senderoDaoProvider;

  public SenderoRepository_Factory(Provider<SenderoDao> senderoDaoProvider) {
    this.senderoDaoProvider = senderoDaoProvider;
  }

  @Override
  public SenderoRepository get() {
    return newInstance(senderoDaoProvider.get());
  }

  public static SenderoRepository_Factory create(Provider<SenderoDao> senderoDaoProvider) {
    return new SenderoRepository_Factory(senderoDaoProvider);
  }

  public static SenderoRepository newInstance(SenderoDao senderoDao) {
    return new SenderoRepository(senderoDao);
  }
}
