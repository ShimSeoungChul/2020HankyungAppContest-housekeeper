package com.scshim.hoursetime;


/*
개발 심승철, 임슬아
 */

/*
아이콘 제작자
<a href="https://www.flaticon.com/kr/authors/kiranshastry" title="Kiranshastry">Kiranshastry</a> from <a href="https://www.flaticon.com/kr/" title="Flaticon"> www.flaticon.com</a>
<a href="https://www.flaticon.com/kr/authors/freepik" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/kr/" title="Flaticon"> www.flaticon.com</a>
<a href="https://creativemarket.com/eucalyp" title="Eucalyp">Eucalyp</a> from <a href="https://www.flaticon.com/kr/" title="Flaticon"> www.flaticon.com</a>
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.scshim.hoursetime.adaptor.ScheduleListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageButton calendarBtn;
    ScheduleListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarBtn = findViewById(R.id.btnToCalendar);

        Database.init();

        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        RecyclerView recyclerView = findViewById(R.id.schedulLV) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this)) ;

        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.
        adapter = new ScheduleListAdapter(Database.remainingWork);
        recyclerView.setAdapter(adapter) ;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        adapter.notifyDataSetChanged();
    }


    public void goToCalendar(View view){
        Intent intent = new Intent(getApplicationContext(),CalendarActivity.class);
        startActivity(intent);//액티비티 생성

    }

    public void goTodataAnalysis(View view){
        Intent intent = new Intent(getApplicationContext(),DataAnalysisActivity.class);
        startActivity(intent);//액티비티 생성
    }

    public void goToReward(View view){
        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
        startActivity(intent);//액티비티 생성
    }

    public void goToHousekeeper(View view){
        Intent intent = new Intent(getApplicationContext(), HousekeeperActivity.class);
        startActivity(intent);//액티비티 생성
    }
}
