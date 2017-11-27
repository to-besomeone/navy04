package com.example.gim_yongjun.card_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


public class E_Daily extends AppCompatActivity {

    GridView gridview;
    ArrayList<Data> arrayList = new ArrayList<Data>();
    ArrayAdapter<Data> arrayAdapter;
    My_Adapter adapter;
    WebView webView;
    String string;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e__daily);
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
                        string ="http://news.naver.com/main/hotissue/read.nhn?mid=hot&sid1=110&cid=1010805&iid=5060579&oid=018&aid=0003957469&ptype=021";
                        break;
                }
                webView.loadUrl(string);
            }
        });
    }
    void init() {
        gridview = (GridView) findViewById(R.id.grid1);
        arrayList.add(new Data("스페인 카탈루냐 독립", R.drawable.glob));
        adapter = new My_Adapter(arrayList,E_Daily.this);
        gridview.setAdapter(adapter);
    }
}
