package com.kenanhaciyev.uiacomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kenanhaciyev.uiacomponent.R
import com.kenanhaciyev.uiacomponent.databinding.FragmentAddBinding
import com.kenanhaciyev.uiacomponent.databinding.FragmentHommBinding


class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding=FragmentAddBinding.inflate(inflater)
      return binding.root
    }


    }
