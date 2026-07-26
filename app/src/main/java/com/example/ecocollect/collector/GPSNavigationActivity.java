package com.example.ecocollect.collector;


import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;



public class GPSNavigationActivity extends AppCompatActivity {


    FrameLayout mapView;

    Button startNavigation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gpsnavigation);



        // Connect XML components

        mapView = findViewById(R.id.mapView);

        startNavigation = findViewById(R.id.startNavigation);



        // Start Navigation Button

        startNavigation.setOnClickListener(v -> {



            Toast.makeText(
                    GPSNavigationActivity.this,
                    "GPS Navigation Started",
                    Toast.LENGTH_SHORT
            ).show();



            /*

            Later:

            1. Get collector current location
            2. Load assigned household locations
            3. Display route on Google Maps
            4. Start turn-by-turn navigation

            */


        });


    }

}