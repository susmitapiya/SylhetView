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

public class School_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Sylhet Government Pilot High School");
        Names.add("• Government Agragami Girl's High School and College");
        Names.add("• Blue Bird School and College");
        Names.add("• Shahjalal Jamia Islamia School & College");
        Names.add("• The Sylhet Khajanchibari International School and college");
        Names.add("• Police Line High School");
        Names.add("• The Aided High School");
        Names.add("• British Bangladesh International School");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.school_item_list,R.id.school_label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(School_list.this, School.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Sylhet Government Pilot High School")) {
                    flag = 1;
                    intent.putExtra("Name","Sylhet Government Pilot High School");
                    intent.putExtra("Add"," Dakbabnglow Road, Kalighat, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-716382");
                    intent.putExtra("lat", 24.888655); //24.888655, 91.871318
                    intent.putExtra("lng", 91.871318);
                }

                if (S_Position.equals("• Government Agragami Girl's High School and College")) {
                    flag = 2;
                    intent.putExtra("Name","Government Agragami Girl's High School and College");
                    intent.putExtra("Add","Zindabazar, Sylhet, Bangladesh ");
                    intent.putExtra("Phn","Contact No:  +880821-716237 ");
                    intent.putExtra("lat", 24.893111); //24.893111, 91.869021
                    intent.putExtra("lng", 91.869021);

                }

                if (S_Position.equals("• Blue Bird School and College")) {
                    flag = 3;
                    intent.putExtra("Name","Blue Bird School and College");
                    intent.putExtra("Add","Mirer Moydan, Subidbazar ,Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880821-716615");
                    intent.putExtra("lat", 24.904377); //24.904377, 91.859118
                    intent.putExtra("lng", 91.859118);

                }

                if (S_Position.equals("• Shahjalal Jamia Islamia School & College")) {
                    flag = 4;
                    intent.putExtra("Name","Shahjalal Jamia Islamia School & College");
                    intent.putExtra("Add","Mirabazar-Subhanighat Rd, Sylhet , Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-716841");
                    intent.putExtra("lat", 24.893430); //24.893430, 91.880756
                    intent.putExtra("lng", 91.880756);

                }
                if (S_Position.equals("• The Sylhet Khajanchibari International School and college")) {
                    flag = 5;
                    intent.putExtra("Name","The Sylhet Khajanchibari International School and college");
                    intent.putExtra("Add","  Nayasarak Rd, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-718011");
                    intent.putExtra("lat", 24.896546); //24.896546, 91.874204
                    intent.putExtra("lng", 91.874204);
                }

                if (S_Position.equals("• Police Line High School")) {
                    flag = 6;
                    intent.putExtra("Name","Police Line High School");
                    intent.putExtra("Add","Rikabi Bazar,Sylhet, Bangladesh ");
                    intent.putExtra("Phn","Contact No:  +880 821-719956 ");
                    intent.putExtra("lat", 24.900189); //24.900189, 91.862332
                    intent.putExtra("lng", 91.862332);

                }

                if (S_Position.equals("• The Aided High School")) {
                    flag = 7;
                    intent.putExtra("Name","The Aided High School");
                    intent.putExtra("Add", "Taitpara Road Zindabazar 3100 Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-7111111");
                    intent.putExtra("lat", 24.896276); //24.896276, 91.869816
                    intent.putExtra("lng", 91.869816);

                }

                if (S_Position.equals("• British Bangladesh International School")) {
                    flag = 8;
                    intent.putExtra("Name","British Bangladesh International School");
                    intent.putExtra("Add","93-94 Housing Estate, Amberkhana, Sylhet, Housing Estate Road, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-719354");
                    intent.putExtra("lat", 24.912669); //24.912669, 91.866950
                    intent.putExtra("lng", 91.866950);

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
