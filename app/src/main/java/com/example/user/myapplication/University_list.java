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

public class University_list extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Shahjalal University of Science and Technology");
        Names.add("• Sylhet Agricultural University");
        Names.add("• Leading University, Sylhet");
        Names.add("• Metropolitan University, Sylhet");
        Names.add("• Sylhet International University, Sylhet");
        Names.add("• North East University Bangladesh");


        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Names);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(University_list.this, University.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• Shahjalal University of Science and Technology")) {
                    flag = 1;
                    intent.putExtra("Name","Shahjalal University of Science and Technology");
                    intent.putExtra("Add"," Kumargaon, Sylhet-3114, Bangladesh");
                    intent.putExtra("Phn","Contact No: +880 821-713491");
                    intent.putExtra("lat", 24.920254); //24.920254, 91.832192
                    intent.putExtra("lng", 91.832192);
                }

                if (S_Position.equals("• Sylhet Agricultural University")) {
                    flag = 2;
                    intent.putExtra("Name","Sylhet Agricultural University");
                    intent.putExtra("Add","Alurtol Road, Sylhet 3100, Bangladesh ");
                    intent.putExtra("Phn","Contact No:  +880 821-760930 ");
                    intent.putExtra("lat", 24.909217); //24.909217, 91.901985
                    intent.putExtra("lng", 91.901985);

                }

                if (S_Position.equals("• Leading University, Sylhet")) {
                    flag = 3;
                    intent.putExtra("Name","Leading University, Sylhet");
                    intent.putExtra("Add","Surma Tower, VIP Road, Taltola, Sylhet-3100, Bangladesh. ");
                    intent.putExtra("Phn","Contact No:  +880-821-720303-6");
                    intent.putExtra("lat", 24.890128); //24.890128, 91.867659
                    intent.putExtra("lng", 91.867659);

                }

                if (S_Position.equals("• Metropolitan University, Sylhet")) {
                    flag = 4;
                    intent.putExtra("Name","Metropolitan University, Sylhet");
                    intent.putExtra("Add","Zindabazar, Sylhet-3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +88-0821-713077");
                    intent.putExtra("lat", 24.897211); //24.897211, 91.867611
                    intent.putExtra("lng", 91.867611);

                }
                if (S_Position.equals("• Sylhet International University, Sylhet")) {
                    flag = 5;
                    intent.putExtra("Name","Sylhet International University, Sylhet");
                    intent.putExtra("Add","Shamimabad, Bagbari, College Rd, Sylhet 3100, Bangladesh");
                    intent.putExtra("Phn","Contact No:  +880 821-717193");
                    intent.putExtra("lat", 24.901395); //24.901395, 91.843908
                    intent.putExtra("lng", 91.843908);

                }

                if (S_Position.equals("• North East University Bangladesh")) {
                    flag = 6;
                    intent.putExtra("Name","North East University Bangladesh");
                    intent.putExtra("Add","Telihaor, Sheikghat, Sylhet, Bangladesh.");
                    intent.putExtra("Phn","Contact No:  +880 821-717193");
                    intent.putExtra("lat", 24.890095); //24.890095, 91.860957
                    intent.putExtra("lng", 91.860957);

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

