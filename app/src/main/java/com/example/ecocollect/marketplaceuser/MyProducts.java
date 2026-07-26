package com.example.ecocollect.marketplaceuser;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ecocollect.R;



public class MyProducts extends AppCompatActivity {


    RecyclerView productRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_my_products);



        productRecycler = findViewById(R.id.productRecycler);



        productRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        /*

        Later display purchased products:

        Product:
        Compost Bin

        Price:
        Rs.2500

        Purchase Date:
        2026/07/27


        Product:
        Recycling Bag

        Price:
        Rs.500


        */


    }

}