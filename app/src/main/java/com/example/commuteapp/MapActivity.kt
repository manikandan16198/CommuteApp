package com.example.commuteapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MapActivity : AppCompatActivity() {

    private lateinit var etSource: EditText
    private lateinit var etDestination:EditText
    private lateinit var btTrack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        etSource = findViewById(R.id.et_source)
        etDestination = findViewById(R.id.et_destination)
        btTrack = findViewById(R.id.bt_track)

        btTrack.setOnClickListener {
            val sSource = etSource.text.toString().trim()
            val sDestination = etDestination.text.toString().trim()
            if (sSource == "" && sDestination == "") {
                Toast.makeText(applicationContext, "Enter both location", Toast.LENGTH_SHORT).show()
            } else {
                DisplayTrack(sSource, sDestination)
            }
        }
    }
    private fun DisplayTrack(sSource:String, sDestination:String) {
        try
        {
            val uri = Uri.parse("https://www.google.co.in/maps/dir/$sSource /$sDestination")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.google.android.apps.maps")
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
        catch (e: ActivityNotFoundException) {
            val uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.mapslite")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}

