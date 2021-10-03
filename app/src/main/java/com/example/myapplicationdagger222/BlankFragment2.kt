package com.example.myapplicationdagger222

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationdagger222.databinding.FragmentBlank2Binding
import com.example.myapplicationdagger222.databinding.FragmentBlankBinding


class BlankFragment2 : Fragment() {
    lateinit var viewModel:CatViewModel
    lateinit var binding: FragmentBlank2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlank2Binding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(CatViewModel::class.java)
       binding.editTextText.addTextChangedListener(object : TextWatcher{
           override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

           }

           override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

           }

           override fun afterTextChanged(p0: Editable?) {
            viewModel.catLiveData.value = Cat(p0.toString(),0)
           }

       })

        return binding.root
    }



}