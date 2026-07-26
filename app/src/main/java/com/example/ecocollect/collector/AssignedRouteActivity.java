package com.example.ecocollect.collector;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecocollect.R;


public class AssignedRouteActivity extends AppCompatActivity {


    RecyclerView routeRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_assigned_route);



        // Connect RecyclerView

        routeRecycler = findViewById(R.id.routeRecycler);



        // Set vertical list

        routeRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );


        /*
          Later:

          RouteAdapter adapter =
              new RouteAdapter(routeList);

          routeRecycler.setAdapter(adapter);


          Data example:

          House No 25 - Completed
          Main Street - Pending
          Green Road - Pending

        */


    }

}