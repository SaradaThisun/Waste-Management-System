package com.example.ecocollect.marketplaceuser;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;
import com.example.ecocollect.marketplace.CartActivity;
import com.example.ecocollect.marketplace.MarketplaceHomeActivity;
import com.example.ecocollect.marketplace.OrderHistoryActivity;
import com.example.ecocollect.marketplace.WishlistActivity;



public class Dashboard extends AppCompatActivity {


    Button marketplaceBtn;
    Button cartBtn;
    Button ordersBtn;
    Button wishlistBtn;
    Button notificationBtn;
    Button profileBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_dashboard);



        marketplaceBtn = findViewById(R.id.marketplaceBtn);

        cartBtn = findViewById(R.id.cartBtn);

        ordersBtn = findViewById(R.id.ordersBtn);

        wishlistBtn = findViewById(R.id.wishlistBtn);

        notificationBtn = findViewById(R.id.notificationBtn);

        profileBtn = findViewById(R.id.profileBtn);



        // Marketplace

        marketplaceBtn.setOnClickListener(v -> {


            startActivity(
                    new Intent(
                            Dashboard.this,
                            MarketplaceHomeActivity.class
                    )
            );


        });



        // Cart

        cartBtn.setOnClickListener(v -> {


            startActivity(
                    new Intent(
                            Dashboard.this,
                            CartActivity.class
                    )
            );


        });



        // Orders

        ordersBtn.setOnClickListener(v -> {


            startActivity(
                    new Intent(
                            Dashboard.this,
                            OrderHistoryActivity.class
                    )
            );


        });



        // Wishlist

        wishlistBtn.setOnClickListener(v -> {


            startActivity(
                    new Intent(
                            Dashboard.this,
                            WishlistActivity.class
                    )
            );


        });



        // Notifications

        notificationBtn.setOnClickListener(v -> {



            // Later create BuyerNotificationsActivity


        });



        // Profile

        profileBtn.setOnClickListener(v -> {



            // Later create BuyerProfileActivity


        });


    }

}