package com.muhammad.twitterCounterAppMvvm.domain

import com.twitter.twittertext.TwitterTextParser

class CalculateTweetLengthUseCase {
    fun execute(text: String): Int {
        val tweetValidation = TwitterTextParser.parseTweet(text)
        return tweetValidation.weightedLength
    }
}