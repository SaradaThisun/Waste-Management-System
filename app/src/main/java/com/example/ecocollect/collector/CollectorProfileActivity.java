package com.example.ecocollect.collector;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;
import com.example.ecocollect.authentication.LoginActivity;



public class CollectorProfileActivity extends AppCompatActivity {


    TextView collectorName;
    TextView vehicleNumber;
    TextView collectorPhone;


    Button editCollectorProfile;
    Button logoutCollector;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_collector_profile);



        // Connect XML components

        collectorName = findViewById(R.id.collectorName);

        vehicleNumber = findViewById(R.id.vehicleNumber);

        collectorPhone = findViewById(R.id.collectorPhone);



        editCollectorProfile = findViewById(R.id.editCollectorProfile);

        logoutCollector = findViewById(R.id.logoutCollector);



        // Temporary profile data
        // Later replace with database values

        collectorName.setText("Collector Name");

        vehicleNumber.setText(
                "Vehicle Number : WP ABC-1234"
        );

        collectorPhone.setText(
                "Phone : 07XXXXXXXX"
        );



        // Edit Profile button

        editCollectorProfile.setOnClickListener(v -> {


            Intent intent = new Intent(
                    CollectorProfileActivity.this,
                    EditCollectorProfileActivity.class
            );


            startActivity(intent);


        });



        // Logout button

        logoutCollector.setOnClickListener(v -> {


            Intent intent = new Intent(
                    CollectorProfileActivity.this,
                    LoginActivity.class
            );


            intent.setFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK |
                            Intent.FLAG_ACTIVITY_CLEAR_TASK
            );


            startActivity(intent);


        });


    }

}