package com.example.ecocollect.marketplace;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ecocollect.R;



public class WishlistActivity extends AppCompatActivity {



    RecyclerView wishlistRecycler;

    Button backBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_wishlist);



        wishlistRecycler = findViewById(R.id.wishlistRecycler);

        backBtn = findViewById(R.id.backBtn);




        // Back navigation

        backBtn.setOnClickListener(v -> {


            Intent intent = new Intent(

                    WishlistActivity.this,

                    MarketplaceHomeActivity.class

            );


            startActivity(intent);


            finish();


        });




        loadWishlist();



    }




    private void loadWishlist(){



        /*

        Later connect RecyclerView Adapter


        Wishlist Card:


        Product Image

        Product Name

        Price

        Add To Cart Button

        Remove Button



        Database:


        Wishlist Table

        --------------------

        Wishlist_ID

        User_ID

        Product_ID

        Product_Name

        Price

        --------------------


        */



        Toast.makeText(

                this,

                "Wishlist Loaded",

                Toast.LENGTH_SHORT

        ).show();



    }



}