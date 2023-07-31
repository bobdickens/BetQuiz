package com.example.betquiz.presentation.levels.startFragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.betquiz.R
import com.example.betquiz.data.MAIN
import com.example.betquiz.databinding.StartFragmentBinding


class Start_Fragment : Fragment() {
    private lateinit var inAnimation: Animation
    lateinit var binding: StartFragmentBinding

    companion object {
        fun newInstance() = Start_Fragment()
    }

    private lateinit var viewModel: Lvl1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = StartFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Lvl1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        inAnimation = AnimationUtils.loadAnimation(context, R.anim.alpha_in)
        binding.completeText.startAnimation(inAnimation)

        binding.btnStart.setOnClickListener {
            MAIN.navController.navigate(R.id.action_lvl1_Fragment_to_fullLevelsFragment) //странно, что не изменилось название акции. в идеале должно быть start_fragment to full levels fragment. в нав графе не поменялось название после ренейма фрагмента. но все работает
        }
    }

}