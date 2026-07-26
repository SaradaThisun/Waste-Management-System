package com.example.ecocollect.marketplace;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;


public class PaymentSuccessActivity extends AppCompatActivity {


    TextView orderId;
    Button viewOrderButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_payment_success);



        // Connect XML components

        orderId = findViewById(R.id.orderId);

        viewOrderButton = findViewById(R.id.viewOrderButton);



        // Display Order ID
        // Later this can come from database/Firebase

        orderId.setText("Order ID : EC1001");



        // Navigate to Order History

        viewOrderButton.setOnClickListener(v -> {


            Intent intent = new Intent(
                    PaymentSuccessActivity.this,
                    OrderHistoryActivity.class
            );


            startActivity(intent);


        });


    }

}