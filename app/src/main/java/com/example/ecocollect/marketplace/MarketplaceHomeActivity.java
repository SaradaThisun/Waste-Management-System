package com.example.ecocollect.marketplace;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;
import com.example.ecocollect.citizen.CitizenHomeActivity;



public class MarketplaceHomeActivity extends AppCompatActivity {


    Button backBtn;
    Button cartBtn;
    Button recycledBtn;
    Button compostBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_marketplace_home);



        // Connect XML buttons

        backBtn = findViewById(R.id.backBtn);

        cartBtn = findViewById(R.id.cartBtn);

        recycledBtn = findViewById(R.id.recycledBtn);

        compostBtn = findViewById(R.id.compostBtn);



        // Back to Citizen Home

        backBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    MarketplaceHomeActivity.this,
                    CitizenHomeActivity.class
            );


            startActivity(intent);


        });



        // Open Cart

        cartBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    MarketplaceHomeActivity.this,
                    CartActivity.class
            );


            startActivity(intent);


        });



        // Recycled Category

        recycledBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    MarketplaceHomeActivity.this,
                    ProductDetailsActivity.class
            );


            startActivity(intent);


        });



        // Compost Category

        compostBtn.setOnClickListener(v -> {


            Intent intent = new Intent(
                    MarketplaceHomeActivity.this,
                    ProductDetailsActivity.class
            );


            startActivity(intent);


        });


    }

}