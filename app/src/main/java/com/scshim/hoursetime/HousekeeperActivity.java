package com.scshim.hoursetime;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HousekeeperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housekeeper);
    }

    public void clickJH(View view){
        String tell = "tel:01030907289";
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tell)));
    }
    public void clickSC(View view){
        String tell = "tel:01077561989";
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tell)));
    }
    public void clickSY(View view){
        String tell = "tel:01046667293";
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tell)));
    }

}
