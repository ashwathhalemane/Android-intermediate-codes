package com.dvdroid.droidpoint;

/**
 * Created by darshanh on 07/11/15.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class ListViewActivity extends Activity {

    ListView list;
    String[] itemname = {
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Cold War"
    };

    Integer[] imgid = {
            R.drawable.ic_launcher,

            R.drawable.ic_launcher,

            R.drawable.ic_launcher,

            R.drawable.ic_launcher,

            R.drawable.ic_launcher,

            R.drawable.ic_launcher,

            R.drawable.ic_launcher,

            R.drawable.ic_launcher,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                switch(position){
                    case 0:
                    {
                        Toast.makeText(getApplicationContext(), "Clicked on "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 1:
                    {
                        Toast.makeText(getApplicationContext(), "Clicked on "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 2:
                    {
                        Toast.makeText(getApplicationContext(), "Clicked on "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 3:
                    {
                        Toast.makeText(getApplicationContext(), "Clicked on "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 4:
                    {
                        Toast.makeText(getApplicationContext(), "Clicked on "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 5:
                    {
                        Toast.makeText(getApplicationContext(), "Clicked on "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 6:
                    {
                        Toast.makeText(getApplicationContext(), "Clicked on "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 7:
                    {
                        Toast.makeText(getApplicationContext(), "Clicked on "+ position, Toast.LENGTH_SHORT).show();
                        break;
                    }
                }

            }
        });
    }
}