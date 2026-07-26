package com.example.ecocollect.collector;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecocollect.R;



public class CollectorNotificationsActivity extends AppCompatActivity {


    RecyclerView collectorNotificationRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_collector_notifications);



        // Connect RecyclerView

        collectorNotificationRecycler =
                findViewById(R.id.collectorNotificationRecycler);



        // Display notifications vertically

        collectorNotificationRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        /*

        Later we can add:

        NotificationAdapter adapter =
                new NotificationAdapter(notificationList);

        collectorNotificationRecycler.setAdapter(adapter);


        Example notifications:

        "New route assigned"
        "Collection completed"
        "Update pending"

        */


    }

}