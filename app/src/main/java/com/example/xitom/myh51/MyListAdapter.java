package com.example.xitom.myh51;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by xitom on 2017/1/9.
 */

public class MyListAdapter extends BaseAdapter {

    Context myContext;
    ArrayList Mye;
    LayoutInflater inflate;

    MyListAdapter(Context context, ArrayList e){
        inflate = LayoutInflater.from(context);
        myContext = context;
        Mye = e;
    }

    @Override
    public int getCount() {
        return Mye.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView!=null){
            return convertView;
        }else{

        }
        return null;
    }

    public class ItemView{
        ImageView ivLogo;
        TextView tvName;
        Button btnClick;

    }
}
