package com.example.ecocollect.marketplaceuser;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ecocollect.R;



public class ManageOrders extends AppCompatActivity {


    RecyclerView orderRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_manage_orders);



        orderRecycler = findViewById(R.id.orderRecycler);



        orderRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        /*

        Later RecyclerView data:

        Order ID : EC1001

        Product:
        Compost Bin

        Amount:
        Rs.2500

        Status:
        Processing


        Order ID : EC1002

        Product:
        Recycling Bags

        Status:
        Delivered


        */


    }

}