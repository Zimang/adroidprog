package com.example.ch2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d("ThirdActivity","Task id is "+getTaskId());
//        Button bt =(Button) findViewById(R.id.button_3);
//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        Button bu2=(Button) findViewById(R.id.button_4);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCollector.finsihAll();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}