package com.example.ecocollect.marketplace;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ecocollect.R;



public class ProductReviewsActivity extends AppCompatActivity {


    RecyclerView reviewRecycler;

    Button writeReviewButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_product_reviews);



        // Connect XML components

        reviewRecycler = findViewById(R.id.reviewRecycler);

        writeReviewButton = findViewById(R.id.writeReviewButton);




        // RecyclerView setup

        reviewRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );





        // Open Write Review Page

        writeReviewButton.setOnClickListener(v -> {


            Intent intent = new Intent(
                    ProductReviewsActivity.this,
                    WriteReviewsActivity.class
            );


            startActivity(intent);


        });



        /*

        Later connect ReviewAdapter


        Example:

        ⭐⭐⭐⭐⭐

        User:
        Kasun


        Comment:
        Good quality compost bin


        --------------------


        ⭐⭐⭐⭐

        User:
        Nimal


        Comment:
        Fast delivery


        */


    }

}