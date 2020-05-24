package com.scshim.hoursetime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    void toMain(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);//액티비티 생성
    }
}
