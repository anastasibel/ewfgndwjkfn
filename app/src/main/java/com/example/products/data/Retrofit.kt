package com.example.products.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://127.0.0.1:8080/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}