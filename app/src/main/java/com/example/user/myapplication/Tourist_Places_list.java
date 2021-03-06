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

public class Tourist_Places_list extends AppCompatActivity {

    ListView listView1;
    ArrayList<String> Names;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist__places_list);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView1 = (ListView) findViewById(R.id.listviewc);
        Names = new ArrayList<String>();

        Names.add("• JAFLONG");
        Names.add("• PANTHUMAI");
        Names.add("• RATARGUL");
        Names.add("• LOVACHORA");
        Names.add("• BISNAKHANDI");
        Names.add("• LALAKHAL");
        Names.add("• KHADIMNAGAR RAIN FOREST");
        Names.add("• BHOLAGONJ");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item,R.id.label, Names);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String S_Position = Names.get(position);

                Intent intent = new Intent(Tourist_Places_list.this, Tourist_Places_in_Sylhet.class);
                intent.putExtra("ID", S_Position);
                if (S_Position.equals("• JAFLONG")) {
                    flag = 1;
                    intent.putExtra("Name","JAFLONG");
                    intent.putExtra("Overview", "বিবরণঃ\n" +
                            "অনিয়ন্ত্রিত পাথর উত্তোলন ও পাথরভাঙ্গা ( ক্রাশার) মেশিনের উৎপাতে আগের সেই সৌন্দর্য্য অবশিষ্ট না থাকলে ও এখনো সিলেটে বেড়াতে আসা পর্যটকদের কাছে জাফলং ‘মাস্ট সি’ গন্তব্য। উত্তর খাসিয়া হিলস থেকে নেমে আসা ডাউকী নদী বাংলাদেশে প্রবেশ করেছে পিয়াইন নাম নিয়ে, এই পিয়াইন নদীর অববাহিকাতেই জাফলং- সিলেট জেলার গোয়াইনঘাট উপজেলার পূর্ব জাফলং ইউনিয়নে। সিলেট শহর থেকে ৬২ কিমি উত্তর-পূর্বে এর অবস্থান, গাড়ী থেকে নেমে ভাড়ার নৌকা নিয়ে জিরোপয়েন্টে যাওয়া যায়, যেখানে রয়েছে ডাউকি’র ঝুলন্ত সেতু। খেয়া বা ভাড়া নৌকায় নদী পেরিয়ে পশ্চিম তীরে গেলে খাসিয়া আদিবাসীদের গ্রাম সংগ্রামপুঞ্জি ও নকশীয়াপুঞ্জি। নদীর পাড় থেকে স্থানীয় বাহনযোগে এসব পুঞ্জী ঘুরে বেড়ানো যায়। নকশীয়াপুঞ্জির পাশেই জাফলং চা বাগান। কোন কোন পর্যটক চা বাগানে ঘুরে বেড়াতে ও পছন্দ করেন। \n" +
                            "জাফলং যাওয়ার সাত কিঃমি আগে তামাবিলে ও পর্যটকরা যাত্রাবিরতি করেন। তামাবিল মুলতঃ ল্যান্ড কাস্টমস ও ইমিগ্রেশন চেকপোষ্ট। কাস্টমস অফিসের ঠিক পেছনেই সীমান্তরেখা ঘেঁষে অবস্থান করছে মুক্তিযুদ্ধে শহীদ মুক্তিযোদ্ধাদের গনকবর। \n" +
                            "তামাবিল যাওয়ার আগে জৈন্তিয়াপুর উপজেলা সদর। ইতিহাসপ্রিয় পর্যটকরা এখানে পুরনো রাজবাড়ীর ধ্বংসাবশেষ দেখে যেতে পারেন। উল্লেখ্য যে, প্রাগৈতিহাসিককাল থেকে জৈন্তিয়া ছিলো একটি স্বাধীন রাজ্য যা ১৮৩০ সালে বৃটিশ সাম্রাজ্যের দখলভুক্ত হয়। প্রাচীন রাজ্য জৈন্তিয়ার গুরুত্বপূর্ণ জনগোষ্ঠী খাসিয়াদের স্মৃতিচিহ্ন হিসেবে এখনো কিছু ম্যাগালিথিক স্মৃতিস্তম্ভ চোখে পড়ে। জ়ৈন্তিয়াপুর উপজেলা অফিসের কাছেই রয়েছে সাইট্রাস গবেষনা কেন্দ্র। তেজপাতা, লেবু, সাতকড়া সহ বিভিন্ন প্রজাতির ফলের বাগান রয়েছে এখানে, এই গবেষনা কেন্দ্র থেকে অদূরেই বেশ কয়েকটি ঝর্ণা দৃশ্যমান। \n" +
                            "জৈন্তিয়াপুর ও তামাবিল এর মাঝামঝি রয়েছে শ্রীপুর। হাতের বামে শ্রীপুর পিকনিক সেন্টার, ডানপাশে একটূ এগিয়ে গেলেই শ্রীপুর পাথর কোয়ারী। \n" +
                            "বিশেষ করে বর্ষাকালে জৈন্তাপুর থেকে তামাবিল পর্যন্ত ভ্রমন এক অনন্য অভিজ্ঞতা। সড়কের পাশেই মাথা উঁচু করে দাঁড়িয়ে আছে বিশাল খাসিয়া পর্বত, ঘনসবুজে ঢাকা। এই সবুজের মধ্যে সাদা মেঘের দূরন্ত খেলা আর অনেকগুলো ঝর্ণার উচ্ছ্বাস। \n" +
                            "\n" +
                            "সিলেট থেকে দূরত্বঃ\n" +
                            "সিলেট শহর থেকে ৬২ কিমি উত্তর-পূর্বে এর অবস্থান।\n" +
                            "\n" +
                            "ভাড়াঃ\n" +
                            "সরাসরি জাফলং যেতে সিলেট থেকে গাড়ীতে সময় লাগে একঘন্টা ত্রিশ মিনিটের মতো। জৈন্তাপুর, শ্রীপুর, তামাবিলে যাত্রাবিরতি করলে সময় সেই অনুযায়ী বেশী লাগবে। সিলেট শহর থেকে ৬-৮ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৪৫০০ - ৫০০০ টাকার মধ্যে। ৯-১২ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৫৫০০ - ৬০০০ টাকার মধ্যে। নৌকা নিয়ে জিরোপয়েন্টে যেতে স্থানীয় নৌকায় ৫০০ টাকার মতো খরচ পড়ে।\n" +
                            "\n");
                }

                if (S_Position.equals("• PANTHUMAI")) {
                    flag = 2;
                    intent.putExtra("Name","PANTHUMAI");
                    intent.putExtra("Overview","বিবরণঃ\n" +
                            "পাংথুমাই সিলেট জেলার গোয়াইনঘাট উপজেলার পশ্চিমজাফলং ইউনিয়নের একটি গ্রাম। গ্রামটি মেঘালয় পর্বত শ্রেনীর পূর্ব খাসিয়া হিলসের কোলে। ছিমছাম, ছবির মতো সুন্দর এই গ্রামটির অন্যতম আকর্ষন হচ্ছে বিশাল ‘বড়হিল’ ঝর্ণা। যদিও ঝর্ণাটি ভৌগলিকভাবে ভারতের অন্তর্ভুক্ত কিন্তু একেবারে সামনাসামনি দাঁড়িয়েই এর উপচে পড়া সৌন্দর্য্য উপভোগ করা যায়। ঝর্নার নীচ থেকে বয়ে চলা পিয়াইন এর একটি শাখা নদী পশ্চিম দিকে প্রবাহমান। এই নদী ধরে আরেকটি পর্যটক গন্তব্য বিছনাকান্দি যাওয়া যায়।\n" +
                            "পাংথুমাই যেতে হলে প্রথমে আসতে হবে গোয়াইনঘাট উপজেলা সদরে। সিলেট থেকে জাফলং রোড ধরে সারীঘাট( ৪২ কিমি) পৌঁছে হাতের বামদিকে ১৬ কিমি গেলেই গোয়াইনঘাট পয়েন্ট থেকে ডানে রাস্তা চলে গেছে উপজেলা অফিসে, বামের রাস্তা সিলেট এয়ারপোর্টের দিকে। বামের রাস্তায় এক কিমির মতো এগুলে গোয়াইনঘাট কলেজ। কলেজের পাশ দিয়ে পূর্বদিকে সরু রাস্তা ধরে ১২ কিমি এর মতো এগিয়ে গেলেই পাংথুমাই গ্রাম। এর আগে মাতুরতল বাজার। গ্রামের ভেতর পর্যন্ত পাকা রাস্তা। গাড়ী থেকে নেমে হাতের বামে গেলেই দৃশ্যমান- অপূর্ব সেই জলপ্রপাত। \n" +
                            "ঝর্না ছাড়াও গোয়াইনঘাট-পাংথুমাই পথটি ও আকর্ষনীয়। পূর্ব দিকে এগুতে এগুতে বিশাল পাহাড় ক্রমশঃ কাছে এগিয়ে আসতে থাকে। নীল থেকে ক্রমশঃ সবুজ হয়ে উঠে, এর মধ্যে মাঝেমাঝেই মেঘ ও ঝর্ণার লুকোচুরি। \n" +
                            "\n" +
                            "সিলেট থেকে দূরত্বঃ\n" +
                            "সিলেট শহর থেকে ৭০ কিমি দূরত্ব এর অবস্থান।\n" +
                            "\n" +
                            "ভাড়াঃ\n" +
                            "সরাসরি সিলেট থেকে পাংথুমাই ৬-৮ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৫৫০০ - ৬০০০ টাকার মধ্যে। ৯-১২ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৬৫০০ - ৭,৫০০ টাকার মধ্যে। শুক্রবার হলে আরেকটু বেশী ও হতে পারে।\n");
                }

                if (S_Position.equals("• RATARGUL")) {
                    flag = 3;
                    intent.putExtra("Name","RATARGUL");
                    intent.putExtra("Overview","বিবরণঃ\n" +
                            "রাতারগুল বাংলাদেশের একমাত্র ফ্রেসওয়াটার সোয়াম্প ফরেস্ট। একসময় বিশাল এলাকা জুড়ে এই বনের অস্তিত্ব থাকলে ও এখন দুই বর্গকিমি এর মতো জায়গাজুড়ে টিকে আছে। এটি মুলতঃ হিজল ও কড়চ জাতিয় গাছের ঘনবন। বিভিন্ন প্রজাতির পাখী, বানর, সাপ ও অন্যান্য সরীসৃপের অভয়ারন্য। \n" +
                            "\n" +
                            "রাতারগুল মুলতঃ তিনটি নদীর কাছাকাছি। দক্ষিন দিক থেকে চ্যাঙ্গের খাল এসেছে, পূর্বদিক থেকে কাফনা। চ্যাঙ্গের খাল ও কাফনা মিলে গোয়াইন নাম ধরে চলে গেছে উত্তরে গোয়াইনঘাটের দিকে। একটা সময় এই তিন নদীর পাড় ধরেই ছিলো রাতারগুলের অস্তিত্ব। বর্ষাকালে এই নদীগুলোর পানি ঢুকে যায় বনের ভেতরে এবং ১৫-২০ ফুট পর্যন্ত পানিবন্দী হয়ে পড়ে পুরো বন। তখন গাছগুলোর অর্ধক পানির উপর, অর্ধেক পানির নীচে, পানিতে ঘন জঙ্গলের ছায়া সবমিলিয়ে এক অভূতপুর্ব দৃশ্যের অবতারনা হয়। \n" +
                            "জলমগ্ন অবস্থায় এই বনভ্রমন করতে হলে উপযুক্ত সময় বর্ষাকাল এবং সকাল কিংবা সন্ধ্যাবেলা। এ সময় পাখী ও বানরের উপস্থিতি বুঝা যায়। বর্ষার পানি নেমে যাবার পর কিছুদিন কর্দমাক্ত থাকে এরপর আবার শীতকালে রাতারগুল বন পায়ে হেঁটে ঘুরা যায়। \n" +
                            "\n" +
                            "পর্যটকরা সকাল বেলা রাতারগুল ভ্রমন শেষে একইদিনে লালাখাল/ জাফলং/পাংথুমাই ঘুরে আসতে পারেন।\n" +
                            "\n" +
                            "সিলেট থেকে দূরত্বঃ\n" +
                            "সিলেট শহর থেকে রাতারগুলের দূরত্ব প্রায় ১৯ কি.মি। যেতে সময় লাগবে ১ ঘন্টা। \n" +
                            "\n" +
                            "ভাড়াঃ\n" +
                            "সরাসরি সিলেট থেকে রাতারগুল  ৬-৮ জন বহনকারী মাইক্রো ভাড়া হতে পারে ২৫০০ - ৩০০০ টাকার মধ্যে। ৯-১২ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৩৫০০ - ৪,৫০০ টাকার মধ্যে। শুক্রবার হলে আরেকটু বেশী ও হতে পারে।\n");
                }

                if (S_Position.equals("• LOVACHORA")) {
                    flag = 4;
                    intent.putExtra("Name","LOVACHORA");
                    intent.putExtra("Overview","বিবরণঃ\n" +
                            "উত্তর-পূর্ব থেকে উত্তর পশ্চিম পর্যন্ত সিলেটকে ঘিরে রাখা মেঘালয় পাহাড়শ্রেনীর পূর্ব অংশে কানাইঘাট উপজেলার সীমান্তবর্তী অঞ্চল লোভাছড়া। লোভাছড়া মুলতঃ একটি পাথর কোয়ারী, এ ছাড়া এখানে অনেক পুরনো একটি চাবাগান রয়েছে। \n" +
                            "\n" +
                            "লোভাছড়া যেতে হলে পর্যটকদের প্রথমে যেতে হবে কানাইঘাট উপজেলা সদরে। সিলেট নগরী থেকে কানাইঘাট যাওয়ার কয়েকটি পথ আছে। সিলেট জাফলং মহাসড়কের উপর দরবস্ত বাজার থেকে হাতের ডান দিকে রাস্তা চলে গেছে কানাইঘাট পর্যন্ত। মাইক্রোতে ঘন্টা দেড়েক এর মতো সময় লাগবে। এই রাস্তাটি ও সুন্দর। বামদিকে জৈন্তিয়া পাহাড়ের সারি । কানাইঘাট উপজেলা সদর সুরমা নদীর তীরে। নদীরঘাট থেকে নৌকা নিয়ে যাত্রা শুরু করতে হয় লোভাছড়ার দিকে। নৌকা এগুতে থাকে পূর্ব দিকে। একটা পয়েন্টে এসে নৌকা পড়বে তিন নদীর মোহনায়। দক্ষিন থেকে এসেছে বরাক, উত্তর থেকে লোভা। এই দুই নদী মিশে সুরমা হিসেবে চলে গেছে পশ্চিমে। এই মোহনায় এসে নৌকা প্রবেশ করে স্বচ্ছ পানির নদী ‘লোভা’য়। \n" +
                            "এছাড়া সীমান্তরক্ষীদের অনুমতিসাপেক্ষের লোভা নদীর উৎসমুখে গেলে পর্যটকদের চোখে পড়বে সীমান্তের ওপাড়ে দুই পাহাড়ের সংযোগকারী দীর্ঘ ঝুলন্ত ব্রীজ। \n" +
                            "\n" +
                            "সিলেট থেকে দূরত্বঃ\n" +
                            "সিলেট শহর থেকে লোভাছড়ার দূরত্ব প্রায় ৬২ কি.মি। লোভাছড়া যেতে হলে প্রথমে যেতে হবে কানাইঘাট উপজেলায়। সিলেট শহর থেকে কানাইঘাটের দূরত্ব প্রায় ৬০ কি.মি। যেতে সময় লাগবে ২.৩০ ঘন্টা।কানাইঘাট থেকে লোভাছড়ায় নৌকা যেতে হবে।\n" +
                            "\n" +
                            "ভাড়াঃ\n" +
                            "সরাসরি সিলেট থেকে কানাইঘাট ৬-৮ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৩০০০ - ৪০০০ টাকার মধ্যে। ৯-১২ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৫৫০০ - ৬,৫০০ টাকার মধ্যে। কানাইঘাট থেকে লোভাছড়া ঘুরে আসতে নৌকা ভাড়া নিবে ১০০০-১২০০ টাকা। এক নৌকায় ১০-১২ জন যাওয়া যাবে।\n");
                }
                if (S_Position.equals("• BISNAKHANDI")) {
                    flag = 5;
                    intent.putExtra("Name","BISNAKHANDI");
                    intent.putExtra("Overview","বিবরণঃ\n" +
                            "এখানে খাসিয়া পাহাড়ের অনেকগুলো ধাপ দুই পাশ থেকে এক বিন্দুতে এসে মিলেছে। পাহাড়ের খাঁজে সুউচ্চ ঝর্ণা। বর্ষায় থোকা থোকা মেঘ আটকে থাকে পাহাড়ের গায়ে। পূর্ব দিক থেকে পিয়াইন নদীর একটি শাখা পাহাড়ের নীচ দিয়ে চলে গেছে ভোলাগঞ্জের দিকে। পাহাড় থেকে নেমে আসা স্রোতের সাথে বড় বড় পাথর এসে জমা হয় বিছনাকান্দি। \n" +
                            "\n" +
                            "বিছনাকান্দি ও মুলতঃ জাফলংয়ের মতোই একটি পাথর কোয়ারী। শীতকালে যান্ত্রিক পাথর উত্তোলন- সেই সাথে পাথরবাহী নৌকা, ট্রাকের উৎপাতের কারনে পর্যটকদের জন্য এসময় উপযুক্ত নয়। কিন্তু বর্ষায় এইসব থাকেনা বলে পাহাড়, নদী, ঝর্ণা, মেঘের সমন্বয়ে বিছনাকান্দি হয়ে উঠে এক অনিন্দ্য সুন্দর গন্তব্য। \n" +
                            "পর্যটকদের জন্য আরেকটি বিকল্প হচ্ছে- বিছনাকান্দি যাওয়ার জন্য পাংথুমাই চলে আসা। বড়হিল ঝর্ণার কাছ থেকেই পিয়াইন নদীর একটি শাখা পশ্চিম দিকে চলে গেছে বিছনাকান্দি। নৌকা নিয়ে পাহাড়ের নীচ দিয়ে প্রবাহমান এই পাহাড়ী নদী ধরে বিছনাকান্দি যাওয়ার মুহুর্তগুলো দারুন স্মরনীয় হয়ে থাকবে। নৌকা সময় লাগে একঘন্টার একটু বেশী।\n" +
                            "\n" +
                            "সিলেট থেকে দূরত্বঃ\n" +
                            "সিলেট শহর থেকে বিছনাকান্দির দূরত্ব প্রায় ৬০ কি.মি। যেতে সময় লাগবে প্রায় ২.৩০ ঘন্টা।  সিলেট শহর থেকে প্রথমেই আপনাকে যেতে হবে হাদারপাড় বাজার। হাদারপাড় থেকে বিছনাকান্দি  নৌকা দিয়ে যেতে হবে।\n" +
                            "\n" +
                            "ভাড়াঃ\n" +
                            "সরাসরি সিলেট থেকে হাদারপাড় ৬-৮ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৩৫০০ - ৪০০০ টাকার মধ্যে। ৯-১২ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৫০০০ - ৫,৫০০ টাকার মধ্যে। হাদারপাড় থেকে বিছনাকান্দির ঘুরে আসতে নৌকা ভাড়া নিবে ১০০০-১২০০ টাকা। এক নৌকায় ১০-১২ জন যাওয়া যাবে ।");
                }

                if (S_Position.equals("• LALAKHAL")) {
                    flag = 6;
                    intent.putExtra("Name","LALAKHAL");
                    intent.putExtra("Overview","বিবরণঃ\n" +
                            "মেঘালয় পর্বত শ্রেনীর সবচেয়ে পুর্বের অংশ জৈন্তিয়া হিলসের ঠিক নীচে পাহাড়, প্রাকৃতিক বন, চা বাগান ও নদীঘেরা একটি গ্রাম লালাখাল, সিলেট জেলার জৈন্তিয়াপুর উপজেলায়। জৈন্তিয়া হিলসের ভারতীয় অংশ থেকে মাইন্ডু ( Myntdu) নদী লালাখালের সীমান্তের কাছেই সারী নদী নামে প্রবেশ করেছে এবং ভাটির দিকে সারীঘাট পেরিয়ে গোয়াইন নদীর সাথে মিশেছে। লালাখাল থেকে সারীঘাট পর্যন্ত নদীর বারো কিমি পানির রঙ পান্না সবুজ- পুরো শীতকাল এবং অন্যান্য সময় বৃষ্টি না হলে এই রঙ থাকে। মুলতঃ জৈন্তিয়া পাহাড় থেকে আসা প্রবাহমান পানির সাথে মিশে থাকা খনিজ এবং কাদার পরিবর্তে নদীর বালুময় তলদেশের কারনেই এই নদীর পানির রঙ এরকম দেখায়। \n" +
                            "সারী ব্রীজ় পেরিয়ে একটু সামনেই রাস্তার মাঝখানে একটি পুরনো স্থাপনা।এটি ছিলো জৈন্তিয়া রাজ্যের রাজকুমারী ইরাবতীর নামে একটি পান্থশালা। এর পাশ দিয়ে হাতের ডানের রাস্তায় ঢুকে সাত কিমি গেলেই লালাখাল। লালাখাল এ রিভার কুইন রেস্টুরেন্ট এর সামনে থেকে ও নৌকা নিয়ে জিরোপয়েন্ট ঘুরে আসা যায়। \n" +
                            "\n" +
                            "সিলেট থেকে দূরত্বঃ\n" +
                            "সিলেট জাফলং মহাসড়কে শহর থেকে প্রায় ৪২ কিমি দূরে সারীঘাট।। যেতে সময় লাগবে প্রায় ২ ঘন্টা ।  সারীঘাট থেকে লালাখাল নৌকা দিয়ে যেতে হবে আর ২ কিমি।\n" +
                            "\n" +
                            "ভাড়াঃ\n" +
                            "সিলেট শহর থেকে লালাখাল পর্যন্ত ৬-৮ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৩৫০০ - ৪০০০ টাকার মধ্যে। ৯-১২ জন বহনকারী মাইক্রো ভাড়া হতে পারে ৪৫০০ - ৫,৫০০ টাকার মধ্যে। সারীঘাট থেকে স্থানীয় নৌকা নিয়ে লালাখাল যেতে খরচ পড়বে ১০০০-১৫০০ টাকার মতো খরচ পড়ে। \n");
                }

                if (S_Position.equals("• KHADIMNAGAR RAIN FOREST")) {
                    flag = 7;
                    intent.putExtra("Name","KHADIMNAGAR RAIN FOREST");
                    intent.putExtra("Overview","সিলেট শহর থেকে জাফলং রোড ধরে ১০ কিমি এর মতো এগুলেই শাহপরান মাজার গেট পেরুনোর পর পরই খাদিম চৌমুহনা। খাদিম চৌমুহনা থেকে হাতের ডানদিকে চলে গেছে রাস্তা। রাস্তা ধরে সামনে গেলে খাদিমনগর চাবাগানের শুরু। বাগানের রাস্তা ধরে আরেকটু সামনে গেলে একটা কালভার্ট। কালভার্ট পেরিয়ে বামের রাস্তা না ধরে পথ ধরে এগিয়ে যেতে থাকলে আরো চা বাগান, চা বাগানের পর প্রাকৃতিক বনের হাতছানি। মুল সড়ক থেকে উত্তরের দিকে পাকা, কাঁচা ও ইট বিছানো পাঁচ কিমি পথ পেরুনোর পর খাদিমনগর রেইনফরেস্টের শুরু। পূর্বে ছড়াগাঙ্গ ও হাবিবনগর, পশ্চিমে বরজান ও কালাগুল, উত্তরে গুলনি, দক্ষিনে খাদিমনগর এই ছয়টি চা বাগানের মাঝখানে ১৬৭৩ একর পাহাড় ও প্রাকৃতিক বনের সমন্বয়ে গড়ে উঠা এই রেইনফরেস্টটি জাতীয় উদ্যান বলে সরকারী স্বীকৃতি পেয়েছে এবং ইউএসএইড এর সহায়তায় এর ব্যবস্থাপনা পরিচালিত হচ্ছে। \n" +
                            "\n" +
                            "এই উদ্যানে ২১৭ প্রজাতির উদ্ভিদ রয়েছে যার মধ্যে সেগুন,চাপালিশ, মেহগনি,অর্জুন, আমলকি, হরতকি, বয়রা, নানা জাতের বাঁশ ও বেত উল্লেখযোগ্য। নানা জাতের প্রানী ও পাখী রয়েছে ৮৩ প্রজাতির, এর মধ্যে উল্লেখযোগ্য হচ্ছে- ভাল্লুক, মেছোবাঘ, মুখপোড়া বানর, লজ্জাবতী বানর,অজগর, চন্দ্রবুড়া সাপ, বনমোরগ, টিয়া, ময়না, ঘুঘু। \n" +
                            "\n" +
                            "এই বনে হাঁটার জন্য ৪৫ মিনিট ও দুইঘন্টার দুটো ট্রেইল আছে। বনবিভাগের বিট অফিসের সামনে ট্রেইল দুটোর মানচিত্র দেয়া আছে, এ ছাড়া স্থানীয় কাউকে গাইড হিসাবে ও সাথে নেয়া যেতে পারে। \n" +
                            "\n" +
                            "রেইনফরেস্টের সামনে দিয়ে উত্তর দিকে যে রাস্তা চলে গেছে, সে দিক দিয়ে এগিয়ে গেলে এয়ারপোর্ট-হরিপুর সড়কে উঠা যায়, সেখান থেকে আবার রাতারগুল সোয়াম্পফরেস্টে ও সহজেই যাওয়া সম্ভব। কোন পর্যটক যদি একদিনের জন্য সিলেট ঘুরতে চান সে ক্ষেত্রে এই পথটি ব্যবহার করে চাবাগান, রেইনফরেস্ট, সোয়ামফরেস্ট দেখে যেতে পারেন। \n" +
                            "\n" +
                            "এই পথের অধিকাংশ কাঁচা ও ইট বিছানো হলে ও গাড়ী নিয়ে যাওয়া যায় তবে বৃষ্টি থাকলে সে ক্ষেত্রে সিএনজি নিয়ে যাওয়া ভালো। খাদিম চৌমুহনাতে ভাড়ার সিএনজি পাওয়া যায়।");
                }

                if (S_Position.equals("• BHOLAGONJ")) {
                    flag = 8;
                    intent.putExtra("Name","BHOLAGONJ");
                    intent.putExtra("Overview","বিবরণঃ\n" +
                            "সিলেট শহর থেকে সোজা উত্তরে তেত্রিশ কিমি দূরত্বে ভোলাগঞ্জ- বাংলাদেশের সবচেয়ে বড় পাথর কোয়ারী। উত্তরের খাসিয়া পাহাড় থেকে নেমে আসা নদী ধলাই আর পূর্বদিকে ডাউকি থেকে আসা পিয়াইন এর মিলিতধারার পাড়েই কোম্পানীগঞ্জ উপজেলা সদর। সিলেট শহর থেকে আম্বরখানা পয়েন্ট থেকে সালুটিকর-ভোলাগঞ্জ সড়ক ধরে ২৭ কিমি এগিয়ে গেলে কোম্পানীগঞ্জ উপজেলা সদর। সেখান থেকে আরো ৬ কিমি গেলেই দীর্ঘ পাহাড় সারি, ধলাই নদী, দৃশ্যমান ঝর্ণা আর সারি সারি পাথরের তীর্থ ভোলাগঞ্জ। \n" +
                            "\n" +
                            "১৭৬৫ সালে বৃটিশরা সিলেট দখল করার পর ১৭৭৮ সালে রবার্ট লিন্ডসে কোম্পানীর রেভিনিউ কালেক্টর হিসাবে সিলেট আসেন, বারো বছর এই দায়িত্ব পালনের পাশাপাশি ভোলাগঞ্জ অঞ্চলে চুনাপাথরের ব্যবসার পত্তন ঘটান। ভোলাগঞ্জ থেকে শুরু করে উত্তরের চেরাপুঞ্জি পর্যন্ত বিস্তৃত পাহাড়্গুলো থেকে চুনাপাথর সংগ্রহ করে নিয়ে আসা হতো ছাতকে, তারপর ছাতক থেকে সুরমা নদী হয়ে এই পাথর চলে যেতো কলকাতায়। এই অঞ্চলের পাথর ব্যবসার লাভ থেকেই লিন্ডসে স্কটল্যান্ড জমিদারী কেনেন, স্যার ও লর্ডস খেতাবে ভূষিত হন। রবার্ট লিন্ডসের আত্নজীবনীতে তৎকালীন পাড়ুয়া, বর্তমানের ভোলাগঞ্জ এলাকার অপার সৌন্দর্য্যের বর্ণনা পাওয়া যায়। \n" +
                            "\n" +
                            "লিন্ডসের বর্ণিত সে ই বিখ্যাত সুন্দর এখন আর অবশিষ্ট নেই, মুলতঃ গত কয়েকবছর ধরে চলমান অনিয়ন্ত্রিত পাথর উত্তোলন ও পাথরভাঙ্গা ( ক্রাশার) মেশিনের উৎপাতে। এ ছাড়া পাথরবাহী ট্রাকের কারনে সিলেট-ভোলাগঞ্জ রাস্তার অবস্থা ও বেশ খারাপ। \n" +
                            "\n" +
                            "তবুও বর্ষায় মেঘালয় পাহাড়জুড়ে মেঘের উচ্ছ্বাস, ঝর্ণার ছুটে চলা, নদীর স্রোতধারা, বর্ষাশেষে জেগে উঠা ধলাই’র দীর্ঘ বালিয়াড়ি পর্যটকদের মুগ্ধ করবে। \n" +
                            "\n" +
                            "সিলেট থেকে দূরত্বঃ\n" +
                            "সিলেট শহর থেকে সোজা উত্তরে ৩৩ কিমি দূরত্বে ভোলাগঞ্জ।  রাস্তার অবস্থার কারনে গাড়ী নিয়ে ভোলাগঞ্জ পৌঁছাতে সময় লাগে প্রায় দেড় থেকে দুই ঘন্টা। \n" +
                            "\n" +
                            "ভাড়াঃ\n" +
                            "আম্বরখানার মজুমদাড়ি থেকে সিএনজিতে করে ভোলাগঞ্জ যাওয়া যায়। জনপ্রতি ভাড়া ১৫০ টাকা।\n");
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