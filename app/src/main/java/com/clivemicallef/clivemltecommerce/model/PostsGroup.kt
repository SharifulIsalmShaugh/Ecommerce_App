package com.shaugh.ecommerce.model

import com.google.gson.annotations.SerializedName

data class PostsGroup(
        @SerializedName("name")
        val title: String,

        @SerializedName("photo_url")
        val photoUrl: Int,

        //val price: Double
        val price: String
)