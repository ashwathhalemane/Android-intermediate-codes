package com.dvdroid.droidpoint;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by darshanh on 29/11/15.
 */
public class SharedPrefs extends Activity {
    Button save, show;
    TextView text;
    EditText eT;
    SharedPreferences sharedpreferences;
    String oldValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_prefs);

        text = (TextView) findViewById(R.id.sharedPrefsTextView);
        save = (Button) findViewById(R.id.sharedPrefsSaveButton);
        show = (Button) findViewById(R.id.sharedPrefsShowButton);
        eT = (EditText) findViewById(R.id.sharedPrefsEditText);

        sharedpreferences = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        oldValue = sharedpreferences.getString("key", null);

        text.setText("The value saved previously was " + oldValue);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newValue = eT.getText().toString();
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("key", newValue);
                editor.commit();


                /* editor.putBoolean("key_name1", true);           // Saving boolean - true/false
    editor.putInt("key_name2", "int value");        // Saving integer
    editor.putFloat("key_name3", "float value");    // Saving float
    editor.putLong("key_name4", "long value");      // Saving long
    editor.putString("key_name5", "string value");  // Saving string
     */

            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                oldValue = sharedpreferences.getString("key", null);
                text.setText("The value saved previously was " + oldValue);


                 /*If value for key not exist then return second param value - In this case null

    pref.getBoolean("key_name1", null);         // getting boolean
    pref.getInt("key_name2", null);             // getting Integer
    pref.getFloat("key_name3", null);           // getting Float
    pref.getLong("key_name4", null);            // getting Long
    pref.getString("key_name5", null);          // getting String




/************ Deleting Key value from SharedPreferences *****************/
/*
        editor.remove("key_name3"); // will delete key key_name3
        editor.remove("key_name4"); // will delete key key_name4

        // Save the changes in SharedPreferences
        editor.commit(); // commit changes

/************ Clear all data from SharedPreferences *****************/
/*
        editor.clear();
        editor.commit(); // commit changes*/

            }
        });

    }
}
