package com.muhammad.twitterCounterAppMvvm.data.remote

import com.google.gson.annotations.SerializedName

data class TwitterUser(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("screen_name")
    val screenName: String,
    @SerializedName("profile_image_url_https")
    val profileImageUrl: String
)