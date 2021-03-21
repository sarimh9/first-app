package com.example.timetable;

import android.app.Activity;
import android.view.*;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class detailsAdapter extends ArrayAdapter<details> {

    public detailsAdapter(Activity context, ArrayList<details> arrayList){
        super(context,0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        details currentDetails = getItem(position);

        View myView = convertView;
        if (myView == null){
            myView = LayoutInflater.from(getContext()).inflate(R.layout.details_layout,parent,false);
        }
        TextView textView1 = myView.findViewById(R.id.startTime);
        textView1.setText(currentDetails.getStartTime());

        TextView textView2 = myView.findViewById(R.id.endTime);
        textView2.setText(currentDetails.getEndTime());

        TextView subjectName = myView.findViewById(R.id.subjectName);
        subjectName.setText(currentDetails.getSubject());

        return myView;
    }

}
