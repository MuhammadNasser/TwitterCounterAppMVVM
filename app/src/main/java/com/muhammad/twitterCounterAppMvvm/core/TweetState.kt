package com.muhammad.twitterCounterAppMvvm.core

sealed class TweetState {
    data object Idle : TweetState()
    data object Loading : TweetState()
    data object Success : TweetState()
    data class Error(val message: String) : TweetState()
}