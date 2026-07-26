package com.example.ecocollect.collector;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;



public class UpdateStatusActivity extends AppCompatActivity {



    TextView houseNumber;

    RadioGroup statusGroup;


    RadioButton collected;
    RadioButton notCollected;
    RadioButton problem;


    Button updateButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_update_status);





        // Connect XML


        houseNumber = findViewById(R.id.houseNumber);


        statusGroup = findViewById(R.id.statusGroup);



        collected = findViewById(R.id.collected);

        notCollected = findViewById(R.id.notCollected);

        problem = findViewById(R.id.problem);



        updateButton = findViewById(R.id.updateButton);







        // Get household number (temporary)


        houseNumber.setText("H001");







        // Update button


        updateButton.setOnClickListener(v -> {



            int selectedId =
                    statusGroup.getCheckedRadioButtonId();




            if(selectedId == -1){


                Toast.makeText(
                        this,
                        "Please select status",
                        Toast.LENGTH_SHORT
                ).show();



            }

            else {



                RadioButton selectedStatus =
                        findViewById(selectedId);



                String status =
                        selectedStatus.getText().toString();





                Toast.makeText(
                        this,
                        "Status Updated : " + status,
                        Toast.LENGTH_SHORT
                ).show();




                /*

                Later Firebase update:


                Collection Table:


                Household ID
                Collector ID
                Date
                Status


                Example:


                H001
                C001
                27/07/2026
                Collected


                */



            }




        });



    }



}