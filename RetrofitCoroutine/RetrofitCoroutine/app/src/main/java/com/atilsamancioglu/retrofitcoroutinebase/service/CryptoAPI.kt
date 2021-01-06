package com.atilsamancioglu.retrofitcoroutinebase.service

import com.atilsamancioglu.retrofitcoroutinebase.model.CryptoModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface CryptoAPI {
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    suspend fun getData(): Response<List<CryptoModel>>

}