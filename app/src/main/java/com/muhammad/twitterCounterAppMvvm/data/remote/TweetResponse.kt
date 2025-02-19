package com.muhammad.twitterCounterAppMvvm.data.remote

import com.google.gson.annotations.SerializedName

data class TweetResponse(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("id")
    val id: Long,
    @SerializedName("id_str")
    val idStr: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("user")
    val user: TwitterUser
)
