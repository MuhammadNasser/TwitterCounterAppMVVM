package com.muhammad.twitterCounterAppMvvm.di;

import com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/muhammad/twitterCounterAppMvvm/di/NetworkModule;", "", "()V", "provideRetrofit", "Lretrofit2/Retrofit;", "provideTwitterApi", "Lcom/muhammad/twitterCounterAppMvvm/data/restful/TwitterApiService;", "retrofit", "app_debug"})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.muhammad.twitterCounterAppMvvm.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService provideTwitterApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}