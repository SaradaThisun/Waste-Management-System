package com.example.ecocollect.authentication;


import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;



public class SplashActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);



        // Splash delay (3 seconds)

        new Thread(() -> {


            try {


                Thread.sleep(3000);



            } catch (InterruptedException e) {


                e.printStackTrace();


            }




            Intent intent = new Intent(
                    SplashActivity.this,
                    LoginActivity.class
            );


            startActivity(intent);


            finish();



        }).start();



    }


}