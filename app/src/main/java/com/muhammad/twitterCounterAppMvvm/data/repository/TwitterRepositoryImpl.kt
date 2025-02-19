package com.muhammad.twitterCounterAppMvvm.data.repository

import com.muhammad.twitterCounterAppMvvm.data.restful.TwitterApiService
import com.muhammad.twitterCounterAppMvvm.domain.entities.query.TweetPayload
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TwitterRepositoryImpl @Inject constructor(
    private val apiService: TwitterApiService
) : TwitterRepository {

    override suspend fun postTweet(accessToken: String, tweetText: String): Boolean {
        val response = apiService.postTweet(
            authHeader = "Bearer $accessToken",
            tweetBody = TweetPayload(tweetText)
        )
        return response.isSuccessful
    }
}