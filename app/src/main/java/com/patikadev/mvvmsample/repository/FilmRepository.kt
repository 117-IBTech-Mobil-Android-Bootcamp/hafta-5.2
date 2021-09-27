package com.patikadev.mvvmsample.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.patikadev.deneme1.service.ServiceConnector
import com.patikadev.mvvmsample.network.BaseCallBack
import com.patikadev.mvvmsample.network.response.MovieListResponse
import retrofit2.Call

class FilmRepository {

    val onMoviesFetched = MutableLiveData<MovieListResponse>()

    fun getAllMovies(apiKey : String){

        ServiceConnector.restInterface.getTopRatedMovies(apiKey).enqueue(object  : BaseCallBack<MovieListResponse>(){
            override fun onSuccess(data: MovieListResponse) {
               onMoviesFetched.postValue(data)
            }
        })
    }
}