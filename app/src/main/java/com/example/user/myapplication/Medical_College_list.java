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

public class Medical_College_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical__college_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• M.A.G. Osmani Medical College Hospital");
        Names.add("• Jalalabad Ragib-Rabeya Medical College & Hospital");
        Names.add("• Sylhet Women's Medical College Hospital");
        Names.add("• North East Medical College & Hospital");
        Names.add("• Park View Medical College Hospital");


//        String[] pcs = {
//                "•MAG Osmani Medical College Hospital",
//                "•Jalalabad Ragib-Rabeya Medical College ",
//                "•Sylhet Women's Medical College ",
//                "•North East Medical College",
//                "•Park View Medical College "
//
//
//        };
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Medical_College_list.this, Medical_College.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• M.A.G. Osmani Medical College Hospital")) {
                    flag = 1;
                    intent.putExtra("Name","M.A.G. Osmani Medical College Hospital");
                    intent.putExtra("Add","Medical College Rd, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-713667");
                    intent.putExtra("lat", 24.900118); //24.900118, 91.853096
                    intent.putExtra("lng", 91.853096);
                }

                if (S_Position.equals("• Jalalabad Ragib-Rabeya Medical College & Hospital")) {
                    flag = 2;
                    intent.putExtra("Name","Jalalabad Ragib-Rabeya Medical College & Hospital");
                    intent.putExtra("Add","Pathantula, Sylhet - 3100, Bangladesh ");
                    intent.putExtra("Phn","Contact No:  +880 821-719090 ");
                    intent.putExtra("lat", 24.913166); //24.913166, 91.852866
                    intent.putExtra("lng", 91.852866);

                }

                if (S_Position.equals("• Sylhet Women's Medical College Hospital")) {
                    flag = 3;
                    intent.putExtra("Name","Sylhet Women's Medical College Hospital");
                    intent.putExtra("Add","Noyashorok Road, Mirboxtola, Sylhet, Bangladesh ");
                    intent.putExtra("Phn","Contact No:  +880 821-720222");
                    intent.putExtra("lat", 24.898558); //24.898558, 91.872462
                    intent.putExtra("lng", 91.872462);

                }

                if (S_Position.equals("• North East Medical College & Hospital")) {
                    flag = 4;
                    intent.putExtra("Name","North East Medical College & Hospital");
                    intent.putExtra("Add","South Surma, Gohorpur Road, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-724413");
                    intent.putExtra("lat", 24.864779); //24.864779, 91.856790
                    intent.putExtra("lng", 91.856790);

                }

                if (S_Position.equals("• Park View Medical College Hospital")) {
                    flag = 5;
                    intent.putExtra("Name","Park View Medical College Hospital");
                    intent.putExtra("Add","Telihaor Rd, Sheikghat, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-728878");
                    intent.putExtra("lat", 24.890556); //24.890556, 91.862579
                    intent.putExtra("lng", 91.862579);

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

