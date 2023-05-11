package com.example.sayitahmin.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayitahmin.R
import com.example.sayitahmin.databinding.FragmentTahminBinding
import kotlin.random.Random

class TahminFragment : Fragment() {

    private lateinit var binding: FragmentTahminBinding

    private var rastgeleSayi =0
    private var sayac=5

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTahminBinding.inflate(inflater,container,false)
        val view = binding.root

        rastgeleSayi = Random.nextInt(101) // 0-101 arasında sayı üretir

        Log.e("Rastegele sayı ",rastgeleSayi.toString())


        binding.buttonTahminEt.setOnClickListener {

            sayac = sayac-1

            val tahmin = binding.editTextGirdi.text.toString().toInt()

            if (tahmin==rastgeleSayi){

                val gecis = TahminFragmentDirections.sonucEkraninaGecis(true)

                Navigation.findNavController(it).navigate(gecis)

                return@setOnClickListener

            }
            if (tahmin<rastgeleSayi){

                binding.textViewYardim.text="Arttır"
                binding.textViewKalanHak.text="Kalan Hak : $sayac"

            }
            if (tahmin>rastgeleSayi){

                binding.textViewYardim.text="Azalt"
                binding.textViewKalanHak.text="Kalan Hak : $sayac"

            }
            if (sayac==0){


                val gecis = TahminFragmentDirections.sonucEkraninaGecis(false)

                Navigation.findNavController(it).navigate(gecis)

            }

            binding.editTextGirdi.setText("")

        }
        return view

    }
}