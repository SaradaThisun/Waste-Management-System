package com.example.ecocollect.citizen;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;


public class TruckTrackingActivity extends AppCompatActivity {


    Button backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_truck_tracking);



        backBtn = findViewById(R.id.backBtn);



        backBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    TruckTrackingActivity.this,
                    CitizenHomeActivity.class
            );


            startActivity(intent);


        });


    }
}