package com.muhammad.twitterCounterAppMvvm.data.repository

import android.util.Log
import com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TwitterRepositoryImpl @Inject constructor(
    private val apiService: TwitterApiService
) : TwitterRepository {
    override suspend fun postTweet(tweet: String) {
        try {
            val response = apiService.postTweet(tweet)
            if (!response.isSuccessful) throw Exception("Failed to post tweet")
        } catch (e: Exception) {
            Log.e("TwitterRepository", "Error posting tweet: ${e.message}")
        }
    }
}