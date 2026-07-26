package com.example.ecocollect.citizen;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.ecocollect.R;



public class NotificationsActivity extends AppCompatActivity {


    RecyclerView notificationRecycler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_notification);



        // Connect RecyclerView

        notificationRecycler =
                findViewById(R.id.notificationRecycler);



        // Display notifications vertically

        notificationRecycler.setLayoutManager(
                new LinearLayoutManager(this)
        );



        /*

        Later connect NotificationAdapter


        Example notifications:


        1.

        Title:
        Collection Reminder

        Message:
        Your waste collection is scheduled tomorrow at 8:00 AM



        2.

        Title:
        Complaint Update

        Message:
        Your illegal dumping report has been reviewed



        3.

        Title:
        Community Event

        Message:
        Join the environmental cleanup campaign this weekend



        */


    }

}