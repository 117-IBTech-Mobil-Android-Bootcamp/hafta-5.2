package com.patikadev.mvvmsample.ui.filmlist

import androidx.lifecycle.ViewModelProvider
import com.patikadev.mvvmsample.R
import com.patikadev.mvvmsample.base.BaseFragment
import com.patikadev.mvvmsample.databinding.FragmentMovieListBinding
import com.patikadev.mvvmsample.ui.filmlist.adapter.MovieListAdapter


class MovieListFragment : BaseFragment<MovieListViewModel, FragmentMovieListBinding> (){
    override var viewModel: MovieListViewModel?= null


    override fun getLayoutID() = R.layout.fragment_movie_list

    override fun prepareView() {
//layoutmanager
        //orientation
    }

    override fun prepareViewModel() {
        viewModel = ViewModelProvider(this).get(MovieListViewModel::class.java)

    }

    override fun observeLiveData() {
      viewModel?.moviesResponse?.observe(this, {

          dataBinding.movieListResponse = it
          dataBinding.executePendingBindings()

          dataBinding.recyclerView.adapter = MovieListAdapter(it.getList())


      })
    }



}