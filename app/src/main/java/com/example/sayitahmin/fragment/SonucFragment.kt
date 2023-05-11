package com.example.sayitahmin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.sayitahmin.R
import com.example.sayitahmin.databinding.FragmentSonucBinding


class SonucFragment : Fragment() {

    private lateinit var binding : FragmentSonucBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSonucBinding.inflate(inflater,container,false)
        val view = binding.root

        val bundle : SonucFragmentArgs by navArgs()

        val gelenSonuc = bundle.sonuc

        if (gelenSonuc){

            binding.imageViewSonuc.setImageResource(R.drawable.mutlu_resim)
            binding.textViewSonuc.text="KAZANDINIZ"

        }else{

            binding.imageViewSonuc.setImageResource(R.drawable.uzgun_resim)
            binding.textViewSonuc.text="KAYBETTİNİZ"

        }


        binding.buttonTekrarOyna.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.anasayfayaGecis)

        }

        return view
    }
}