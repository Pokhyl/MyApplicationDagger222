package com.example.myapplicationdagger222

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplicationdagger222.databinding.FragmentBlankBinding
import javax.inject.Inject


class BlankFragment : Fragment() {

lateinit var binding: FragmentBlankBinding
lateinit @Inject var cat: Cat
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBlankBinding.inflate(inflater, container, false)
        binding.textView.text =cat.name
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_blank, container, false)
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as MainActivity).myComponent.inject(this)


    }

    }
