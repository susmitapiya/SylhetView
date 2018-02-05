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

public class Railway_Station_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_railway__station_list);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Sylhet Railway Station");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item2,R.id.label2, Names);
        listView1.setAdapter(adapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Railway_Station_list.this, Railway_Station.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Sylhet Railway Station")) {
                    flag = 1;
                    intent.putExtra("Name","Sylhet Railway Station");
                    intent.putExtra("Add","Kodomtoli,Sylhet-3100, Bangladesh.");
                    intent.putExtra("Phn","Contact No:  +88 0821-717036");
                    intent.putExtra("lat", 24.881835); //24.881835, 91.868112
                    intent.putExtra("lng", 91.868112);
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
