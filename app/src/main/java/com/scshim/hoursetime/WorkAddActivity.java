package com.scshim.hoursetime;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.scshim.hoursetime.domain.Work;

public class WorkAddActivity extends AppCompatActivity {

    EditText workEt;
    ImageView scoreImg1,scoreImg2,scoreImg3,scoreImg4,scoreImg5;
    int month, day, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_add);

        month = 5;
        day = 24;
        workEt = findViewById(R.id.workEt);

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
        Database.remainingWork.add(new Work(work,score,month,day));
        finish();
    }

    //업무를 완료했을 때 증가할 획득 점수를 선택합니다.
    void selectScore(int i){
        if(i==1){
            score = 1;
            scoreImg1.setImageResource(R.drawable.difficulty_color);
            scoreImg2.setImageResource(R.drawable.difficulty_black);
            scoreImg3.setImageResource(R.drawable.difficulty_black);
            scoreImg4.setImageResource(R.drawable.difficulty_black);
            scoreImg5.setImageResource(R.drawable.difficulty_black);
        }else if(i==2){
            score = 2;
            scoreImg1.setImageResource(R.drawable.difficulty_color);
            scoreImg2.setImageResource(R.drawable.difficulty_color);
            scoreImg3.setImageResource(R.drawable.difficulty_black);
            scoreImg4.setImageResource(R.drawable.difficulty_black);
            scoreImg5.setImageResource(R.drawable.difficulty_black);
        }else if(i==3){
            score = 3;
            scoreImg1.setImageResource(R.drawable.difficulty_color);
            scoreImg2.setImageResource(R.drawable.difficulty_color);
            scoreImg3.setImageResource(R.drawable.difficulty_color);
            scoreImg4.setImageResource(R.drawable.difficulty_black);
            scoreImg5.setImageResource(R.drawable.difficulty_black);
        }else if(i==4){
            score = 4;
            scoreImg1.setImageResource(R.drawable.difficulty_color);
            scoreImg2.setImageResource(R.drawable.difficulty_color);
            scoreImg3.setImageResource(R.drawable.difficulty_color);
            scoreImg4.setImageResource(R.drawable.difficulty_color);
            scoreImg5.setImageResource(R.drawable.difficulty_black);
        }else if(i==5){
            score = 5;
            scoreImg1.setImageResource(R.drawable.difficulty_color);
            scoreImg2.setImageResource(R.drawable.difficulty_color);
            scoreImg3.setImageResource(R.drawable.difficulty_color);
            scoreImg4.setImageResource(R.drawable.difficulty_color);
            scoreImg5.setImageResource(R.drawable.difficulty_color);
        }
    }
}
