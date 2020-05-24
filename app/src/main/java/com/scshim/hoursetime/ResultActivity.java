package com.scshim.hoursetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ResultActivity extends AppCompatActivity {

    LinearLayout scoreBarLayout1,scoreBarLayout2;
    int score1, score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        scoreBarLayout1 = findViewById(R.id.scoreBarLayout1);
        scoreBarLayout2 = findViewById(R.id.scoreBarLayout2);
        score1 = 300;
        score2 = 10;

        setScoreBar(score1,score2);
    }

    //사용자 스코어에 따라 막대그래프 높이를 변경한다.
    void setScoreBar(int score1, int score2){
        scoreBarLayout1.getLayoutParams().height = score1;
        scoreBarLayout2.getLayoutParams().height = score2;
    }
}
