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

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class University extends AppCompatActivity implements OnMapReadyCallback {

    ImageView chobi;
    ImageView phone;
    ImageView web;

    TextView cname;
    TextView add;
    TextView phn;

    int id;
    String st1;
    String st2;
    String st3;

    private GoogleMap mMap;
    double lat, lng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        chobi = (ImageView) findViewById(R.id.image1);
        cname = (TextView) findViewById(R.id.name);
        add = (TextView) findViewById(R.id.add);
        phn = (TextView) findViewById(R.id.phnnum);


        phone = (ImageView) findViewById(R.id.phone);
        web = (ImageView) findViewById(R.id.web);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {

            id = bundle.getInt("ID");
            st1 = bundle.getString("Name");
            st2 = bundle.getString("Add");
            st3 = bundle.getString("Phn");
            lat = bundle.getDouble("lat");
            lng = bundle.getDouble("lng");

        }

        if (id == 1) {

            chobi.setImageResource(R.drawable.sust);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);
            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 821-713491"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://www.sust.edu/"));
                    startActivity(intent2);

                }
            });
        }

        if (id == 2) {

            chobi.setImageResource(R.drawable.sau);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 821-760930"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://www.sau.ac.bd/"));
                    startActivity(intent2);
                }
            });
        }

        if (id == 3) {

            chobi.setImageResource(R.drawable.lu);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 821-720303"));
                    startActivity(intent1);
                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://www.lus.ac.bd/"));
                    startActivity(intent2);
                }
            });
        }

        if (id == 4) {

            chobi.setImageResource(R.drawable.mu);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 821-713077"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://metrouni.edu.bd/"));
                    startActivity(intent2);
                }
            });
        }

        if (id == 5) {

            chobi.setImageResource(R.drawable.siu);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);
            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 821-717193"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://siu.edu.bd/"));
                    startActivity(intent2);

                }
            });
        }

        if (id == 6) {

            chobi.setImageResource(R.drawable.neub);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1755-566994"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://www.neub.edu.bd/"));
                    startActivity(intent2);

                }
            });
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
            Toast.makeText(getApplicationContext(), "You click On home", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        /*if (ActivityCompat.checkSelfPermission(GoogleMapsActivity.this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(GoogleMapsActivity.this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);*/
        mMap.getUiSettings().setZoomControlsEnabled(true);

        LatLng yourLocation = new LatLng(lat, lng);

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(yourLocation, 16));
        MarkerOptions markerOptions = new MarkerOptions()
                .position(yourLocation)
                .snippet(st1)
                .title("Wow");

        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
        mMap.addMarker(markerOptions);


    }
}