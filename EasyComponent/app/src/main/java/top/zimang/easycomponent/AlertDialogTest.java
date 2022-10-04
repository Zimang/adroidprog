package top.zimang.easycomponent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDialogTest extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        Button t1=(Button) findViewById(R.id.AlertDialogBut);
        t1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.AlertDialogBut:
                AlertDialog.Builder dial = new AlertDialog.Builder(AlertDialogTest.this);
                dial.setTitle("一个Dialog");
                dial.setMessage("现在手机内部正在发生什么");
                dial.setCancelable(false);
                dial.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dial.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dial.show();
                break;
            default:
                break;
        }
    }
}