package com.giant.liders.kotlinoverview.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.create

object RetrofitProvider {

    private val contentType: MediaType = MediaType.get("application/json")

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(Json {
            ignoreUnknownKeys = true
            isLenient = true
            allowSpecialFloatingPointValues = true
            encodeDefaults = false
        }.asConverterFactory(contentType))
        .build()

    val LidersApi = retrofit.create<LidersApi>()

}