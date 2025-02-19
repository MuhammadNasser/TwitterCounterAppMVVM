package com.muhammad.twitterCounterAppMvvm.di;

import com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository;
import com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/muhammad/twitterCounterAppMvvm/di/RepositoryModule;", "", "()V", "bindTwitterRepository", "Lcom/muhammad/twitterCounterAppMvvm/data/repository/TwitterRepository;", "twitterRepositoryImpl", "Lcom/muhammad/twitterCounterAppMvvm/data/repository/TwitterRepositoryImpl;", "app_debug"})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository bindTwitterRepository(@org.jetbrains.annotations.NotNull()
    com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepositoryImpl twitterRepositoryImpl);
}