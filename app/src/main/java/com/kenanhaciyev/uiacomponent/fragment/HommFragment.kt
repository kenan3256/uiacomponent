package com.kenanhaciyev.uiacomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kenanhaciyev.uiacomponent.R
import com.kenanhaciyev.uiacomponent.databinding.FragmentDetalisBinding
import com.kenanhaciyev.uiacomponent.databinding.FragmentHommBinding


class HommFragment : Fragment() {

    private lateinit var binding: FragmentHommBinding

    fun openProductPage(){
        var action = HommFragmentDirections.actionMenuToAdd()
        findNavController().navigate(action)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentHommBinding.inflate(inflater)

        binding.btnHomm.setOnClickListener{
            openProductPage()
        }
        return binding.root
    }

}