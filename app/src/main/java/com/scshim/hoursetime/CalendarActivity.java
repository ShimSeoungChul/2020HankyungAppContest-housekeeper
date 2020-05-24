package com.scshim.hoursetime;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;


@RequiresApi(api = Build.VERSION_CODES.O)
public class CalendarActivity extends AppCompatActivity implements OnDateSelectedListener, OnMonthChangedListener{

   MaterialCalendarView widget;
   TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        widget = findViewById(R.id.calendarView);
        textView = findViewById(R.id.textView);

        widget.setOnDateChangedListener(this);
        widget.setOnMonthChangedListener(this);

        //Setup initial text
        textView.setText("No Selection");
    }

    @Override
    public void onDateSelected(
            @NonNull MaterialCalendarView widget,
            @NonNull CalendarDay date,
            boolean selected) {
        textView.setText(selected ? Integer.toString(date.getDay()) : "No Selection");
        System.out.println(DateFormat.getDateInstance().format(date.getDate()));
    }

//    @Override
//    public void onDateLongClick(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date) {
//        final String text = String.format("%s is available",  Integer.toString(date.getDay()) );
//        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
//    }

    @Override
    public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
        //noinspection ConstantConditions
        getSupportActionBar().setTitle( Integer.toString(date.getDay()) );
    }
}
