package com.muhammad.twitterCounterAppMvvm.di;

import com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class NetworkModule_ProvideTwitterApiFactory implements Factory<TwitterApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideTwitterApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public TwitterApiService get() {
    return provideTwitterApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideTwitterApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideTwitterApiFactory(retrofitProvider);
  }

  public static TwitterApiService provideTwitterApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideTwitterApi(retrofit));
  }
}
