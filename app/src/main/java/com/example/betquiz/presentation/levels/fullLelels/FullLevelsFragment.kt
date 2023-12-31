package com.example.betquiz.presentation.levels.fullLelels

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.betquiz.R
import com.example.betquiz.data.MAIN
import com.example.betquiz.databinding.FragmentFullLevelsBinding
import com.example.betquiz.databinding.FragmentLvl1Binding

class FullLevelsFragment : Fragment() {
    lateinit var binding: FragmentFullLevelsBinding

    companion object {
        fun newInstance() = FullLevelsFragment()
    }

    private lateinit var viewModel: FullLevelsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFullLevelsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FullLevelsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnlvl1.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fullLevelsFragment_to_lvl1Fragment)
        }
    }

}