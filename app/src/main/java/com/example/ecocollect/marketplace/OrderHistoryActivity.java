package com.example.ecocollect.marketplace;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecocollect.R;


public class OrderHistoryActivity extends AppCompatActivity {


    RecyclerView orderRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_order_history);



        // Connect RecyclerView

        orderRecycler = findViewById(R.id.orderRecycler);



        // Set RecyclerView layout

        orderRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        /*
          Later we will add:

          OrderAdapter adapter = new OrderAdapter(orderList);

          orderRecycler.setAdapter(adapter);

          Data will come from Firebase/MySQL backend.

        */


    }

}