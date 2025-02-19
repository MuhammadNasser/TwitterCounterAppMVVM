package com.muhammad.twitterCounterAppMvvm.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muhammad.twitterCounterAppMvvm.core.TweetState
import com.muhammad.twitterCounterAppMvvm.data.repository.TwitterRepository
import com.muhammad.twitterCounterAppMvvm.domain.CalculateTweetLengthUseCase
import com.muhammad.twitterCounterAppMvvm.utils.getTwitterAccessToken
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TweetViewModel @Inject constructor(
    private val twitterRepository: TwitterRepository
) : ViewModel() {

    private val _tweetText = MutableStateFlow("")
    val tweetText: StateFlow<String> = _tweetText.asStateFlow()

    private val _charCount = MutableStateFlow(0)
    val charCount: StateFlow<Int> = _charCount.asStateFlow()

    private val _tweetStatus = MutableStateFlow<TweetState>(TweetState.Idle)
    val tweetStatus: StateFlow<TweetState> = _tweetStatus.asStateFlow()

    fun onTweetTextChanged(newText: String) {
        _tweetText.value = newText
        _charCount.value = CalculateTweetLengthUseCase().execute(newText)
    }

    fun getSecureToken(context: Context): String {
        return getTwitterAccessToken(context)
    }

    fun postTweet(accessToken: String, tweet: String) {
        if (_charCount.value in 1..280) {
            viewModelScope.launch {
                _tweetStatus.value = TweetState.Loading
                try {
                    val response = twitterRepository.postTweet(accessToken, tweet)

                    if (response != null) {
                        _tweetStatus.value = TweetState.Success(response)
                    } else {
                        _tweetStatus.value = TweetState.Error("Failed to post tweet")
                    }
                } catch (e: Exception) {
                    _tweetStatus.value = TweetState.Error(e.message ?: "Unknown error")
                }
            }
        }
    }
}