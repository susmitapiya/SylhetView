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

public class Shopping_Mall_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping__mall_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Alhamra Shopping City");
        Names.add("• Sylhet City Centre");
        Names.add("• Blue Water Shopping City");
        Names.add("• West World Shopping City");
        Names.add("• Shukria Market");
        Names.add("• Manru Shopping City");
        Names.add("• Karim Ullah Market");
        Names.add("• Maha shopping mall");
        Names.add("• Aarong Sylhet");


       //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Shopping_Mall_list.this, Shopping_Mall.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Alhamra Shopping City")) {
                    flag = 1;
                    intent.putExtra("Name","Alhamra Shopping City");
                    intent.putExtra("Add","Zindabazar, Sylhet 3100,Bangladesh.");
                    intent.putExtra("Phn","Contact No:  +880 821719612");
                    intent.putExtra("lat", 24.897209); //24.897209, 91.867829
                    intent.putExtra("lng", 91.867829);
                }

                if (S_Position.equals("• Sylhet City Centre")) {
                    flag = 2;
                    intent.putExtra("Name","Sylhet City Centre");
                    intent.putExtra("Add","Zindabazar, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-715787");
                    intent.putExtra("lat", 24.895738); //24.895738, 91.868342
                    intent.putExtra("lng", 91.868342);
                }

                if (S_Position.equals("• Blue Water Shopping City")) {
                    flag = 3;
                    intent.putExtra("Name","Blue Water Shopping City");
                    intent.putExtra("Add","Jallar Par Road,Zindabazar, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-714090");
                    intent.putExtra("lat", 24.894940); //24.894940, 91.868553
                    intent.putExtra("lng", 91.868553);

                }

                if (S_Position.equals("• West World Shopping City")) {
                    flag = 4;
                    intent.putExtra("Name","West World Shopping City");
                    intent.putExtra("Add","Jallarpar Road, Zindabazar, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-711238");
                    intent.putExtra("lat", 24.894313); //24.894313, 91.867315
                    intent.putExtra("lng", 91.867315);

                }

                if (S_Position.equals("• Shukria Market")) {
                    flag = 5;
                    intent.putExtra("Name","Shukria Market");
                    intent.putExtra("Add","Zindabazar, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  ");
                    intent.putExtra("lat", 24.894380); //24.894380, 91.869374
                    intent.putExtra("lng", 91.869374);

                }

                if (S_Position.equals("• Manru Shopping City")) {
                    flag = 6;
                    intent.putExtra("Name","Manru Shopping City");
                    intent.putExtra("Add","Chowhatta, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1911-186157");
                    intent.putExtra("lat", 24.899514); //24.899514, 91.869863
                    intent.putExtra("lng", 91.869863);
                }

                if (S_Position.equals("• Karim Ullah Market")) {
                    flag = 7;
                    intent.putExtra("Name","Karim Ullah Market");
                    intent.putExtra("Add","Bondor Bazaar, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1911-224260");
                    intent.putExtra("lat", 24.892022); //24.892022, 91.872241
                    intent.putExtra("lng", 91.872241);
                }
                if (S_Position.equals("• Maha shopping mall")) {
                    flag = 8;
                    intent.putExtra("Name","Maha");
                    intent.putExtra("Add","Maha Tower, Nayasarak Road, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-715420");
                    intent.putExtra("lat", 24.897341); //24.897341, 91.873790
                    intent.putExtra("lng", 91.873790);
                }
                if (S_Position.equals("• Aarong Sylhet")) {
                    flag = 9;
                    intent.putExtra("Name","Aarong Sylhet");
                    intent.putExtra("Add"," Nayasarak Road, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-713150");
                    intent.putExtra("lat", 24.897243); //24.897243, 91.873703
                    intent.putExtra("lng", 91.873703);
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
