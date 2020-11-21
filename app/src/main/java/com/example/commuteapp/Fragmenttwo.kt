package com.example.commuteapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class FragmentTwo : Fragment() {

    private lateinit var mMap: GoogleMap
    private var mapReady = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_fragmenttwo, container, false)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync { googleMap ->
            mMap = googleMap
            mapReady = true

            val sydeny = LatLng(-34.0, 151.0)
            mMap.addMarker(
                MarkerOptions()
                    .position(sydeny)
                    .title("Marker in Sydeney")
            )
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydeny))
        }
        return rootView

    }

}










