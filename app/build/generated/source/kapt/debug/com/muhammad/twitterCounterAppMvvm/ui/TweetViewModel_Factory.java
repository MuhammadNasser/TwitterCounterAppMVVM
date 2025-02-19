package com.muhammad.twitterCounterAppMvvm.ui;

import com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository;
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
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class TweetViewModel_Factory implements Factory<TweetViewModel> {
  private final Provider<TwitterRepository> twitterRepositoryProvider;

  public TweetViewModel_Factory(Provider<TwitterRepository> twitterRepositoryProvider) {
    this.twitterRepositoryProvider = twitterRepositoryProvider;
  }

  @Override
  public TweetViewModel get() {
    return newInstance(twitterRepositoryProvider.get());
  }

  public static TweetViewModel_Factory create(
      Provider<TwitterRepository> twitterRepositoryProvider) {
    return new TweetViewModel_Factory(twitterRepositoryProvider);
  }

  public static TweetViewModel newInstance(TwitterRepository twitterRepository) {
    return new TweetViewModel(twitterRepository);
  }
}
