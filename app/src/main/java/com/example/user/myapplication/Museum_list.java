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

public class Museum_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Osmani Museum");
        Names.add("• Museum of Rajas");


        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Museum_list.this, Museum.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Osmani Museum")) {
                    flag = 1;
                    intent.putExtra("Name","MAG Osmani Museum");
                    intent.putExtra("Add", "Naiorpul,Dhupadighir Par road, Sylhet-3100, Bangladesh");
                    intent.putExtra("lat", 24.894048); //24.894048, 91.877342
                    intent.putExtra("lng", 91.877342);
                }

                if (S_Position.equals("• Museum of Rajas")) {
                    flag = 2;
                    intent.putExtra("Name","Museum of Rajas");
                    intent.putExtra("Add","Jallarpar Road, Zindabazar, Sylhet 3100, Bangladesh");
                    intent.putExtra("lat", 24.894916); //24.894916, 91.867276
                    intent.putExtra("lng", 91.867276);
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
        return super.onOptionsItemSelected(item);
    }

}
