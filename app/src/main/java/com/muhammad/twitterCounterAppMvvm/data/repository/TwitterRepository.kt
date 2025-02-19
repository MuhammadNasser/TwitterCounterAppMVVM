package com.muhammad.twitterCounterAppMvvm.data.repository

interface TwitterRepository {
    suspend fun postTweet(accessToken: String, tweetText: String): Boolean
}