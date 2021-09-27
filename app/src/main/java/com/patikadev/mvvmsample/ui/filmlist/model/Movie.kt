package com.patikadev.mvvmsample.ui.filmlist.model

import com.google.gson.annotations.SerializedName

data class Movie(
    val title : String,
    val release_date : String,
    val vote_average : Double,
    val vote_count : Int
)