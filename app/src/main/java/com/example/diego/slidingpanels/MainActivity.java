package com.example.diego.slidingpanels;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;


public class MainActivity extends Activity {

    ListView left_pane;
    ListView right_pane;
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left_pane = (ListView) findViewById(R.id.left_drawer);
        right_pane = (ListView) findViewById(R.id.right_drawer);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

    }

}
