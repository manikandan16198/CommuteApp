package com.example.commuteapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class FragmentOne : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fragmentone, container, false)
        val fragmentOne = view.findViewById<Button>(R.id.btn_1)

        fragmentOne.setOnClickListener{

            Navigation.findNavController(view).navigate(R.id.fragmenttwo)

        }
        return  view
    }


}