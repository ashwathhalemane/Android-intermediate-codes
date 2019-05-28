package com.dvdroid.droidpoint;

/**
 * Created by darshanh on 29/11/15.
 */

import android.app.TabActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

/**
 * Created by darshanh on 14/10/15.
 */
public class TabLayout extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);
        Button b1;
        b1=(Button) findViewById(R.id.b1);


        TabHost tabHost = getTabHost();
        // setNewTab(context, tabHost, tag, title, icon, contentID);
        this.setNewTab(this, tabHost, "tab1", R.string.tab_1, R.id.tab1);
        this.setNewTab(this, tabHost, "tab2", R.string.tab_2, R.id.tab2);
        this.setNewTab(this, tabHost, "tab3", R.string.tab_3, R.id.tab3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This is a sample Toast",Toast.LENGTH_LONG).show();
            }
        });

        //tabHost.setCurrentTabByTag("tab2"); //-- optional to set a tab programmatically.
    }

    private void setNewTab(Context context, TabHost tabHost, String tag, int title, int contentID) {
        TabHost.TabSpec tabSpec = tabHost.newTabSpec(tag);
        String titleString = getString(title);
        tabSpec.setIndicator(titleString, context.getResources().getDrawable(android.R.drawable.star_on));
        tabSpec.setContent(contentID);
        tabHost.addTab(tabSpec);
    }
}

