package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class friday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);

        ArrayList<details> arrayList = new ArrayList<>();

        arrayList.add(new details("08:00","08:40","-"));
        arrayList.add(new details("08:45","09:25","-"));
        arrayList.add(new details("09:30","10:10","Digital Logic & Computer Organization"));
        arrayList.add(new details("10:15","10:55","Digital Logic & Computer Organization"));
        arrayList.add(new details("11:00","11:40","Fundamentals of IS and IT"));
        arrayList.add(new details("11:45","12:25","Fundamentals of IS and IT"));


        detailsAdapter adapter = new detailsAdapter(this,arrayList);
        ListView listView = findViewById(R.id.fridayListView);
        listView.setAdapter(adapter);
    }
}
