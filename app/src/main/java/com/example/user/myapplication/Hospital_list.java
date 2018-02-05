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

public class Hospital_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• M.A.G. Osmani Medical College Hospital");
        Names.add("• Ibn Sina Hospital Sylhet Ltd.");
        Names.add("• Mount Adora Hospital");
        Names.add("• Lions Children Hospital");
        Names.add("• Royal Hospital and Research Centre Ltd.");
        Names.add("• Oasis Hospital");
        Names.add("• Jalalabad Ragib-Rabeya Medical College & Hospital");
        Names.add("• Park View Medical College Hospital");

        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.resort_list_item,R.id.resort_label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Hospital_list.this, Hospital.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• M.A.G. Osmani Medical College Hospital")) {
                    flag = 1;
                    intent.putExtra("Name","M.A.G. Osmani Medical College Hospital");
                    intent.putExtra("Add","Medical College Road, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-713667");
                    intent.putExtra("lat", 24.900118); //24.900118, 91.853097
                    intent.putExtra("lng", 91.853097);
                }

                if (S_Position.equals("• Ibn Sina Hospital Sylhet Ltd.")) {
                    flag = 2;
                    intent.putExtra("Name","Ibn Sina Hospital Sylhet Ltd.");
                    intent.putExtra("Add"," Subhani Ghat Point, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 1713-301523");
                    intent.putExtra("lat", 24.891698); //24.891698, 91.877589
                    intent.putExtra("lng", 91.877589);

                }

                if (S_Position.equals("• Mount Adora Hospital")) {
                    flag = 3;
                    intent.putExtra("Name","Mount Adora Hospital");
                    intent.putExtra("Add"," Kazitula,Nayasarak Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1732-239376");
                    intent.putExtra("lat", 24.899644); //24.899644, 91.874520
                    intent.putExtra("lng", 91.874520);

                }

                if (S_Position.equals("• Lions Children Hospital")) {
                    flag = 4;
                    intent.putExtra("Name","Lions Children Hospital");
                    intent.putExtra("Add"," Manik Prirer Tila Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-713636");
                    intent.putExtra("lat", 24.899250); //24.899250, 91.877278
                    intent.putExtra("lng", 91.877278);

                }
                if (S_Position.equals("• Royal Hospital and Research Centre Ltd.")) {
                    flag = 5;
                    intent.putExtra("Name","Royal Hospital and Research Centre Ltd.");
                    intent.putExtra("Add","Kazi Ilias Rd, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-714850");
                    intent.putExtra("lat", 24.896343); //24.896343, 91.867848
                    intent.putExtra("lng", 91.867848);

                }

                if (S_Position.equals("• Oasis Hospital")) {
                    flag = 6;
                    intent.putExtra("Name","Oasis Hospital");
                    intent.putExtra("Add","Bishwa Road, Subhanighat,Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1611-990000");
                    intent.putExtra("lat", 24.887967); //24.887967, 91.880064
                    intent.putExtra("lng", 91.880064);

                }
                if (S_Position.equals("• Jalalabad Ragib-Rabeya Medical College & Hospital")) {
                    flag = 7;
                    intent.putExtra("Name","Jalalabad Ragib-Rabeya Medical College & Hospital");
                    intent.putExtra("Add"," Pathantola Road, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-719090");
                    intent.putExtra("lat", 24.913167); //24.913167, 91.852866
                    intent.putExtra("lng", 91.852866);

                }

                if (S_Position.equals("• Park View Medical College Hospital")) {
                    flag = 8;
                    intent.putExtra("Name","Park View Medical College Hospital");
                    intent.putExtra("Add"," Telihaor Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-728878");
                    intent.putExtra("lat", 24.890555); //24.890555, 91.862578
                    intent.putExtra("lng", 91.862578);

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

