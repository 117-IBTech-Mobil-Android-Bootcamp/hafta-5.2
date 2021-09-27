package com.patikadev.mvvmsample.ui.filmlist.model

import com.patikadev.mvvmsample.network.response.MovieListResponse

data class MovieListViewStateModel(val moviesResponse: MovieListResponse){

    fun getResults() : String = "total count ${moviesResponse.totalResults}"
    fun getTotalPage() : String = "total page ${moviesResponse.totalPage}"
    fun getList() : List<Movie> = moviesResponse.movies
}
