package com.scshim.hoursetime;

import android.content.Intent;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.scshim.hoursetime.domain.Work;

public class WorkAddActivity extends AppCompatActivity {

    EditText workEt;
    ImageButton scoreImg1,scoreImg2,scoreImg3,scoreImg4,scoreImg5;
    int month, day, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_add);
        workEt = findViewById(R.id.workEt);

        Intent intent = getIntent(); //데이터 수신
        month = intent.getExtras().getInt("month") + 1;
        day = intent.getExtras().getInt("day");

        scoreImg1 = findViewById(R.id.scoreImg1);
        scoreImg2 = findViewById(R.id.scoreImg2);
        scoreImg3 = findViewById(R.id.scoreImg3);
        scoreImg4 = findViewById(R.id.scoreImg4);
        scoreImg5 = findViewById(R.id.scoreImg5);
        scoreImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectScore(1);
            }
        });
        scoreImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectScore(2);
            }
        });
        scoreImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectScore(3);
            }
        });
        scoreImg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectScore(4);
            }
        });
        scoreImg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectScore(5);
            }
        });
    }

    public void workAdd(View view){
        String work = workEt.getText().toString();
        Database.remainingWork.add(0,new Work(work,score,month,day));
        Database.jhChange = Database.jhChange + score;
        finish();
    }

    //업무를 완료했을 때 증가할 획득 점수를 선택합니다.
    void selectScore(int i){
        if(i==1){
            score = 1;
            scoreImg1.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg2.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
            scoreImg3.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
            scoreImg4.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
            scoreImg5.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
        }else if(i==2){
            score = 2;
            scoreImg1.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg2.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg3.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
            scoreImg4.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
            scoreImg5.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
        }else if(i==3){
            score = 3;
            scoreImg1.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg2.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg3.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg4.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
            scoreImg5.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
        }else if(i==4){
            score = 4;
            scoreImg1.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg2.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg3.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg4.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg5.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_black));
        }else if(i==5){
            score = 5;
            scoreImg1.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg2.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg3.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg4.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
            scoreImg5.setBackground(ContextCompat.getDrawable(this,R.drawable.difficulty_color));
        }
    }
}
