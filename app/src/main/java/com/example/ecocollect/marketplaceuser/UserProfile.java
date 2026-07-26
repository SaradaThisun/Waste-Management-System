package com.example.ecocollect.marketplaceuser;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;
import com.example.ecocollect.authentication.LoginActivity;



public class UserProfile extends AppCompatActivity {


    TextView userName;
    TextView userEmail;
    TextView userPhone;
    TextView userAddress;


    Button editProfileBtn;
    Button manageOrdersBtn;
    Button salesHistoryBtn;
    Button logoutBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user_profile);



        userName = findViewById(R.id.userName);

        userEmail = findViewById(R.id.userEmail);

        userPhone = findViewById(R.id.userPhone);

        userAddress = findViewById(R.id.userAddress);



        editProfileBtn = findViewById(R.id.editProfileBtn);

        manageOrdersBtn = findViewById(R.id.manageOrdersBtn);

        salesHistoryBtn = findViewById(R.id.salesHistoryBtn);

        logoutBtn = findViewById(R.id.logoutBtn);




        // Temporary user data

        userName.setText("Eco Seller");

        userEmail.setText("seller@gmail.com");

        userPhone.setText("Phone : 0712345678");

        userAddress.setText("Address : Colombo");




        editProfileBtn.setOnClickListener(v -> {


            // Open Edit Marketplace User Profile later


        });





        manageOrdersBtn.setOnClickListener(v -> {


            Intent intent = new Intent(

                    UserProfile.this,

                    ManageOrders.class

            );


            startActivity(intent);


        });






        salesHistoryBtn.setOnClickListener(v -> {


            Intent intent = new Intent(

                    UserProfile.this,

                    SalesHistory.class

            );


            startActivity(intent);


        });






        logoutBtn.setOnClickListener(v -> {


            Intent intent = new Intent(

                    UserProfile.this,

                    LoginActivity.class

            );


            startActivity(intent);

            finish();


        });


    }


}