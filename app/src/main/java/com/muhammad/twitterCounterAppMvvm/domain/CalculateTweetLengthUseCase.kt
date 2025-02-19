package com.muhammad.twitterCounterAppMvvm.domain

class CalculateTweetLengthUseCase {
    fun execute(text: String): Int {
        return text.length // Modify to apply Twitter's actual rules
    }
}