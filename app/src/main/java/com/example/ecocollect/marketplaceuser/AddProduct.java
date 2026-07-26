package com.example.ecocollect.marketplaceuser;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;


public class AddProduct extends AppCompatActivity {


    Button backBtn;
    Button uploadImageBtn;
    Button addProductBtn;


    EditText productName;
    EditText productCategory;
    EditText productPrice;
    EditText productStock;
    EditText productDescription;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_product);



        backBtn = findViewById(R.id.backBtn);

        uploadImageBtn = findViewById(R.id.uploadImageBtn);

        addProductBtn = findViewById(R.id.addProductBtn);



        productName = findViewById(R.id.productName);

        productCategory = findViewById(R.id.productCategory);

        productPrice = findViewById(R.id.productPrice);

        productStock = findViewById(R.id.productStock);

        productDescription = findViewById(R.id.productDescription);



        // Back button

        backBtn.setOnClickListener(v -> {


            finish();


        });



        // Upload Image button
        // Later connect image picker/Firebase storage

        uploadImageBtn.setOnClickListener(v -> {



        });



        // Add Product button
        // Later connect database


        addProductBtn.setOnClickListener(v -> {



            String name = productName.getText().toString();

            String category = productCategory.getText().toString();

            String price = productPrice.getText().toString();

            String stock = productStock.getText().toString();

            String description = productDescription.getText().toString();



            // Database saving will be added later



        });


    }

}