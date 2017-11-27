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


public class Jeon extends AppCompatActivity {

    GridView gridview;
    ArrayList<Data> arrayList = new ArrayList<Data>();
    ArrayAdapter<Data> arrayAdapter;
    My_Adapter adapter;
    WebView webView;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeon);
        init();
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
                        string ="http://www.etnews.com/20171030000059";
                        webView.setVisibility(View.VISIBLE);
                        break;
                }
                webView.loadUrl(string);
            }
        });
    }
    void init() {
        gridview = (GridView) findViewById(R.id.grid1);
        arrayList.add(new Data("고가폰만 잘 팔리는 사회", R.drawable.it));
        adapter = new My_Adapter(arrayList,Jeon.this);
        gridview.setAdapter(adapter);
    }
}
