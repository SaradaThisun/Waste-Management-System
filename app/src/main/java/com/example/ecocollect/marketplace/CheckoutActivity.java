package com.example.ecocollect.marketplace;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;


public class CheckoutActivity extends AppCompatActivity {


    Button backBtn;
    Button paymentBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_checkout);



        backBtn=findViewById(R.id.backBtn);

        paymentBtn=findViewById(R.id.paymentBtn);



        backBtn.setOnClickListener(v -> {

            Intent intent=new Intent(
                    CheckoutActivity.this,
                    CartActivity.class
            );

            startActivity(intent);

        });



        paymentBtn.setOnClickListener(v -> {


            Intent intent=new Intent(
                    CheckoutActivity.this,
                    PaymentActivity.class
            );


            startActivity(intent);


        });


    }
}