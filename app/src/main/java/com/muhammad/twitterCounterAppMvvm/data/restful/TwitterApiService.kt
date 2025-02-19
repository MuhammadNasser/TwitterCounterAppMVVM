package com.muhammad.twitterCounterAppMvvm.data.restful

import com.muhammad.twitterCounterAppMvvm.data.remote.TweetResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface TwitterApiService {
    @POST("statuses/update.json")
    @FormUrlEncoded
    suspend fun postTweet(@Field("status") status: String): Response<TweetResponse>
}