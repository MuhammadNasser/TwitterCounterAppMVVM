package com.muhammad.twitterCounterAppMvvm.domain.entities.query

import com.google.gson.annotations.SerializedName

data class TweetPayload(
    @SerializedName("text") val text: String
)
