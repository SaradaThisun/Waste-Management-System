package com.example.ecocollect.marketplace;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;



public class ProductDetailsActivity extends AppCompatActivity {


    Button cartBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_product_details);



        cartBtn = findViewById(R.id.cartBtn);



        cartBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    ProductDetailsActivity.this,
                    CartActivity.class
            );


            startActivity(intent);


        });


    }
}