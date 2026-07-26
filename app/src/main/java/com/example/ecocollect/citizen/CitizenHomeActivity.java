package com.example.ecocollect.citizen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ecocollect.R;
import com.example.ecocollect.marketplace.MarketplaceHomeActivity;


public class CitizenHomeActivity extends AppCompatActivity {


    Button scheduleBtn;
    Button trackingBtn;
    Button reportBtn;
    Button marketBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_citizen_home);



        // Connect buttons with XML

        scheduleBtn = findViewById(R.id.scheduleBtn);

        trackingBtn = findViewById(R.id.trackingBtn);

        reportBtn = findViewById(R.id.reportBtn);

        marketBtn = findViewById(R.id.marketBtn);



        // Collection Schedule Button

        scheduleBtn.setOnClickListener(v -> {

            Intent intent = new Intent(
                    CitizenHomeActivity.this,
                    CollectionScheduleActivity.class
            );

            startActivity(intent);

        });



        // Truck Tracking Button

        trackingBtn.setOnClickListener(v -> {

            Intent intent = new Intent(
                    CitizenHomeActivity.this,
                    TruckTrackingActivity.class
            );

            startActivity(intent);

        });



        // Report Illegal Dumping Button

        reportBtn.setOnClickListener(v -> {

            Intent intent = new Intent(
                    CitizenHomeActivity.this,
                    ReportDumpingActivity.class
            );

            startActivity(intent);

        });



        // Marketplace Button

        marketBtn.setOnClickListener(v -> {

            Intent intent = new Intent(
                    CitizenHomeActivity.this,
                    MarketplaceHomeActivity.class
            );

            startActivity(intent);

        });



        // Screen adjustment

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            Insets systemBars =
                    insets.getInsets(WindowInsetsCompat.Type.systemBars());

            v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
            );

            return insets;

        });

    }
}