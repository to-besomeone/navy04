package com.example.gim_yongjun.card_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


public class Live extends AppCompatActivity {

    GridView gridview;
    ArrayList<Data> arrayList = new ArrayList<Data>();
    ArrayAdapter<Data> arrayAdapter;
    My_Adapter adapter;
    WebView webView;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economic);
        webView = (WebView)findViewById(R.id.w1);
        final WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        init();
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    default:
                        string ="http://www.yonhapnews.co.kr/bulletin/2017/11/03/0200000000AKR20171103039700797.HTML?from=search";
                        webView.setVisibility(View.VISIBLE);
                        break;
                }
                webView.loadUrl(string);
            }
        });
    }
    void init() {
        gridview = (GridView) findViewById(R.id.grid1);
        arrayList.add(new Data("영화관에서 바퀴벌레가 나왔어요.", R.drawable.live));
        adapter = new My_Adapter(arrayList,Live.this);
        gridview.setAdapter(adapter);
    }
}
