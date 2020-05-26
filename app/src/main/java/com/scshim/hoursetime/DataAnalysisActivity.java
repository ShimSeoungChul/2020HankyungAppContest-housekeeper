package com.scshim.hoursetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.scshim.hoursetime.domain.Work;

public class DataAnalysisActivity extends AppCompatActivity {

    TextView user1Score, user1ScoreChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_analysis);
        user1Score = findViewById(R.id.user1Score);
        user1ScoreChange = findViewById(R.id.user1ScoreChange);

        int user1ScoreSave = 0;
        for(Work work: Database.jihyun){
            user1ScoreSave = user1ScoreSave + work.getScore();
        }
        user1Score.setText(Integer.toString(user1ScoreSave));
        user1ScoreChange.setText(Integer.toString(Database.jhChange)+"↑");
    }
}
