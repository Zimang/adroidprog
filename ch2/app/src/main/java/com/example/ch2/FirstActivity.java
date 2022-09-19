package com.example.ch2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1=(Button) findViewById(R.id.button_14);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this,"你点击了BUTOON1",
                        Toast.LENGTH_SHORT).show();
            }
        });
        Button button2=(Button) findViewById(R.id.button_15);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent("com.example.ch2.ACTION_START");
                it.addCategory("nobody.knows");
                it.addCategory("android.intent.category.DEFAULT");
                startActivity(it);
            }
        });
        Button bt3=(Button) findViewById(R.id.button_16);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(Intent.ACTION_VIEW);
                it.setData(Uri.parse("http://www.baidu.com"));
                startActivity(it);
            }
        });
        Button bt4=(Button) findViewById(R.id.button_17);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data="我操你妈";
                Intent it=new Intent(FirstActivity.this,SecondLayoutActivity.class);
                it.putExtra("key1",data);
                startActivity(it);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"你点击加物件",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"你点击移除",Toast.LENGTH_SHORT).show();
                break;
            case R.id.endup:
                finish();
                break;
            case R.id.intentJump:
                Intent it=new Intent(FirstActivity.this,SecondLayoutActivity.class);
                startActivity(it);
            default:
        }
        return true;
    }



}