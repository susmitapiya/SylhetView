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

public class Resort_list extends AppCompatActivity {

    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resort_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Shuktara Nature Retreat");
        Names.add("• Grand Sylhet Hotel & Resort");
        Names.add("• Nazimgarh Resort");
        Names.add("• Excelsior Sylhet Hotel & Resort");


        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.resort_list_item,R.id.resort_label, Names);
        listView1.setAdapter(adapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Resort_list.this, Resort.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Shuktara Nature Retreat")) {
                    flag = 1;
                    intent.putExtra("Name","Shuktara Nature Retreat");
                    intent.putExtra("Add","Uddin Hills, Shahporan Uposhohor,Khadimnagar, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 1764-543535");
                    intent.putExtra("lat", 24.918074); //24.918074, 91.934050
                    intent.putExtra("lng", 91.934050);
                }

                if (S_Position.equals("• Grand Sylhet Hotel & Resort")) {
                    flag = 2;
                    intent.putExtra("Name","Grand Sylhet Hotel & Resort");
                    intent.putExtra("Add","Boroshala, Khadimnogor, Union Parishad, Airport Road, Shodor Sylhet, Bangladesh ");
                    intent.putExtra("Phn","Contact No:  +880 173-3083980 ");
                    intent.putExtra("lat", 24.954838); //24.954838, 91.861315
                    intent.putExtra("lng", 91.861315);

                }

                if (S_Position.equals("• Nazimgarh Resort")) {
                    flag = 3;
                    intent.putExtra("Name","Nazimgarh Resort");
                    intent.putExtra("Add","Nazimgarh, Khadim Nagar, Sylhet, Bangladesh.");
                    intent.putExtra("Phn","Contact No:  +880 192-6667444");
                    intent.putExtra("lat", 24.910814); //24.910814, 91.940470
                    intent.putExtra("lng", 91.940470);

                }

                if (S_Position.equals("• Excelsior Sylhet Hotel & Resort")) {
                    flag = 4;
                    intent.putExtra("Name","Excelsior Sylhet Hotel & Resort");
                    intent.putExtra("Add","Zakariyacity, Khadimpara, Sylhet,, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1733-200180");
                    intent.putExtra("lat", 24.930167); //24.930167, 91.949193
                    intent.putExtra("lng", 91.949193);

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

