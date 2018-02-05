package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Tourist_Places_in_Sylhet extends AppCompatActivity {

    ImageView chobi;
    TextView cname;
    TextView view;

    int id;
    String st1;
    String st2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist__places_in__sylhet);

        chobi = (ImageView) findViewById(R.id.image1);
        cname = (TextView) findViewById(R.id.name);
        view = (TextView) findViewById(R.id.overview);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {

            id = bundle.getInt("ID");
            st1 = bundle.getString("Name");
            st2 = bundle.getString("Overview");
        }

        if (id == 1) {

            chobi.setImageResource(R.drawable.jaflong);
            cname.setText(st1);
            view.setText(st2);

        }
        if (id == 2) {

            chobi.setImageResource(R.drawable.panthumai);
            cname.setText(st1);
            view.setText(st2);

        }
        if (id == 3) {

            chobi.setImageResource(R.drawable.ratargul);
            cname.setText(st1);
            view.setText(st2);

        }
        if (id == 4) {

            chobi.setImageResource(R.drawable.lovachora);
            cname.setText(st1);
            view.setText(st2);

        }
         if (id == 5) {

            chobi.setImageResource(R.drawable.bisnakandi);
            cname.setText(st1);
            view.setText(st2);

        }
        if (id == 6) {

            chobi.setImageResource(R.drawable.lalakhal);
            cname.setText(st1);
            view.setText(st2);

        }
        if (id == 7) {

            chobi.setImageResource(R.drawable.khadim);
            cname.setText(st1);
            view.setText(st2);

        }
        if (id == 8) {

            chobi.setImageResource(R.drawable.bholagonj);
            cname.setText(st1);
            view.setText(st2);

        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        int id = item.getItemId();
        if (id == R.id.action_home) {
            Toast.makeText(getApplicationContext(),"You click On home",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
