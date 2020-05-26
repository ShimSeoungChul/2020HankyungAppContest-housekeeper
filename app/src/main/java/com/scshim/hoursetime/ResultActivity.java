package com.scshim.hoursetime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scshim.hoursetime.domain.Work;

public class ResultActivity extends AppCompatActivity {

    LinearLayout scoreBarLayout1,scoreBarLayout2;
    TextView scoreText1, scoreText2;
    int score1, score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        scoreBarLayout1 = findViewById(R.id.scoreBarLayout1);
        scoreBarLayout2 = findViewById(R.id.scoreBarLayout2);
        scoreText1 = findViewById(R.id.scoreText1);
        scoreText2 = findViewById(R.id.scoreText2);

        score1 = 0;
        score2 = 0;

        for(Work work:Database.jihyun){
            score1 = score1 + work.getScore();
        }

        for(Work work:Database.minwoo){
            score2 = score2 + work.getScore();
        }

        scoreText1.setText(Integer.toString(score1)+"p");
        scoreText2.setText(Integer.toString(score2)+"p");

        setScoreBar(score1*5,score2*5);
    }

    //사용자 스코어에 따라 막대그래프 높이를 변경한다.
    void setScoreBar(int score1, int score2){
        scoreBarLayout1.getLayoutParams().height = score1;
        scoreBarLayout2.getLayoutParams().height = score2;
    }
}
