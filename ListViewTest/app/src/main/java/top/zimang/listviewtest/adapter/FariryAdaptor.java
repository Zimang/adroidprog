package top.zimang.listviewtest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import top.zimang.listviewtest.R;
import top.zimang.listviewtest.model.Fairy;

public class FariryAdaptor extends ArrayAdapter {
    private int resId;

    public FariryAdaptor(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        resId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fairy fairy= (Fairy) getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resId,parent,false);
        ImageView fairyImage =(ImageView) view.findViewById(R.id.fariy_image);
        TextView fairyName=(TextView) view.findViewById(R.id.fariy_name);
        fairyImage.setImageResource(fairy.getImageId());
        fairyName.setText(fairy.getName());
        return view;
    }
}
