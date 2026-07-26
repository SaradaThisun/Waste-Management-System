package com.example.ecocollect.citizen;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecocollect.R;



public class ComplaintsActivity extends AppCompatActivity {


    Spinner complaintType;

    EditText complaintDescription;

    Button sendComplaint;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_complaints);



        // Connect XML components

        complaintType = findViewById(R.id.complaintType);

        complaintDescription = findViewById(R.id.complaintDescription);

        sendComplaint = findViewById(R.id.sendComplaint);



        // Complaint categories

        String[] complaintList = {

                "Select Complaint Type",
                "Missed Garbage Collection",
                "Illegal Dumping",
                "Overflowing Garbage Bin",
                "Damaged Garbage Bin",
                "Other"

        };



        // Spinner Adapter

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        complaintList
                );


        complaintType.setAdapter(adapter);



        // Submit Complaint Button

        sendComplaint.setOnClickListener(v -> {


            String type =
                    complaintType.getSelectedItem().toString();


            String description =
                    complaintDescription.getText().toString();



            if(type.equals("Select Complaint Type")){


                Toast.makeText(
                        this,
                        "Please select complaint type",
                        Toast.LENGTH_SHORT
                ).show();


            }
            else if(description.isEmpty()){


                Toast.makeText(
                        this,
                        "Please enter complaint details",
                        Toast.LENGTH_SHORT
                ).show();


            }
            else{


                Toast.makeText(
                        this,
                        "Complaint Submitted Successfully",
                        Toast.LENGTH_SHORT
                ).show();



                // Later:
                // Save complaint to Firebase/MySQL



                complaintDescription.setText("");

            }



        });


    }

}