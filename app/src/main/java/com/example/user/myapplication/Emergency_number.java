package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Emergency_number extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_number);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• Fire service -191, 0821-716222, 0821-713998,");
        Names.add(" Fire service ambulance – 0821-712918");
        Names.add("• Electricity Office – 0821-717021, 717059 ");
        Names.add("• Jalalabad Gas Office – 0821-717092");
        Names.add("• City Corporation-Sylhet – 0821-716681, 01711336424 ");
        Names.add("• Divisional Commissioner Office – 0821-715080, 01730331000");
        Names.add("• Zilla Proshason Office – 0821-841080, 01715297405");
        Names.add("• Metropolitan Police Commissioner – 01713374507");
        Names.add("• Police Super,Sylhet – 01713374366");
        Names.add("• Sobhani Ghat Police Station – 0821-718027");
        Names.add("• Kotoyali Model Thana – 0821-713433, 01713374517");
        Names.add("• Dokkhin Surma Thana – 01713374518 ");
        Names.add("• Shah Poran Thana – 01713374520 ");
        Names.add("• Jalalabad Thana – 01713374522 ");
        Names.add("• Sadar Hospital (Emergency) – 0821-713506,715502 ");
        Names.add("• M.A.G Osmani Hospital (Emergency) – 0821-717055,814655");
        Names.add("• Civil Srjon – 0821-716313,716308");
        Names.add("• IBN Sina Hospital – 0821-727933,01713301523");
        Names.add("• M.A.G Osmani Internatioal Airport – 0821-717016");
        Names.add("• Passport Office – 0821-714022");
        Names.add("• Zilla Parishad Election Office – 0821-714134");
        Names.add("• The Daily Sylheter Dak – 0821-714634");
        Names.add("• Police Control Room-Sylhet – 0821-2830315,01713374517");
        Names.add("• RAB Control Room – 0821-2860015,01199750021");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position ==0){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-716222"));
                    startActivity(call);
                }
                if(position ==1){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-712918"));
                    startActivity(call);
                }
                if(position ==2){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-717021"));
                    startActivity(call);
                }
                if(position ==3){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-717092"));
                    startActivity(call);
                }
                if(position ==4){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-716681"));
                    startActivity(call);
                }
                if(position ==5){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01730331000"));
                    startActivity(call);
                }
                if(position ==6){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01715297405"));
                    startActivity(call);
                }
                if(position ==7){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01713374507"));
                    startActivity(call);
                }
                if(position ==8){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01713374366"));
                    startActivity(call);
                }
                if(position ==9){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-718027"));
                    startActivity(call);
                }
                if(position ==10){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01713374517"));
                    startActivity(call);
                }
                if(position ==11){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01713374518"));
                    startActivity(call);
                }
                if(position ==12){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01713374520"));
                    startActivity(call);
                }
                if(position ==13){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01713374522"));
                    startActivity(call);
                }
                if(position ==14){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-713506"));
                    startActivity(call);
                }
                if(position ==15){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-717055"));
                    startActivity(call);
                }
                if(position ==16){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-716313"));
                    startActivity(call);
                }
                if(position ==17){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01713301523"));
                    startActivity(call);
                }
                if(position ==18){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-717016"));
                    startActivity(call);
                }
                if(position ==19){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-714022"));
                    startActivity(call);
                }
                if(position ==20){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-714134"));
                    startActivity(call);
                }
                if(position ==21){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-714634"));
                    startActivity(call);
                }
                if(position ==22){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "01713374517"));
                    startActivity(call);
                }
                if(position ==23){
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel: " + "0821-2860015"));
                    startActivity(call);
                }


            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        int id = item.getItemId();
        if (id == R.id.action_home) {
            Toast.makeText(getApplicationContext(),"You click On home",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
