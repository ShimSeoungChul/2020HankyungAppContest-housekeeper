package com.scshim.hoursetime;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.scshim.hoursetime.domain.Work;

public class WorkEndActivity extends AppCompatActivity {

    ImageView satisfactionIV1,satisfactionIV2,satisfactionIV3,satisfactionIV4,satisfactionIV5;
    TextView workDetailTV;
    int satisfaction=0,index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_end);

        Intent intent = getIntent(); //데이터 수신
        String work = intent.getExtras().getString("work");
        int month = intent.getExtras().getInt("month");
        int day =intent.getExtras().getInt("day");
        int point = intent.getExtras().getInt("point");
        index = intent.getExtras().getInt("index");

        String text = Integer.toString(month) + "월 " + Integer.toString(day) + "일 " + work + "(" + Integer.toString(point) +"점)";
        workDetailTV = findViewById(R.id.workDetailTV);
        workDetailTV.setText(text);

        satisfactionIV1 = findViewById(R.id.satisfactionIV1);
        satisfactionIV2 = findViewById(R.id.satisfactionIV2);
        satisfactionIV3 = findViewById(R.id.satisfactionIV3);
        satisfactionIV4 = findViewById(R.id.satisfactionIV4);
        satisfactionIV5 = findViewById(R.id.satisfactionIV5);

        satisfactionIV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectSatisfaction(1);
            }
        });
        satisfactionIV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectSatisfaction(2);
            }
        });
        satisfactionIV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectSatisfaction(3);
            }
        });
        satisfactionIV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectSatisfaction(4);
            }
        });
        satisfactionIV5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectSatisfaction(5);
            }
        });
    }

    void selectSatisfaction(int i){
        if(i==1){
            satisfaction = 1;
            satisfactionIV1.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV2.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
            satisfactionIV3.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
            satisfactionIV4.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
            satisfactionIV5.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
        }else if(i==2){
            satisfaction = 2;
            satisfactionIV1.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV2.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV3.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
            satisfactionIV4.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
            satisfactionIV5.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
        }else if(i==3){
            satisfaction = 3;
            satisfactionIV1.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV2.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV3.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV4.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
            satisfactionIV5.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
        }else if(i==4){
            satisfaction = 4;
            satisfactionIV1.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV2.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV3.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV4.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV5.setBackground(ContextCompat.getDrawable(this,R.drawable.star_black));
        }else if(i==5){
            satisfaction = 5;
            satisfactionIV1.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV2.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV3.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV4.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
            satisfactionIV5.setBackground(ContextCompat.getDrawable(this,R.drawable.ic_star_color));
        }
    }

    public void workEnd(View view){
        Work work = Database.remainingWork.get(index);
        work.setSatisfaction(satisfaction);
        Database.jihyun.add(work);
        Database.remainingWork.remove(index);
        finish();
    }
}
