package com.example.ecocollect.citizen;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;


public class ReportDumpingActivity extends AppCompatActivity {


    Button submitBtn;
    Button backBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_report_dumping);



        submitBtn = findViewById(R.id.submitBtn);

        backBtn = findViewById(R.id.backBtn);



        submitBtn.setOnClickListener(v -> {


            // Later connect Firebase/database here

        });



        backBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    ReportDumpingActivity.this,
                    CitizenHomeActivity.class
            );


            startActivity(intent);


        });


    }
}