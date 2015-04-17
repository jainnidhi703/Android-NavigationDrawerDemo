package com.example.nidhi.testapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nidhi on 14/4/15.
 */
public class NavDrawerListAdapter extends ArrayAdapter<String> {

    private Context context;
    String[] nav_drawer_items;
    Integer[] image_id;

    public NavDrawerListAdapter(Activity context,Integer[] image_id, String[] text){
        super(context, R.layout.nav_drawer_item, text);
        this.image_id = image_id;
        this.nav_drawer_items = text;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View single_row = inflater.inflate(R.layout.nav_drawer_item, null, true);
        TextView textView = (TextView) single_row.findViewById(R.id.listTitle);
        ImageView imageView = (ImageView) single_row.findViewById(R.id.listIcon);
        textView.setText(nav_drawer_items[position]);
        imageView.setImageResource(image_id[position]);
        return single_row;
    }

}
