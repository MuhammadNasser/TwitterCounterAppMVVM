package com.muhammad.twitterCounterAppMvvm.core

import com.muhammad.twitterCounterAppMvvm.domain.entities.remote.TweetResponse

sealed class TweetState {
    object Idle : TweetState()
    object Loading : TweetState()
    data class Success(val response: TweetResponse) : TweetState()
    data class Error(val message: String) : TweetState()
}