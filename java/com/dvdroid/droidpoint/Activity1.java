package com.dvdroid.droidpoint;

/**
 * Created by darshanh on 02/12/15.
 */
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends Activity {
    //Declare the TextViews/EditTexts/Buttons
    TextView t1, t2;
    Button b1;
    EditText eT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1); //Enter the layout name you want


        //Initialise with corresponding IDs
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        eT = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button);

//Action to perform when Button is clicked
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("Your Name is " + eT.getText());

            }
        });

        //Action to perform when TextView is Clicked
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("");
                Toast.makeText(getApplicationContext(), "The TextView has been reset", Toast.LENGTH_LONG).show();
                Snackbar.make(view, "The TextView has been reset", Snackbar.LENGTH_SHORT).show();
            }
        });

    }


}

