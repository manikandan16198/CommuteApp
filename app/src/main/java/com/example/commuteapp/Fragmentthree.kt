package com.example.commuteapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class FragmentThree : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fragmentthree, container, false)
        val fragmentThree = view.findViewById<Button>(R.id.btn_3)

        fragmentThree.setOnClickListener{

            Navigation.findNavController(view).navigate(R.id.fragmentone)
        }
        return  view
    }


}