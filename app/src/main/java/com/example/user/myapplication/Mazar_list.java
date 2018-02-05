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

public class Mazar_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazar_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Hazrat Shah Jalal (R) Mazar Sharif");
        Names.add("• Hazrat Shah Poran (R) Mazar");
        Names.add("• Hazi Shamir (R) Jame Mazar");
        Names.add("• Gorom Dewan Mazar");


        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Mazar_list.this, Mazar.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Hazrat Shah Jalal (R) Mazar Sharif")) {
                    flag = 1;
                    intent.putExtra("Name","Hazrat Shah Jalal Mazar Sharif");
                    intent.putExtra("Add","Dargah Gate, Sylhet-3100, Bangladesh");
                    intent.putExtra("lat", 24.902231); //24.902231, 91.866032
                    intent.putExtra("lng", 91.866032);
                }

                if (S_Position.equals("• Hazrat Shah Poran (R) Mazar")) {
                    flag = 2;
                    intent.putExtra("Name","Hazrat Shah Poran (R) Mazar");
                    intent.putExtra("Add","Shah-Paran Gate,Sylhet, Bangladesh");
                    intent.putExtra("lat", 24.906634); //24.906634, 91.934650
                    intent.putExtra("lng", 91.934650);

                }
                if (S_Position.equals("• Hazi Shamir (R) Jame Mazar")) {
                    flag = 3;
                    intent.putExtra("Name","Hazi Shamir (R) Jame Mazar");
                    intent.putExtra("Add","Roynagar Rajbari Road, Sylhet, Bangladesh");
                    intent.putExtra("lat", 24.906286); //24.906286, 91.883672
                    intent.putExtra("lng", 91.883672);

                }
                if (S_Position.equals("• Gorom Dewan Mazar")) {
                    flag = 4;
                    intent.putExtra("Name","Gorom Dewan Mazar");
                    intent.putExtra("Add","Sheikh Ghat,VIP Road, Sylhet, Bangladesh");
                    intent.putExtra("lat", 24.892061); //24.892061, 91.860197
                    intent.putExtra("lng", 91.860197);

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

