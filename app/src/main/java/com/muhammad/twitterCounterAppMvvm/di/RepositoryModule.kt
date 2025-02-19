package com.muhammad.twitterCounterAppMvvm.di

import com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository
import com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindTwitterRepository(
        twitterRepositoryImpl: TwitterRepositoryImpl
    ): TwitterRepository
}