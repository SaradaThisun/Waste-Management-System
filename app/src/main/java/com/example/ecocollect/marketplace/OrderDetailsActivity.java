package com.example.ecocollect.marketplace;


import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;


public class OrderDetailsActivity extends AppCompatActivity {


    TextView orderNumber;
    TextView productName;
    TextView orderStatus;

    CheckBox confirmedCheck;
    CheckBox packedCheck;
    CheckBox deliveredCheck;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_order_details);



        // Connect XML components

        orderNumber = findViewById(R.id.orderNumber);

        productName = findViewById(R.id.productName);

        orderStatus = findViewById(R.id.orderStatus);



        confirmedCheck = findViewById(R.id.confirmedCheck);

        packedCheck = findViewById(R.id.packedCheck);

        deliveredCheck = findViewById(R.id.deliveredCheck);



        // Display order details
        // Later these values will come from database


        orderNumber.setText("Order ID : EC1001");


        productName.setText("Product : Compost Bin");


        orderStatus.setText("Status : Processing");



        // Delivery progress

        confirmedCheck.setChecked(true);

        packedCheck.setChecked(false);

        deliveredCheck.setChecked(false);


    }

}