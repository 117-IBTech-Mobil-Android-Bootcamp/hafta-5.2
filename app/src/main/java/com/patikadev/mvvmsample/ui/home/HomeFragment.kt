package com.patikadev.mvvmsample.ui.home

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.patikadev.mvvmsample.R
import com.patikadev.mvvmsample.base.BaseFragment
import com.patikadev.mvvmsample.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<HomeViewModel,  FragmentHomeBinding>() {
    override var viewModel: HomeViewModel? = null

    override fun getLayoutID(): Int = R.layout.fragment_home

    override fun prepareView() {
       dataBinding.buttonNextFragment.setOnClickListener {
           findNavController().navigate(R.id.action_homeFragment_to_filmListFragment)
       }
    }

    override fun prepareViewModel() {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun shouldCheckInternetConnection() = false

    override fun observeLiveData() {
        //TODO("Not yet implemented")
    }


}