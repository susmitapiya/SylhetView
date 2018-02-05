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

public class Hotel_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Hotel Star Pacific");
        Names.add("• Rose View Hotel");
        Names.add("• Richmond Hotel & Apartments");
        Names.add("• Britannia Hotel");
        Names.add("• Nirvana Inn");
        Names.add("• Hotel Supreme & Exotica Restaurant");
        Names.add("• Hotel Garden Inn");

        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Hotel_list.this, Hotel1.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Hotel Star Pacific")) {
                    flag = 1;
                    intent.putExtra("Name","Hotel Star Pacific");
                    intent.putExtra("Add","982,East Dargah Gate, Sylhet-3100 Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-727945");
                    intent.putExtra("lat", 24.901985); //24.901985, 91.868723
                    intent.putExtra("lng", 91.868723);
                }

                if (S_Position.equals("• Rose View Hotel")) {
                    flag = 2;
                    intent.putExtra("Name","Rose View Hotel");
                    intent.putExtra("Add","Shahjalal Upashahar Main Rd, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-721439 ");
                    intent.putExtra("lat", 24.886076); //24.886076, 91.881178
                    intent.putExtra("lng", 91.881178);

                }

                if (S_Position.equals("• Richmond Hotel & Apartments")) {
                    flag = 3;
                    intent.putExtra("Name","Richmond Hotel & Apartments");
                    intent.putExtra("Add","10th Floor, Al Hamra Shopping City, Hazrat Shahjalal Road, Zindabazar, Sylhet-3100, Bangladesh.");
                    intent.putExtra("Phn","Contact No:  +880 821-719076");
                    intent.putExtra("lat", 24.897229); //24.897229, 91.868002
                    intent.putExtra("lng", 91.868002);

                }

                if (S_Position.equals("• Britannia Hotel")) {
                    flag = 4;
                    intent.putExtra("Name","Britannia Hotel");
                    intent.putExtra("Add","Hazrat Shahjalal Road, Amberkhana, Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-711281");
                    intent.putExtra("lat", 24.904447); //24.904447, 91.869467
                    intent.putExtra("lng", 91.869467);

                }
                if (S_Position.equals("• Nirvana Inn")) {
                    flag = 5;
                    intent.putExtra("Name","Nirvana Inn");
                    intent.putExtra("Add","Mirzajangal, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-727640");
                    intent.putExtra("lat", 24.893477); //24.893477, 91.863770
                    intent.putExtra("lng", 91.863770);

                }

                if (S_Position.equals("• Hotel Supreme & Exotica Restaurant")) {
                    flag = 6;
                    intent.putExtra("Name","Hotel Supreme & Exotica Restaurant");
                    intent.putExtra("Add","East Mirabazar, Tamabil Road, Sylhet 3100, Bangladesh.");
                    intent.putExtra("Phn","Contact No:  +880 1711-197012");
                    intent.putExtra("lat", 24.895204); //24.895204, 91.882947
                    intent.putExtra("lng", 91.882947);

                }

                if (S_Position.equals("• Hotel Garden Inn")) {
                    flag = 7;
                    intent.putExtra("Name","Hotel Garden Inn");
                    intent.putExtra("Add","Garden Tower,Shahjalal Bridge Link Road,Sylhet 3100, Bangladesh.");
                    intent.putExtra("Phn","Contact No:  +880 821-727284");
                    intent.putExtra("lat", 24.885330); //24.885330, 91.880367
                    intent.putExtra("lng", 91.880367);

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

