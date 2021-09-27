package com.patikadev.mvvmsample.network

import com.patikadev.mvvmsample.network.response.MovieListResponse
import retrofit2.Call
import retrofit2.http.*

interface MovieAPI {

    @GET("top_rated")
    fun getTopRatedMovies(@Query("api_key") apikey : String) : Call<MovieListResponse>


}