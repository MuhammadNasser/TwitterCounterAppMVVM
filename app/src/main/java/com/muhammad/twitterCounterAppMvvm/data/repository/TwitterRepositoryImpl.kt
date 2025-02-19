package com.muhammad.twitterCounterAppMvvm.data.repository

import android.util.Log
import com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService
import com.muhammad.twitterCounterAppMvvm.domain.entities.query.TweetPayload
import com.muhammad.twitterCounterAppMvvm.domain.entities.remote.TweetResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TwitterRepositoryImpl @Inject constructor(
    private val apiService: TwitterApiService
) : TwitterRepository {

    override suspend fun postTweet(accessToken: String, tweetText: String): TweetResponse? {
        return try {
            Log.d(
                "TwitterRepository",
                "Tweet sent: token: Bearer $accessToken, tweet: $tweetText"
            )
            val response = apiService.postTweet(
                authHeader = "Bearer $accessToken",
                tweetBody = TweetPayload(tweetText)
            )

            if (response.isSuccessful) {
                Log.d("TwitterRepository", "Tweet posted: ${response.body()}")
                response.body()
            } else {
                Log.e("TwitterRepository", "Error: ${response.errorBody()?.string()}")
                null
            }
        } catch (e: Exception) {
            Log.e("TwitterRepository", "Exception: ${e.message}")
            null
        }
    }
}