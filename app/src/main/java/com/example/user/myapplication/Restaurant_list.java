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

public class Restaurant_list extends AppCompatActivity {
    ListView listView1;

    ArrayList<String> Names;
    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Panshi Restaurant");
        Names.add("• Palki Restaurant");
        Names.add("• Bhujon Bari");
        Names.add("• Woondal");
        Names.add("• Pritiraj Restaurant");
        Names.add("• Pach Vai Restaurent");
        Names.add("• Hum Tum Restaurant");
        Names.add("• Royal Chef");
        Names.add("• Hamadan Restaurant");
        Names.add("• Eatopia Restaurant");
        Names.add("• Moshrafia Restaurant");
        Names.add("• Surma River Cruise Restaurant");

        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.resort_list_item,R.id.resort_label, Names);
        listView1.setAdapter(adapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Restaurant_list.this, Restaurant.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Panshi Restaurant")) {
                    flag = 1;
                    intent.putExtra("Name","Panshi Restaurant");
                    intent.putExtra("Add","Jallarpar Road Zindabazar, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 1761-152939");
                    intent.putExtra("lat", 24.895010); //24.895010, 91.867481
                    intent.putExtra("lng", 91.867481);
                }

                if (S_Position.equals("• Palki Restaurant")) {
                    flag = 2;
                    intent.putExtra("Name","Palki Restaurant");
                    intent.putExtra("Add","Shohir Plaza, East, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1715-396467");
                    intent.putExtra("lat", 24.894944); //24.894944, 91.869593
                    intent.putExtra("lng", 91.869593);

                }

                if (S_Position.equals("• Bhujon Bari")) {
                    flag = 3;
                    intent.putExtra("Name","Bhujon Bari");
                    intent.putExtra("Add","Jallarpar Road Zindabazar, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1711-932681");
                    intent.putExtra("lat", 24.894763); //24.894763, 91.867574
                    intent.putExtra("lng", 91.867574);

                }

                if (S_Position.equals("• Woondal")) {
                    flag = 4;
                    intent.putExtra("Name","Woondal");
                    intent.putExtra("Add","East Zindabazar, Sylhet City 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 1717-020505");
                    intent.putExtra("lat", 24.895289); //24.895289, 91.870809
                    intent.putExtra("lng", 91.870809);

                }
                if (S_Position.equals("• Pritiraj Restaurant")) {
                    flag = 5;
                    intent.putExtra("Name","Pritiraj Restaurant");
                    intent.putExtra("Add","Zindabazar point, Baruthkhana Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1712-150636");
                    intent.putExtra("lat", 24.895166); //24.895166, 91.868863
                    intent.putExtra("lng", 91.868863);

                }
                if (S_Position.equals("• Pach Vai Restaurent")) {
                    flag = 6;
                    intent.putExtra("Name","Pach Vai Restaurent");
                    intent.putExtra("Add","Dariapara Road,Jallarpar, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1711-932681");
                    intent.putExtra("lat", 24.894963); //24.894963, 91.866481
                    intent.putExtra("lng", 91.866481);

                }

                if (S_Position.equals("• Hum Tum Restaurant")) {
                    flag = 7;
                    intent.putExtra("Name","Hum Tum Restaurant");
                    intent.putExtra("Add","Nayasarak,3100 Sylhet, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1673-447454");
                    intent.putExtra("lat", 24.897637); //24.897637, 91.873893
                    intent.putExtra("lng", 91.873893);

                }

                if (S_Position.equals("• Royal Chef")) {
                    flag = 8;
                    intent.putExtra("Name","Royal Chef");
                    intent.putExtra("Add"," 758 Lamabazar, Mirza Jangal Road, Sylhet 3100, Bangladesh.");
                    intent.putExtra("Phn","Contact No:  +880 1611-723096");
                    intent.putExtra("lat", 24.895495); //24.895495, 91.862312
                    intent.putExtra("lng", 91.862312);

                }
                if (S_Position.equals("• Hamadan Restaurant")) {
                    flag = 9;
                    intent.putExtra("Name","Hamadan Restaurant");
                    intent.putExtra("Add"," 3rd Floor,Al-Hamra Shopping City, Hazrat Shahjalal Rd, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +968 9481 0073");
                    intent.putExtra("lat", 24.897144); //24.897144, 91.867579
                    intent.putExtra("lng", 91.867579);

                }
                if (S_Position.equals("• Eatopia Restaurant")) {
                    flag = 10;
                    intent.putExtra("Name","Eatopia Restaurant");
                    intent.putExtra("Add","Barutkhana Point, East Zindabazar, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1617-123321");
                    intent.putExtra("lat", 24.895672); //24.895672, 91.871878
                    intent.putExtra("lng", 91.871878);

                }
                if (S_Position.equals("• Moshrafia Restaurant")) {
                    flag = 11;
                    intent.putExtra("Name","Moshrafia Restaurant");
                    intent.putExtra("Add","Near to Rongmohal Tower,Bandar Bazar Road, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1617-123321");
                    intent.putExtra("lat", 24.891808); //24.891808, 91.873458
                    intent.putExtra("lng", 91.873458);

                }
                if (S_Position.equals("• Surma River Cruise Restaurant")) {
                    flag = 12;
                    intent.putExtra("Name","Surma River Cruise Restaurant");
                    intent.putExtra("Add","Kean Bridge, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 1760-208787");
                    intent.putExtra("lat", 24.887880); //24.887880, 91.867620
                    intent.putExtra("lng", 91.867620);

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

