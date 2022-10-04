package top.zimang.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.b1:
                Intent it1=new Intent(MainActivity.this,listViewPrac.class);
                startActivity(it1);
                break;
            case R.id.b2:
                Intent it2=new Intent(MainActivity.this,CustomlistViewPrac.class);
                startActivity(it2);
                break;
            default:
                break;
        }
    }
}