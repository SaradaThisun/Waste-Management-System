package com.example.ecocollect.citizen;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;
import com.example.ecocollect.authentication.LoginActivity;



public class CitizenProfileActivity extends AppCompatActivity {



    TextView profileName;
    TextView profileEmail;


    Button editProfileBtn;
    Button logoutBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_profile);



        // Connect XML

        profileName = findViewById(R.id.profileName);

        profileEmail = findViewById(R.id.profileEmail);


        editProfileBtn = findViewById(R.id.editProfileBtn);

        logoutBtn = findViewById(R.id.logoutBtn);




        // Temporary user data

        profileName.setText(
                "Citizen Name"
        );


        profileEmail.setText(
                "citizen@email.com"
        );




        // Edit Profile Button

        editProfileBtn.setOnClickListener(v -> {


            // Later open EditProfileActivity


        });





        // Logout Button

        logoutBtn.setOnClickListener(v -> {



            Intent intent = new Intent(
                    CitizenProfileActivity.this,
                    LoginActivity.class
            );


            startActivity(intent);


            finish();



        });



    }

}