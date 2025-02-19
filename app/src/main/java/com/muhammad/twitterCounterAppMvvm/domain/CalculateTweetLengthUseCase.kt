package com.muhammad.twitterCounterAppMvvm.domain

class CalculateTweetLengthUseCase {
    fun execute(text: String): Int {
        return text.length
    }
}