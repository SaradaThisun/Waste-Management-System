package com.example.ecocollect.citizen;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;


public class CollectionScheduleActivity extends AppCompatActivity {


    Button backBtn;

    CalendarView calendar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_collection_schedule);



        // Connect XML components

        backBtn = findViewById(R.id.backBtn);

        calendar = findViewById(R.id.calendar);



        // Back button navigation

        backBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    CollectionScheduleActivity.this,
                    CitizenHomeActivity.class
            );


            startActivity(intent);


        });



        // Calendar date selection

        calendar.setOnDateChangeListener(
                (view, year, month, dayOfMonth) -> {



                    /*
                      Later connect this with database.

                      Example:

                      Selected Date:
                      2026/07/27

                      Show collection schedule
                    */


                });


    }

}