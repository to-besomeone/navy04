package com.example.gim_yongjun.card_news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gim-yongjun on 2017. 11. 2..
 */

public class My_Adapter extends BaseAdapter {
    ArrayList<Data> arrayList;
    Context c;

    public My_Adapter(ArrayList<Data> arrayList, Context c) {
        this.arrayList = arrayList;
        this.c = c;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(c);
        if(view==null) {
            view = inflater.inflate(R.layout.my_gridview, null);
        }
        TextView t1 = (TextView)view.findViewById(R.id.t1);
        ImageView t2 = (ImageView) view.findViewById(R.id.img);

        Data one;
        one = arrayList.get(i);
        t1.setText(one.getName());
        t2.setImageResource(one.getPhoto());
        return view;
    }
}
