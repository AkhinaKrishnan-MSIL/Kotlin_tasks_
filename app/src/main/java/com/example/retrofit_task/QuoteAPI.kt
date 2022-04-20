package com.example.retrofit_task
import retrofit2.Response
import retrofit2.http.GET

interface QuoteAPI {
    @GET("/quotes")
    suspend fun getQuotes() : Response<QuboleList>

}