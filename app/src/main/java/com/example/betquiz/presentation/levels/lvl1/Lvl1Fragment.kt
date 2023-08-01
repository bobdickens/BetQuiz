package com.example.betquiz.presentation.levels.lvl1

import android.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.betquiz.R
import com.example.betquiz.databinding.FragmentLvl1Binding

class Lvl1Fragment : Fragment() {
    lateinit var binding: FragmentLvl1Binding

    companion object {
        fun newInstance() = Lvl1Fragment()
    }

    private lateinit var viewModel: Lvl1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLvl1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Lvl1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        alertDialog()
    }

    private fun alertDialog(){

        val builder = AlertDialog.Builder(context)


        val custom: View = layoutInflater.inflate(R.layout.lvl1allertdialog_fragment, null)
        builder.setView(custom)

        val dialog = builder.create()
        val yesbtn = custom.findViewById<Button>(R.id.btnYes)
        yesbtn.setOnClickListener {
            Toast.makeText(context, "CORRECT!", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        dialog.show()

    }

}