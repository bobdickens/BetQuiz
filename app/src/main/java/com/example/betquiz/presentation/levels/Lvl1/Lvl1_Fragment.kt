package com.example.betquiz.presentation.levels.Lvl1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betquiz.R

class Lvl1_Fragment : Fragment() {

    companion object {
        fun newInstance() = Lvl1_Fragment()
    }

    private lateinit var viewModel: Lvl1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lvl1_, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Lvl1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}