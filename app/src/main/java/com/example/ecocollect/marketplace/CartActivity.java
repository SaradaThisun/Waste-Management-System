package com.example.ecocollect.marketplace;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;



public class CartActivity extends AppCompatActivity {


    Button backBtn;
    Button removeBtn;
    Button checkoutBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cart);



        // Connect XML buttons

        backBtn = findViewById(R.id.backBtn);

        removeBtn = findViewById(R.id.removeBtn);

        checkoutBtn = findViewById(R.id.checkoutBtn);



        // Back to Product Details

        backBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    CartActivity.this,
                    ProductDetailsActivity.class
            );


            startActivity(intent);


        });



        // Remove Item (Later connect database)

        removeBtn.setOnClickListener(v -> {


            // Product removal logic will be added later


        });



        // Go to Checkout

        checkoutBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    CartActivity.this,
                    CheckoutActivity.class
            );


            startActivity(intent);


        });


    }

}