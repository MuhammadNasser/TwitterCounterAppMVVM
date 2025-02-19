package com.muhammad.twitterCounterAppMvvm.data.repository

import com.muhammad.twitterCounterAppMvvm.domain.entities.remote.TweetResponse

interface TwitterRepository {
    suspend fun postTweet(accessToken: String, tweetText: String): TweetResponse?
}