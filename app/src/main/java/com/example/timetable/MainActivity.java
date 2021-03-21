package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mondayTV = findViewById(R.id.monday);
        TextView tuesdayTV = findViewById(R.id.tuesday);
        TextView wednesdayTV = findViewById(R.id.wednesday);
        TextView thursdayTV = findViewById(R.id.thursday);
        TextView fridayTV = findViewById(R.id.friday);
        TextView saturdayTV = findViewById(R.id.saturday);


        if (presentDay().equals(preDefinedDay(mondayTV))){
            mondayTV.setBackgroundColor(getResources().getColor(R.color.darkGreen));
            mondayTV.setTextColor(getResources().getColor(R.color.white));
        }
        if (presentDay().equals(preDefinedDay(tuesdayTV))){
            tuesdayTV.setBackgroundColor(getResources().getColor(R.color.darkGreen));
            tuesdayTV.setTextColor(getResources().getColor(R.color.white));
        }
        if ((presentDay().equals(preDefinedDay(wednesdayTV)))){
            wednesdayTV.setBackgroundColor(getResources().getColor(R.color.darkGreen));
            wednesdayTV.setTextColor(getResources().getColor(R.color.white));
        }
        if ((presentDay().equals(preDefinedDay(thursdayTV)))){
            thursdayTV.setBackgroundColor(getResources().getColor(R.color.darkGreen));
            thursdayTV.setTextColor(getResources().getColor(R.color.white));
        }
        if ((presentDay().equals(preDefinedDay(fridayTV)))){
            fridayTV.setBackgroundColor(getResources().getColor(R.color.darkGreen));
            fridayTV.setTextColor(getResources().getColor(R.color.white));
        }
        if ((presentDay().equals(preDefinedDay(saturdayTV)))){
            saturdayTV.setBackgroundColor(getResources().getColor(R.color.darkGreen));
            saturdayTV.setTextColor(getResources().getColor(R.color.white));
        }

        mondayTV.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent mondayI = new Intent(MainActivity.this,monday.class);
                        startActivity(mondayI);
                    }
                }
        );

        tuesdayTV.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent tuesdayI = new Intent(MainActivity.this,tuesday.class);
                        startActivity(tuesdayI);
                    }
                }
        );

        wednesdayTV.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent wednesdayI = new Intent(MainActivity.this,wednesday.class);
                        startActivity(wednesdayI);
                    }
                }
        );

        thursdayTV.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent thursdayI = new Intent(MainActivity.this,thursday.class);
                        startActivity(thursdayI);
                    }
                }
        );

        fridayTV.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent fridayI = new Intent(MainActivity.this,friday.class);
                        startActivity(fridayI);
                    }
                }
        );

        saturdayTV.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent saturdayI = new Intent(MainActivity.this,saturday.class);
                        startActivity(saturdayI);
                    }
                }
        );


    }

    public String presentDay(){
        Calendar date = Calendar.getInstance();
        String dayToday = android.text.format.DateFormat.format("EEEE", date).toString().toLowerCase();
        return dayToday;
    }

    public String preDefinedDay(TextView textView){
        String preSetDay = textView.getText().toString().toLowerCase();
        return preSetDay;
    }


}