package top.zimang.easycomponent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private Button shPro;
    private Button hiPro;
    private ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ProgressBar
        shPro=(Button) findViewById(R.id.showProgress);
        hiPro=(Button) findViewById(R.id.hideProgress);
        pb=(ProgressBar) findViewById(R.id.proBar);
        shPro.setOnClickListener(this);
        hiPro.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.showProgress:
                this.pb.setVisibility(View.VISIBLE);
                break;
            case R.id.hideProgress:
                this.pb.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ProgressDialog:
                Intent it1=new Intent(MainActivity.this,ProgressDialog.class);
                startActivity(it1);
                break;
            case R.id.AlertDialog:
                Intent it2=new Intent(MainActivity.this, AlertDialogTest.class);
                startActivity(it2);
                break;
            default:
                break;
        }
        return true;
    }
}