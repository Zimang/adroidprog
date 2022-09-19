package com.example.ch2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button but2=(Button) findViewById(R.id.button_2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2=new Intent(SecondLayoutActivity.this,FirstActivity.class);
                startActivity(it2);
            }
        });

//        获取传递过来的数据
        Intent it =getIntent();
        String data=it.getStringExtra("key1");
        Log.d("Sec",data);
    }

}