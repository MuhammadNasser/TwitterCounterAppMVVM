package com.muhammad.twitterCounterAppMvvm.data.repository

interface TwitterRepository {
    suspend fun postTweet(tweet: String)
}