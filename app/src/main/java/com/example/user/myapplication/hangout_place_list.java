package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class hangout_place_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangout_place_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Keane Bridge");
        Names.add("• MAG Osmani Amusement Park");
        Names.add("• Adventure World Amusement Park");
        Names.add("• Tilagor Eco Park");


        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(hangout_place_list.this, hangout_place.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Keane Bridge")) {
                    flag = 1;
                    intent.putExtra("Name","• Keane Bridge");
                    intent.putExtra("Add","Taltola, Bondor Bazar road, Sylhet-3100, Bangladesh");
                    intent.putExtra("lat", 24.887672); //24.887672, 91.868109
                    intent.putExtra("lng", 91.868109);
                }

                if (S_Position.equals("• MAG Osmani Amusement Park")) {
                    flag = 2;
                    intent.putExtra("Name","MAG Osmani Amusement Park");
                    intent.putExtra("Add","Dhupadighir, Bondor Bazar road, Sylhet-3100, Bangladesh");
                    intent.putExtra("lat", 24.892773); //24.892773, 91.875512
                    intent.putExtra("lng", 91.875512);

                }
                if (S_Position.equals("• Adventure World Amusement Park")) {
                    flag = 3;
                    intent.putExtra("Name","Adventure World Amusement Park");
                    intent.putExtra("Add","Salutikor Road, Sylhet-3100, Bangladesh");
                    intent.putExtra("lat", 24.951476); //24.951476, 91.872386
                    intent.putExtra("lng", 91.872386);

                }
                if (S_Position.equals("• Tilagor Eco Park")) {
                    flag = 4;
                    intent.putExtra("Name","Tilagor Eco Park");
                    intent.putExtra("Add","Alurtol Road, Sylhet-3100, Bangladesh");
                    intent.putExtra("lat", 24.915342); //24.915342, 91.904720
                    intent.putExtra("lng", 91.904720);

                }

                intent.putExtra("ID",flag);
                startActivity(intent);

            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
