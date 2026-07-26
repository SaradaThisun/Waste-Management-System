package com.example.ecocollect.collector;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;



public class CollectorHomeActivity extends AppCompatActivity {


    TextView completedCount;

    Button startRouteBtn;
    Button viewHouseholdsBtn;
    Button notificationBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_collector_home);



        // Connect XML components

        completedCount = findViewById(R.id.completedCount);


        startRouteBtn = findViewById(R.id.startRouteBtn);

        viewHouseholdsBtn = findViewById(R.id.viewHouseholdsBtn);

        notificationBtn = findViewById(R.id.notificationBtn);



        // Temporary value
        // Later update from database

        completedCount.setText("0 / 20 Houses Completed");



        // Start Route Button

        startRouteBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    CollectorHomeActivity.this,
                    AssignedRouteActivity.class
            );


            startActivity(intent);


        });



        // View Households Button

        viewHouseholdsBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    CollectorHomeActivity.this,
                    HouseholdsActivity.class
            );


            startActivity(intent);


        });



        // Notification Button

        notificationBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    CollectorHomeActivity.this,
                    CollectorNotificationsActivity.class
            );


            startActivity(intent);


        });


    }

}