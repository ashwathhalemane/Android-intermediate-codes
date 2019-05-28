package com.dvdroid.droidpoint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends Activity {
    //Declare the TextViews/EditTexts/Buttons

    Button prev;
    EditText eT;
    String rec_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); //Enter the layout name you want


        //Initialise with corresponding ID
        prev = (Button) findViewById(R.id.prev);
        eT=(EditText) findViewById(R.id.stringText2);
        rec_value=getIntent().getStringExtra("StringName");

        eT.setText("You Received "+rec_value );
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Go from Present Activity to Another Activity
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });


    }


}
