package com.dvdroid.droidpoint;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by darshanh on 30/11/15.
 */
public class Sharing extends Activity {
    Button shareText, shareImage;
    TextView t1;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharing);
        shareImage = (Button) findViewById(R.id.imageShare);
        shareText = (Button) findViewById(R.id.textShare);

        image = (ImageView) findViewById(R.id.image);

        t1 = (TextView) findViewById(R.id.textView);

        shareText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shareBody = t1.getText().toString();
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                // To add any other new string use
                // sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Share Anything You want");
                startActivity(Intent.createChooser(sharingIntent, "Share Via"));
            }
        });
        shareImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shareBody = t1.getText().toString();
                Uri imageUri = Uri.parse("android.resource://com.dvdroid/drawable/ic_launcher");
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/png");
                intent.putExtra(Intent.EXTRA_STREAM, imageUri);
                //If you want to add any text along with image remove the comment lines of below 2 lines
                // intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                // intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share"));
            }
        });

    }
}
