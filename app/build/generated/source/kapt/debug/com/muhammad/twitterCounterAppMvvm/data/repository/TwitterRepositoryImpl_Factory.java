package com.muhammad.twitterCounterAppMvvm.data.repository;

import com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class TwitterRepositoryImpl_Factory implements Factory<TwitterRepositoryImpl> {
  private final Provider<TwitterApiService> apiServiceProvider;

  public TwitterRepositoryImpl_Factory(Provider<TwitterApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public TwitterRepositoryImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static TwitterRepositoryImpl_Factory create(
      Provider<TwitterApiService> apiServiceProvider) {
    return new TwitterRepositoryImpl_Factory(apiServiceProvider);
  }

  public static TwitterRepositoryImpl newInstance(TwitterApiService apiService) {
    return new TwitterRepositoryImpl(apiService);
  }
}
