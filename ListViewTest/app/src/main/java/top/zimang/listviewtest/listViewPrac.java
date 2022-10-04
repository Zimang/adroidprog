package top.zimang.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listViewPrac extends AppCompatActivity {
    private String[] data={
            "Apple","Banana","Orange","Watermelon","Pear","Mango","CHerry",
            "Apple","Banana","Orange","Watermelon","Pear","Mango","CHerry"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_prac);
        //android.R.layout.simple_list_item_1,data表示ListView的子项布局id，这是一个Android内置的布局文件，里面只有一个ListView
        //MainActivity.this表示Acitvity对象
        //填充对象data
        ArrayAdapter<String> ad=new ArrayAdapter<String>(
                listViewPrac.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView) findViewById(R.id.lsit_view);
        listView.setAdapter(ad);

    }
}