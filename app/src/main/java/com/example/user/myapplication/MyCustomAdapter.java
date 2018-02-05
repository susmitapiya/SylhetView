package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by USER on 1/2/2017.
 */

public class MyCustomAdapter  extends BaseAdapter {

    String[] namesz;
    int[] imsz;
    Context ct;
    private static LayoutInflater inflater = null;

    public MyCustomAdapter(MainActivity mainActivity, String[] nameofos, int[] osins){

        namesz = nameofos;
        imsz = osins;
        ct = mainActivity;
        inflater =(LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return namesz.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class MyHolder{
        TextView tvs;
        ImageView ims;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {MyHolder myh = new MyHolder();
        View myv;

        myv=inflater.inflate(R.layout.custom_layout_item, null);
        myh.tvs=(TextView) myv.findViewById(R.id.textviewid);
        myh.ims=(ImageView) myv.findViewById(R.id.imageViewid);
        myh.tvs.setText(namesz[i]);
        myh.ims.setImageResource(imsz[i]);


        myv.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       //Toast.makeText(ct,"Click on "+ namesz[i], Toast.LENGTH_SHORT).show();
                                       if(i==0){
                                           Intent s= new Intent(view.getContext(), College_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==1){
                                           Intent s= new Intent(view.getContext(), School_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==2){
                                           Intent s= new Intent(view.getContext(), University_list.class);
                                           ct.startActivity(s);
                                       }

                                       if(i==3){
                                           Intent s= new Intent(view.getContext(), Medical_College_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==4){
                                           Intent s= new Intent(view.getContext(), Resort_list.class);
                                           ct.startActivity(s);
                                       }

                                       if(i==5){
                                           Intent s= new Intent(view.getContext(), Hotel_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==6){
                                           Intent s= new Intent(view.getContext(), Restaurant_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==7){
                                           Intent s= new Intent(view.getContext(), Bank_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==8){
                                           Intent s= new Intent(view.getContext(), Airport_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==9){
                                           Intent s= new Intent(view.getContext(), Bus_Station.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==10){
                                           Intent s= new Intent(view.getContext(), Railway_Station_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==11){
                                           Intent s= new Intent(view.getContext(), Hospital_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==12){
                                           Intent s= new Intent(view.getContext(), Shopping_Mall_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==13){
                                           Intent s= new Intent(view.getContext(), Mazar_list.class);
                                           ct.startActivity(s);
                                       }
                                       if(i==14){
                                           Intent s= new Intent(view.getContext(), Museum_list.class);
                                           ct.startActivity(s);
                                       }



                                       }
                               });

//        if (i % 2 == 0) {
//            myv.setBackgroundColor(Color.parseColor("#512DA8"));
//        }
//        else{
//            myv.setBackgroundColor(Color.parseColor("#283593"));
//        }


        return myv;
    }
}
