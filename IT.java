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

public class IT extends AppCompatActivity {
    GridView gridview;
    ArrayList<Data> arrayList = new ArrayList<Data>();
    ArrayAdapter<Data> arrayAdapter;
    My_Adapter adapter;
    WebView webView;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        init();
        webView = (WebView)findViewById(R.id.w1);
        final WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    default:
                        string ="http://news.sbs.co.kr/news/endPage.do?news_id=N1004456951&plink=THUMB&cooper=SUBUSUMAIN";
                        webView.setVisibility(View.VISIBLE);
                        break;
                }
                webView.loadUrl(string);
            }
        });
    }
    void init() {
        gridview = (GridView) findViewById(R.id.grid1);
        arrayList.add(new Data("명령 거부한 로봇", R.drawable.it));
        adapter = new My_Adapter(arrayList,IT.this);
        gridview.setAdapter(adapter);
    }
}
