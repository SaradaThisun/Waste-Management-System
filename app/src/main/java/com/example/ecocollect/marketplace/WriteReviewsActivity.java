package com.example.ecocollect.marketplace;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.example.ecocollect.R;



public class WriteReviewsActivity extends AppCompatActivity {



    RatingBar productRating;

    EditText reviewDescription;

    Button submitReview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_write_reviews);




        // Connect XML


        productRating = findViewById(R.id.productRating);

        reviewDescription = findViewById(R.id.reviewDescription);

        submitReview = findViewById(R.id.submitReview);







        // Submit Review Button


        submitReview.setOnClickListener(v -> {



            float rating = productRating.getRating();


            String review =
                    reviewDescription.getText()
                            .toString();





            if(review.isEmpty()){


                Toast.makeText(

                        this,

                        "Please write a review",

                        Toast.LENGTH_SHORT

                ).show();



            }

            else {



                Toast.makeText(

                        this,

                        "Review Submitted\nRating: "
                                + rating,

                        Toast.LENGTH_SHORT

                ).show();





                /*

                Later Firebase / Database:


                Review Table


                ----------------------

                Review_ID

                User_ID

                Product_ID

                Rating

                Description

                Date


                ----------------------



                Example:


                User:
                U001


                Product:
                Compost Bin


                Rating:
                5 Stars


                Review:
                "Good quality product"



                */


                reviewDescription.setText("");

                productRating.setRating(0);



            }




        });



    }


}