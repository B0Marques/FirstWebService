package com.example.dailyadvice

import com.google.gson.annotations.SerializedName

data class Quote(
    @SerializedName("q")
    val quote: String,
    @SerializedName("a")
    val author: String
)
