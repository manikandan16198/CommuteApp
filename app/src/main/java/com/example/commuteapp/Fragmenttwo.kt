package com.example.commuteapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.google.android.gms.dynamic.SupportFragmentWrapper
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class FragmentTwo : Fragment() {

    lateinit var mapFragment: SupportMapFragment
    lateinit var googleMap: GoogleMap
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmenttwo, container, false)
    mapFragment = childFragmentManager.findFragmentById(R.id.map_1) as SupportMapFragment
     mapFragment.getMapAsync(OnMapReadyCallback {
         googleMap = it

         val location1 = LatLng(13.03,77.60)
         googleMap.addMarker(MarkerOptions().position(location1).title("My Location"))
         googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1,10f))

     })

    }

}










