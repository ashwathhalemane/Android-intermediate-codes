package com.dvdroid.droidpoint;

/**
 * Created by darshanh on 02/12/15.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity2 extends Activity {
    //Declare the TextViews/EditTexts/Buttons

    ImageView image;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2); //Enter the layout name you want


        //Initialise with corresponding IDs
        image = (ImageView) findViewById(R.id.imageView);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.apple);
                Toast.makeText(getApplicationContext(), "Image has been Changed", Toast.LENGTH_LONG).show();
            }
        });

    }


}
