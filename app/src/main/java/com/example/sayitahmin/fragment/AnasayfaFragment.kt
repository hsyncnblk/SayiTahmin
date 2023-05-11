package com.example.sayitahmin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayitahmin.R
import com.example.sayitahmin.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding : FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentAnasayfaBinding.inflate(inflater,container,false)
        val view = binding.root


        binding.buttonBasla.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.tahminEkraninaGecis)

        }



        return view



    }
}