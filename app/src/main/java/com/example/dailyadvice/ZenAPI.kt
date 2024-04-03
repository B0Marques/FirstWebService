package com.example.dailyadvice

import retrofit2.http.GET

interface ZenAPI {
    @GET("api/today")
    suspend fun getDailyQuote(): List<Quote>
}