package com.example.user.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView mylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

 /////LISTVIEW TO ANOTHER ACTIVITY START

        mylist=(ListView)findViewById(R.id.mylistView);
        String[] list = { "College", "School", "University","Medical College", "Resort", "Hotel", "Restaurent", "Bank","Airport",
                "Bus Station", "Railway Station", "Hospital", "Shopping Mall","Mazar","Museum"};


        int[] my= {R.drawable.c, R.drawable.school, R.drawable.university,R.drawable.mcollege, R.drawable.resort,
                R.drawable.hotel,R.drawable.resturent, R.drawable.bank, R.drawable.airport, R.drawable.bus, R.drawable.train,
                R.drawable.hospital, R.drawable.shoppingmall,R.drawable.mazar,R.drawable.museum};

        MyCustomAdapter myAdap= new MyCustomAdapter(this, list, my);
        mylist.setAdapter(myAdap);

    }

    //////////END

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //CODE FOR OVERFLOW MENU
        int id = item.getItemId();


        if (id == R.id.action_settings) {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Nothing has changed our mobile lives more than apps. Applications, that is.\n" +
                    "And Android apps in particular. With them we can do just about anything.\n" +
                    "Communicate with friends and family. Pass the time with a game.\n" +
                    "here we get Practical travel information, like when to go, live weather, real-time currency exchange rates, and measurement conversion tables. Here we get all information without using internet.Here we also get differnt color pictures.From here we also get website adress of anything. People can show location from here. And at last Thanks for using 'Syhet View'.\n");
            builder.setTitle("About us");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            builder.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //END

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent=new Intent(getApplicationContext(),Emergency_number.class);
            startActivity(intent);
        }

        else if (id == R.id.nav_gallery) {
            Intent intent=new Intent(getApplicationContext(),Tourist_Places_list.class);
            startActivity(intent);
        }

        else if (id == R.id.nav_slideshow) {
            Intent intent=new Intent(getApplicationContext(),hangout_place_list.class);
            startActivity(intent);

        }

        else if (id == R.id.dev) {
            Intent intent=new Intent(getApplicationContext(),Developers.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
