package com.kenanhaciyev.uiacomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kenanhaciyev.uiacomponent.R
import com.kenanhaciyev.uiacomponent.databinding.FragmentDetalisBinding


class DetalisFragment : Fragment() {

private lateinit var binding: FragmentDetalisBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentDetalisBinding.inflate(inflater)

        return binding.root





    }




}