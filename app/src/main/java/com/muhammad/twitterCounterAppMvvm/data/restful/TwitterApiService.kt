package com.muhammad.twitterCounterAppMvvm.data.restful

import com.muhammad.twitterCounterAppMvvm.domain.entities.remote.TweetResponse
import com.muhammad.twitterCounterAppMvvm.domain.entities.query.TweetPayload
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface TwitterApiService {
    @Headers("Content-Type: application/json")
    @POST("tweets")
    suspend fun postTweet(
        @Header("Authorization") authHeader: String,
        @Body tweetBody: TweetPayload
    ): Response<TweetResponse>
}