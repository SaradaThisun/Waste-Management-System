package com.example.ecocollect.authentication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;
import com.example.ecocollect.citizen.CitizenHomeActivity;



public class LoginActivity extends AppCompatActivity {


    EditText loginEmail;
    EditText loginPassword;


    Button loginButton;


    TextView registerText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);



        // Connect XML components

        loginEmail = findViewById(R.id.loginEmail);

        loginPassword = findViewById(R.id.loginPassword);


        loginButton = findViewById(R.id.loginButton);


        registerText = findViewById(R.id.registerText);



        // Login Button

        loginButton.setOnClickListener(v -> {



            String email =
                    loginEmail.getText().toString().trim();



            String password =
                    loginPassword.getText().toString().trim();




            if(email.isEmpty()){


                loginEmail.setError("Enter Email");


            }
            else if(password.isEmpty()){


                loginPassword.setError("Enter Password");


            }
            else{


                Toast.makeText(
                        LoginActivity.this,
                        "Login Successful",
                        Toast.LENGTH_SHORT
                ).show();



                /*

                Temporary navigation

                Later:

                Firebase Authentication
                |
                Check User Role
                |
                ----------------
                Citizen
                Collector
                Buyer

                */


                Intent intent = new Intent(
                        LoginActivity.this,
                        CitizenHomeActivity.class
                );


                startActivity(intent);


                finish();


            }



        });



        // Register Navigation

        registerText.setOnClickListener(v -> {



            Intent intent = new Intent(
                    LoginActivity.this,
                    RegisterActivity.class
            );


            startActivity(intent);



        });



    }

}