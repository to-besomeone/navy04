package com.example.gim_yongjun.card_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


public class Sbs extends AppCompatActivity {

    GridView gridview;
    ArrayList<Data> arrayList = new ArrayList<Data>();
    ArrayAdapter<Data> arrayAdapter;
    My_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbs);
        init();
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            }
        });
    }
    void init() {
        gridview = (GridView) findViewById(R.id.grid1);
        arrayList.add(new Data("명령 거부한 로봇", R.drawable.tech));
        adapter = new My_Adapter(arrayList,Sbs.this);
        gridview.setAdapter(adapter);
    }
}
