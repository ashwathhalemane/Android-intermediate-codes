package com.dvdroid.droidpoint;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by darshanh on 30/11/15.
 */
public class Get_Notification extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_notification);
        Button get = (Button) findViewById(R.id.notify);
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Notify("You've received new message", "Hi");
            }
        });
    }

    private void Notify(String notificationTitle, String notificationMessage) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        @SuppressWarnings("deprecation")

        Notification notification = new Notification(R.drawable.ic_launcher, "New Message", System.currentTimeMillis());
        Intent notificationIntent = new Intent(this, NotificationView.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);


        notification.flags |= Notification.FLAG_AUTO_CANCEL;//To close notification after opening

        notification.setLatestEventInfo(Get_Notification.this, notificationTitle, notificationMessage, pendingIntent);
        notificationManager.notify(9999, notification);


    }
}
