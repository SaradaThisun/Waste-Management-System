package com.example.ecocollect.marketplace;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;



public class PaymentActivity extends AppCompatActivity {


    Button backBtn;

    Button cardBtn;

    Button cashBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_payment);



        // Connect XML components


        backBtn = findViewById(R.id.backBtn);

        cardBtn = findViewById(R.id.cardBtn);

        cashBtn = findViewById(R.id.cashBtn);





        // Back Button


        backBtn.setOnClickListener(v -> {


            finish();


        });






        // Card Payment


        cardBtn.setOnClickListener(v -> {


            Toast.makeText(
                    PaymentActivity.this,
                    "Card Payment Selected",
                    Toast.LENGTH_SHORT
            ).show();



            Intent intent = new Intent(
                    PaymentActivity.this,
                    PaymentSuccessActivity.class
            );


            startActivity(intent);



        });







        // Cash On Delivery


        cashBtn.setOnClickListener(v -> {



            Toast.makeText(
                    PaymentActivity.this,
                    "Cash On Delivery Selected",
                    Toast.LENGTH_SHORT
            ).show();



            Intent intent = new Intent(
                    PaymentActivity.this,
                    PaymentSuccessActivity.class
            );


            startActivity(intent);



        });



    }

}