package com.muhammad.twitterCounterAppMvvm.domain.entities.remote

import com.google.gson.annotations.SerializedName

data class TweetResponse(
    @SerializedName("data") val data: TweetData
)

data class TweetData(
    @SerializedName("id") val id: String,
    @SerializedName("text") val text: String
)
