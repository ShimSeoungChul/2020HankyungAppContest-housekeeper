package com.scshim.hoursetime;


/*
개발자 심승철, 임슬아
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
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    void goToworkAdd(View view){
        Intent intent = new Intent(getApplicationContext(),WorkAddActivity.class);
        startActivity(intent);//액티비티 띄우기
    }

    void goTodataAnalysis(View view){
        Intent intent = new Intent(getApplicationContext(),DataAnalysisActivity.class);
        startActivity(intent);//액티비티 띄우기
    }
}
