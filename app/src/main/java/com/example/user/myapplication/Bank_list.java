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

public class Bank_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Bangladesh Bank");
        Names.add("• Rupali Bank Limited");
        Names.add("• Islami Bank Bangladesh Limited");
        Names.add("• National Bank Limited");
        Names.add("• Southeast Bank Limited");
        Names.add("• Shahjalal Islami Bank Limited");
        Names.add("• EXIM Bank Limited");
        Names.add("• AB Bank Limited");
        Names.add("• Agrani Bank Limited");


        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Bank_list.this, Bank.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Bangladesh Bank")) {
                    flag = 1;
                    intent.putExtra("Name","Bangladesh Bank");
                    intent.putExtra("Add","Telihaor Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-716298");
                    intent.putExtra("lat", 24.890286); //24.890286, 91.866231
                    intent.putExtra("lng", 91.866231);
                }

                if (S_Position.equals("• Rupali Bank Limited")) {
                    flag = 2;
                    intent.putExtra("Name","Rupali Bank Limited");
                    intent.putExtra("Add","Rikabi Bazar Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-714978");
                    intent.putExtra("lat", 24.898538); //24.898538, 91.861873
                    intent.putExtra("lng", 91.861873);

                }

                if (S_Position.equals("• Islami Bank Bangladesh Limited")) {
                    flag = 3;
                    intent.putExtra("Name","Islami Bank Bangladesh Limited");
                    intent.putExtra("Add","Sylhet Branch, Telihaor Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-715502");
                    intent.putExtra("lat", 24.891011); //24.891011, 91.866304
                    intent.putExtra("lng", 91.866304);

                }

                if (S_Position.equals("• National Bank Limited")) {
                    flag = 4;
                    intent.putExtra("Name","National Bank Limited");
                    intent.putExtra("Add","West World Shopping City (2nd Floor), Jallarpar Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-717157");
                    intent.putExtra("lat", 24.894469); //24.894469, 91.867291
                    intent.putExtra("lng", 91.867291);

                }

                if (S_Position.equals("• Southeast Bank Limited")) {
                    flag = 5;
                    intent.putExtra("Name","Southeast Bank Limited");
                    intent.putExtra("Add","Laldighirpar Road, Bandar Bazar, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-715736");
                    intent.putExtra("lat", 24.890422); //24.890422, 91.872723
                    intent.putExtra("lng", 91.872723);

                }


                if (S_Position.equals("• Shahjalal Islami Bank Limited")) {
                    flag = 6;
                    intent.putExtra("Name","Shahjalal Islami Bank Limited");
                    intent.putExtra("Add","Al-Falah Tower (1st floor), Dhupadighir Purbopar, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-725115");
                    intent.putExtra("lat", 24.893037); //24.893037, 91.876514
                    intent.putExtra("lng", 91.876514);

                }

                if (S_Position.equals("• EXIM Bank Limited")) {
                    flag = 7;
                    intent.putExtra("Name","EXIM Bank Limited");
                    intent.putExtra("Add","Mujtoba Tower, Kazi Ilias Rd, Zindabazar, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-724413");
                    intent.putExtra("lat", 24.896514); //24.896514, 91.868266
                    intent.putExtra("lng", 91.868266);

                }

                if (S_Position.equals("• AB Bank Limited")) {
                    flag = 8;
                    intent.putExtra("Name","AB Bank Limited");
                    intent.putExtra("Add","Raj Manjil, Dargah Gate, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-715736");
                    intent.putExtra("lat", 24.902362); //24.902362, 91.868459
                    intent.putExtra("lng", 91.868459);


                }
                if (S_Position.equals("• Agrani Bank Limited")) {
                    flag = 9;
                    intent.putExtra("Name","Agrani Bank Limited");
                    intent.putExtra("Add","Rangmahal Tower (2nd Floor), Bandar Bazar Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-716177");
                    intent.putExtra("lat", 24.891839); //24.891839, 91.873698
                    intent.putExtra("lng", 91.873698);

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

