package com.example.ecocollect.collector;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecocollect.R;



public class HouseholdsActivity extends AppCompatActivity {


    RecyclerView houseRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_households);



        // Connect RecyclerView

        houseRecycler = findViewById(R.id.houseRecycler);



        // Display households vertically

        houseRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        /*

        Later:

        Create:

        Household.java
        HouseholdAdapter.java
        household_item.xml


        Example data:

        House No: 101
        Resident: John
        Status: Collected


        */


    }

}