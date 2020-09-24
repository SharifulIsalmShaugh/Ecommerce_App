package com.shaugh.ecommerce.model

import com.google.gson.annotations.SerializedName

data class Product(
        @SerializedName("name")
        val title: String,

        @SerializedName("photo_url")
        val photoUrl: Int,

        //val price: Double
        val price: String
)