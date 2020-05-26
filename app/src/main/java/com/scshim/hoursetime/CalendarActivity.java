package com.scshim.hoursetime;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        widget = findViewById(R.id.calendarView);
        widget.setOnDateChangedListener(this);
        widget.setOnMonthChangedListener(this);

    }

    @Override
    public void onDateSelected(
            @NonNull MaterialCalendarView widget,
            @NonNull CalendarDay date,
            boolean selected) {
        //System.out.println(DateFormat.getDateInstance().format(date.getDate()));
        Intent intent = new Intent(getApplicationContext(), WorkAddActivity.class);
        intent.putExtra("month",date.getMonth());
        intent.putExtra("day",date.getDay());
        startActivity(intent);
    }


    @Override
    public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
        //noinspection ConstantConditions
//        getSupportActionBar().setTitle( Integer.toString(date.getDay()) );
    }

    public void workAddFinish(View view){
        finish();
    }
}
