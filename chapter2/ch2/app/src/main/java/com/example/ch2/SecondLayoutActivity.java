package com.example.ch2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondLayoutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Log.d("SecondActivity","Task id is "+getTaskId());
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

//        传回数据
        Button but3=(Button) findViewById(R.id.button_3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent();
                intent.putExtra("wtf","点击返回传的数据");
                setResult(2,intent);
                finish();
            }
        });
        Button but4=(Button) findViewById(R.id.button_4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(SecondLayoutActivity.this,ThirdActivity.class);
                startActivity(it);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent it=new Intent();
        it.putExtra("qq","back传的数据");
        setResult(RESULT_OK,it);
        finish();
    }
}