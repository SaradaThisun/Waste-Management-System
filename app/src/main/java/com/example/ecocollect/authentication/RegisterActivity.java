package com.example.ecocollect.authentication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;
import com.example.ecocollect.marketplace.BuyerHomeActivity;
import com.example.ecocollect.citizen.CitizenHomeActivity;
import com.example.ecocollect.collector.CollectorHomeActivity;



public class RegisterActivity extends AppCompatActivity {


    EditText registerName;
    EditText registerEmail;
    EditText registerPhone;
    EditText registerPassword;
    EditText registerConfirmPassword;


    Spinner userRole;


    Button registerButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_register);



        // Connect XML components


        registerName = findViewById(R.id.registerName);

        registerEmail = findViewById(R.id.registerEmail);

        registerPhone = findViewById(R.id.registerPhone);

        registerPassword = findViewById(R.id.registerPassword);

        registerConfirmPassword =
                findViewById(R.id.registerConfirmPassword);



        userRole = findViewById(R.id.userRole);


        registerButton = findViewById(R.id.registerButton);





        // Role dropdown values


        String[] roles = {

                "Select User Type",
                "Citizen",
                "Collector",
                "Buyer"

        };



        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        roles
                );



        userRole.setAdapter(adapter);





        // Register button


        registerButton.setOnClickListener(v -> {



            String name =
                    registerName.getText().toString().trim();


            String email =
                    registerEmail.getText().toString().trim();


            String phone =
                    registerPhone.getText().toString().trim();


            String password =
                    registerPassword.getText().toString().trim();


            String confirmPassword =
                    registerConfirmPassword.getText().toString().trim();



            String role =
                    userRole.getSelectedItem().toString();





            // Validation


            if(name.isEmpty()
                    || email.isEmpty()
                    || phone.isEmpty()
                    || password.isEmpty()
                    || confirmPassword.isEmpty()){


                Toast.makeText(
                        this,
                        "Please fill all fields",
                        Toast.LENGTH_SHORT
                ).show();


            }


            else if(role.equals("Select User Type")){


                Toast.makeText(
                        this,
                        "Select user type",
                        Toast.LENGTH_SHORT
                ).show();


            }


            else if(!password.equals(confirmPassword)){


                Toast.makeText(
                        this,
                        "Passwords do not match",
                        Toast.LENGTH_SHORT
                ).show();


            }


            else {



                Toast.makeText(
                        this,
                        "Registration Successful",
                        Toast.LENGTH_SHORT
                ).show();





                // Navigate according to role


                if(role.equals("Citizen")){


                    Intent intent =
                            new Intent(
                                    RegisterActivity.this,
                                    CitizenHomeActivity.class
                            );


                    startActivity(intent);



                }



                else if(role.equals("Collector")){


                    Intent intent =
                            new Intent(
                                    RegisterActivity.this,
                                    CollectorHomeActivity.class
                            );


                    startActivity(intent);



                }



                else if(role.equals("Buyer")){


                    Intent intent =
                            new Intent(
                                    RegisterActivity.this,
                                    BuyerHomeActivity.class
                            );


                    startActivity(intent);



                }



                finish();


            }



        });



    }

}