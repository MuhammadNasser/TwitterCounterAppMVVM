package com.muhammad.twitterCounterAppMvvm.di

import com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.twitter.com/2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideTwitterApi(retrofit: Retrofit): TwitterApiService =
        retrofit.create(TwitterApiService::class.java)

}
