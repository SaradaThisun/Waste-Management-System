package com.example.ecocollect.citizen;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecocollect.R;



public class CommunityEventsActivity extends AppCompatActivity {


    RecyclerView eventRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_community_events);



        // Connect RecyclerView

        eventRecycler = findViewById(R.id.eventRecycler);



        // Display events vertically

        eventRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        /*

        Later we can add:

        EventAdapter adapter =
                new EventAdapter(eventList);

        eventRecycler.setAdapter(adapter);


        Example events:

        🌱 Beach Cleanup Campaign
        🌳 Tree Planting Event
        ♻ Recycling Awareness Program

        */


    }

}