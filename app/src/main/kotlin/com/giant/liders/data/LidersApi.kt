package com.giant.liders.data

import com.giant.liders.data.model.ArticlesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface LidersApi {

    @GET("")
    suspend fun getTopHeadlines(
        
    ): ArticlesResponse

}