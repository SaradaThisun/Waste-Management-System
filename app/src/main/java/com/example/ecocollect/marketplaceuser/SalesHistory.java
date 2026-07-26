package com.example.ecocollect.marketplaceuser;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ecocollect.R;



public class SalesHistory extends AppCompatActivity {


    RecyclerView purchaseRecycler;

    Button backBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_sales_history);



        purchaseRecycler = findViewById(R.id.purchaseRecycler);

        backBtn = findViewById(R.id.backBtn);



        // RecyclerView setup

        purchaseRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        // Back button

        backBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    SalesHistory.this,
                    Dashboard.class
            );


            startActivity(intent);


            finish();


        });



        /*

        Later RecyclerView will show:


        Order ID : EC1001

        Product : Compost Bin

        Date : 26 July 2026

        Amount : Rs. 2500

        Status : Delivered


        -------------------


        Order ID : EC1002

        Product : Recycled Paper

        Status : Processing


        */


    }


}