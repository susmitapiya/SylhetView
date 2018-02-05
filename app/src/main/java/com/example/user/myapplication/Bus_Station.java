package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Bus_Station extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus__station);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Sylhet Kodomtoli Bus Stand");
        Names.add("• Kumargaw Bus Stand");


        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Bus_Station.this, Bus_Station1.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Sylhet Kodomtoli Bus Stand")) {
                    flag = 1;
                    intent.putExtra("Name","Sylhet Kodomtoli Bus Stand");
                    intent.putExtra("Add", "Kodomtoli, station road Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1717-257439");
                    intent.putExtra("lat", 24.882742); //24.882742, 91.869793
                    intent.putExtra("lng", 91.869793);
                }

                if (S_Position.equals("• Kumargaw Bus Stand")) {
                    flag = 2;
                    intent.putExtra("Name","Kumargaw Bus Stand");
                    intent.putExtra("Add","Kumargaw,Sylhet-Sunamganj Hwy, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  00000000");
                    intent.putExtra("lat", 24.912917); //24.912917, 91.828024
                    intent.putExtra("lng", 91.828024);
                }

                intent.putExtra("ID",flag);
                startActivity(intent);

            }
        });
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

