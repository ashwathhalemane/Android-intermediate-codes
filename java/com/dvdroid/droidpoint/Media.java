package com.dvdroid.droidpoint;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by darshanh on 06/10/15.
 */
public class Media extends Activity {

    Button play, pause, stop;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_player);
        play = (Button) findViewById(R.id.play);
        stop = (Button) findViewById(R.id.stop);
        pause = (Button) findViewById(R.id.pause);
        mp = MediaPlayer.create(this, R.raw.song);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
                mp.setLooping(true);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.pause();
                }
                //If we don't check mp.isPlaying() condition, we will get error when we press pause button after pressing Stop button


            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                mp.prepareAsync();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mp.isPlaying())
            mp.stop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mp.isPlaying())
        mp.stop();
    }


}
