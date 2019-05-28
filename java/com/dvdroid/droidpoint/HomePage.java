package com.dvdroid.droidpoint;

/**
 * Created by darshanh on 18/11/15.
 */

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class HomePage extends ActionBarActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_homepage);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapterHomePage(getDataSet());
        mRecyclerView.setAdapter(mAdapter);

        // Code to Add an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).addItem(obj, index);

        // Code to remove an item with default animation
        //((MyRecyclerViewAdapter) mAdapter).deleteItem(index);
    }


    @Override
    protected void onResume() {
        super.onResume();
        ((MyRecyclerViewAdapterHomePage) mAdapter).setOnItemClickListener(new MyRecyclerViewAdapterHomePage
                .MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                position = position + 1;
                Log.i(LOG_TAG, " Clicked on Item " + position);
                Toast.makeText(getApplicationContext(), "Clicked on Item " + position, Toast.LENGTH_SHORT).show();
                if (position == 1) {
                    Intent i = new Intent(getApplicationContext(), Activity1.class);
                    startActivity(i);
                }
                if (position == 2) {
                    Intent i = new Intent(getApplicationContext(), Activity2.class);
                    startActivity(i);
                }
                if (position == 3) {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
                if (position == 4) {
                    Intent i = new Intent(getApplicationContext(), Media.class);
                    startActivity(i);
                }
                if (position == 5) {
                    Intent i = new Intent(getApplicationContext(), SharedPrefs.class);
                    startActivity(i);
                }
                if (position == 6) {
                    Intent i = new Intent(getApplicationContext(), MenuOption.class);
                    startActivity(i);
                }
                if (position == 7) {
                    Intent i = new Intent(getApplicationContext(), Dialog_Actvity.class);
                    startActivity(i);
                }

                if (position == 8) {
                    Intent i = new Intent(getApplicationContext(), TabLayout.class);
                    startActivity(i);
                }
                if (position == 9) {
                    Intent i = new Intent(getApplicationContext(), SwipeTabActivity.class);
                    startActivity(i);
                }
                if (position == 10) {
                    Intent i = new Intent(getApplicationContext(), WebViewActivity.class);
                    startActivity(i);
                }
                if (position == 11) {
                    Intent i = new Intent(getApplicationContext(), ListViewActivity.class);
                    startActivity(i);
                }

                if (position == 12) {
                    Intent i = new Intent(getApplicationContext(), ExpandableListViewActivity.class);
                    startActivity(i);
                }
                if (position == 13) {
                    Intent i = new Intent(getApplicationContext(), Sharing.class);
                    startActivity(i);
                }
                if (position == 14) {
                    Intent i = new Intent(getApplicationContext(), Get_Notification.class);
                    startActivity(i);
                }
                if (position == 15) {
                    Intent i = new Intent(getApplicationContext(), Contact_Gallery_Access.class);
                    startActivity(i);
                }
                if (position == 16) {
                    Intent i = new Intent(getApplicationContext(), DataBaseActivity.class);
                    startActivity(i);
                }
                if (position == 17) {
                    Intent i = new Intent(getApplicationContext(), Splash.class);
                    startActivity(i);
                }
                if (position == 18) {
                    Intent i = new Intent(getApplicationContext(), CardViewActivity.class);
                    startActivity(i);
                }
                if (position == 19) {
                    Intent i = new Intent(getApplicationContext(), Search_Activity.class);
                    startActivity(i);
                }

                if (position == 20) {
                    Intent i = new Intent(getApplicationContext(), Admob_Ads.class);
                    startActivity(i);
                }


            }
        });
    }

    private ArrayList<DataObject> getDataSet() {
        ArrayList results = new ArrayList<DataObject>();
        for (int index = 0; index < 20; index++) {
            switch (index) {


                case 0: {
                    DataObject obj = new DataObject("1. TextView, EditText, Buttons", "");
                    results.add(index, obj);
                    break;
                }
                case 1: {
                    DataObject obj = new DataObject("2. ImageView,ImageButtons", "");
                    results.add(index, obj);
                    break;
                }
                case 2: {
                    DataObject obj = new DataObject("3. Intents", "Going From One Act. to another");
                    results.add(index, obj);
                    break;
                }
                case 3: {
                    DataObject obj = new DataObject("4. Media Player", "Play Sound");
                    results.add(index, obj);
                    break;
                }
                case 4: {
                    DataObject obj = new DataObject("5. Shared Prefs", "Store small data");
                    results.add(index, obj);
                    break;
                }
                case 5: {
                    DataObject obj = new DataObject("6. Menu Options", "Toast, Snackbar");
                    results.add(index, obj);
                    break;
                }
                case 6: {
                    DataObject obj = new DataObject("7. Dialog Activity", "Themes for Activities");
                    results.add(index, obj);
                    break;
                }
                case 7: {
                    DataObject obj = new DataObject("8. Tab View", "Normal Tabs");
                    results.add(index, obj);
                    break;
                }
                case 8: {
                    DataObject obj = new DataObject("8.. Tab View", "Swipeable TabView");
                    results.add(index, obj);
                    break;
                }
                case 9: {
                    DataObject obj = new DataObject("9. WebView", "Show Webpages inside the app");
                    results.add(index, obj);
                    break;
                }
                case 10: {
                    DataObject obj = new DataObject("10. ListView", "Normal ListView");
                    results.add(index, obj);
                    break;
                }
                case 11: {
                    DataObject obj = new DataObject("10. ListView", "Expandable ListView");
                    results.add(index, obj);
                    break;
                }
                case 12: {
                    DataObject obj = new DataObject("11. Sharing", "Text and Image to other apps");
                    results.add(index, obj);
                    break;
                }
                case 13: {
                    DataObject obj = new DataObject("12. Notification", "Get Notified");
                    results.add(index, obj);
                    break;
                }
                case 14: {
                    DataObject obj = new DataObject("13. Accessing", "Gallery and Contacts");
                    results.add(index, obj);
                    break;
                }
                case 15: {
                    DataObject obj = new DataObject("14. Database", "SQLite");
                    results.add(index, obj);
                    break;
                }
                case 17: {
                    DataObject obj = new DataObject("16. CardView", "Recycler View");
                    results.add(index, obj);
                    break;
                }
                case 16: {
                    DataObject obj = new DataObject("15. Splash", "Start of the App");
                    results.add(index, obj);
                    break;
                }
                case 18: {
                    DataObject obj = new DataObject("17. Search Activity", "Search Inside a listview");
                    results.add(index, obj);
                    break;
                }

                default:
                    DataObject obj = new DataObject("18. Admob Ads", "Banner and Interstital");
                    results.add(index, obj);

            }
        }
        return results;

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Handle the back button
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            // Ask the user if they want to quit
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Exit")
                    .setMessage("Do you really want to Exit?")
                    .setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog,
                                                    int which) {

                                    // Stop the activity
                                    HomePage.this.finish();
                                }

                            }).setNegativeButton("No", null).show();

            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
