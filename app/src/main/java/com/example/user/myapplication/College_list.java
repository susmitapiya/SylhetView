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
import java.util.Arrays;

public class College_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• MC College");
        Names.add("• Sylhet Government College");
        Names.add("• Sylhet Government Women's College");
        Names.add("• Madan Mohan College");
        Names.add("• Sylhet Commerce College");
        Names.add("• SCHOLARSHOME");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(College_list.this, College.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• MC College")) {
                    flag = 1;
                    intent.putExtra("Name","MC College");
                    intent.putExtra("Add","Tilagar,Tamabil Rd, Sylhet-3100");
                    intent.putExtra("Phn","Contact No:  +880 1729-304801");
                    intent.putExtra("lat", 24.898382); //24.898382, 91.902327
                    intent.putExtra("lng", 91.902327);
                }

                if (S_Position.equals("• Sylhet Government College")) {
                    flag = 2;
                    intent.putExtra("Name","Sylhet Government College");
                    intent.putExtra("Add","SGC Way,Tamabil Rd, Sylhet-3100");
                    intent.putExtra("Phn","Contact No:  +880 1821-760435");
                    intent.putExtra("lat", 24.897134); //24.897134, 91.904678
                    intent.putExtra("lng", 91.904678);

                }

                if (S_Position.equals("• Sylhet Government Women's College")) {
                    flag = 3;
                    intent.putExtra("Name","Sylhet Government Women's College");
                    intent.putExtra("Add","Hazrat Shahjalal Rd, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1736-988978");
                    intent.putExtra("lat", 24.898212); //24.898212, 91.868876
                    intent.putExtra("lng", 91.868876);

                }

                if (S_Position.equals("• Madan Mohan College")) {
                    flag = 4;
                    intent.putExtra("Name","• Madan Mohan College");
                    intent.putExtra("Add","Lamabazar Rd, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1720-185439");
                    intent.putExtra("lat", 24.896835); //24.896835, 91.861939
                    intent.putExtra("lng", 91.861939);

                }
                if (S_Position.equals("• Sylhet Commerce College")) {
                    flag = 5;
                    intent.putExtra("Name","Sylhet Commerce College");
                    intent.putExtra("Add","Ornob-32, Mirer Moydan,Kewapara Road, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1912-841135");
                    intent.putExtra("lat", 24.902419); //24.902419, 91.862825
                    intent.putExtra("lng", 91.862825);

                }
                if (S_Position.equals("• SCHOLARSHOME")) {
                    flag = 6;
                    intent.putExtra("Name","SCHOLARSHOME");
                    intent.putExtra("Add","Shahi Eidgah,Tilagor Road, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-725627");
                    intent.putExtra("lat", 24.908241); //24.908241, 91.887452
                    intent.putExtra("lng", 91.887452);

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
