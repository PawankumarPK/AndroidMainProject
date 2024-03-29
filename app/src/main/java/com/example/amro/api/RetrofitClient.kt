package com.example.amro.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    lateinit var apiService: ApiService
    lateinit var rosService: ApiService

    fun init(baseURLs: String) {
        val retrofitInstance = Retrofit.Builder()
                .baseUrl(baseURLs)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        apiService = retrofitInstance.create(ApiService::class.java)
    }

    fun initRosAPI(baseURLs: String) {
        val retrofitInstance = Retrofit.Builder()
                .baseUrl(baseURLs)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        rosService = retrofitInstance.create(ApiService::class.java)
    }


}

