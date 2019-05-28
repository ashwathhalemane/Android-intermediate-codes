package com.dvdroid.droidpoint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    //Declare the TextViews/EditTexts/Buttons

    Button next;
    EditText eT;
    String stringValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Enter the layout name you want
        eT = (EditText) findViewById(R.id.stringText);
        next = (Button) findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringValue = eT.getText().toString();
                //Go from Present Activity to Another Activity along with the value 'stringValue' with name 'StringName'
                Intent myintent = new Intent(MainActivity.this, MainActivity2.class).putExtra("StringName", stringValue);
                startActivity(myintent);

            }
        });


    }


}
