package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class wednesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);

        ArrayList<details> arrayList = new ArrayList<>();

        arrayList.add(new details("08:00","08:50","-"));
        arrayList.add(new details("08:55","09:45","Laboratory Course – I"));
        arrayList.add(new details("09:50","10:40","Laboratory Course – I"));
        arrayList.add(new details("10:45","11:35","Data Structure and Its Applications"));
        arrayList.add(new details("11:40","12:30","Data Structure and Its Applications"));
        arrayList.add(new details("12:35","01:25","-"));
        arrayList.add(new details("02:30","03:15","-"));
        arrayList.add(new details("03:20","04:05","-"));


        detailsAdapter adapter = new detailsAdapter(this,arrayList);
        ListView listView = findViewById(R.id.wednesdayListView);
        listView.setAdapter(adapter);
    }
}