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

public class Restaurant extends AppCompatActivity implements OnMapReadyCallback{
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
    double lat,lng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

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

            chobi.setImageResource(R.drawable.panshi);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);
            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1761-152939"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://panshirestaurant.com/"));
                    startActivity(intent2);

                }
            });
        }

        if (id == 2) {

            chobi.setImageResource(R.drawable.palki);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1715-396467"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
//                    intent2.setData(Uri.parse(""));
//                    startActivity(intent2);
                    Toast.makeText(Restaurant.this, "No website", Toast.LENGTH_SHORT).show();
                }
            });
        }

        if (id == 3) {

            chobi.setImageResource(R.drawable.bb);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1711-932681"));
                    startActivity(intent1);
                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://www.bhujonbari.com/"));
                    startActivity(intent2);
                }
            });
        }

        if (id == 4) {

            chobi.setImageResource(R.drawable.woondaal);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1717-020505"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://www.woondaal.com/"));
                    startActivity(intent2);
                }
            });
        }

        if (id == 5) {

            chobi.setImageResource(R.drawable.pr);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);
            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1712-150636"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(Restaurant.this, "No website", Toast.LENGTH_SHORT).show();

                }
            });
        }

        if (id == 6) {

            chobi.setImageResource(R.drawable.pachvai);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1711-932681"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
//                    intent2.setData(Uri.parse(""));
//                    startActivity(intent2);
                    Toast.makeText(Restaurant.this, "No website", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if (id == 7) {

            chobi.setImageResource(R.drawable.ht);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1673-447454"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
//                    intent2.setData(Uri.parse("http://www.hotelgardeninn.net/"));
//                    startActivity(intent2);
                    Toast.makeText(Restaurant.this, "No website", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if (id == 8) {

            chobi.setImageResource(R.drawable.rc);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1611-723096"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
//                    intent2.setData(Uri.parse("http://www.hotelgardeninn.net/"));
//                    startActivity(intent2);
                    Toast.makeText(Restaurant.this, "No website", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if (id == 9) {

            chobi.setImageResource(R.drawable.hamadan);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+968 9481 0073"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
//                    intent2.setData(Uri.parse("http://www.hotelgardeninn.net/"));
//                    startActivity(intent2);
                    Toast.makeText(Restaurant.this, "No website", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if (id == 10) {

            chobi.setImageResource(R.drawable.ep);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1617-123321"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://www.eatopiarestaurant.com/?i=1#"));
                    startActivity(intent2);

                }
            });
        }
        if (id == 11) {

            chobi.setImageResource(R.drawable.moshrafia);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1617-123321"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Restaurant.this, "No website", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if (id == 12) {

            chobi.setImageResource(R.drawable.src);
            cname.setText(st1);
            add.setText(st2);
            phn.setText(st3);

            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel: " + "+880 1760-208787"));
                    startActivity(intent1);

                }
            });

            web.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("http://www.visitsylhet.com/things-to-do/surma-river-cruise"));
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
            Toast.makeText(getApplicationContext(),"You click On home",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        /*mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        if (ActivityCompat.checkSelfPermission(GoogleMapsActivity.this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(GoogleMapsActivity.this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
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


