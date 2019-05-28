package com.dvdroid.droidpoint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by darshanh on 18/10/15.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {



            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, HomePage.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, 2000);//2000 milli seconds or 2 seconds is the time

    }
}
