package com.example.gim_yongjun.card_news;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;


public class DialogforSelect extends Dialog {
    private Context context;
    private Button b1,b2,b3,b4,b5,b6,b7,bb1,bb2,bb3;
    private LinearLayout l1,l2;
    private View.OnClickListener e_daily;
    private View.OnClickListener han;
    private View.OnClickListener news;
    private View.OnClickListener yeon;
    private View.OnClickListener sbs;
    private View.OnClickListener jeon;
    private View.OnClickListener jo;
    private View.OnClickListener article;
    private View.OnClickListener corp;
    private View.OnClickListener setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 다이얼로그 외부 화면 흐리게 표현
        WindowManager.LayoutParams lpWindow_inf = new WindowManager.LayoutParams();
        lpWindow_inf.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow_inf.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow_inf);

        setContentView(R.layout.activity_dialogfor_select);

        b1 = (Button)findViewById(R.id.e_btn);
        b2 = (Button)findViewById(R.id.han_btn);
        b3 = (Button)findViewById(R.id.new_btn);
        b4 = (Button)findViewById(R.id.yeon_btn);
        b5 = (Button)findViewById(R.id.sbs_btn);
        b6 = (Button)findViewById(R.id.jeon_btn);
        b7 = (Button)findViewById(R.id.jo_btn);
        bb1 = (Button)findViewById(R.id.btbt1);
        bb2 = (Button)findViewById(R.id.btbt2);
        bb3 = (Button)findViewById(R.id.btbt3);

        // 클릭 이벤트 셋팅
        b1.setOnClickListener(e_daily);
        b2.setOnClickListener(han);
        b3.setOnClickListener(news);
        b4.setOnClickListener(yeon);
        b5.setOnClickListener(sbs);
        b6.setOnClickListener(jeon);
        b7.setOnClickListener(jo);
        bb1.setOnClickListener(article);
        bb2.setOnClickListener(corp);
        bb3.setOnClickListener(setting);

        l1 = (LinearLayout)findViewById(R.id.l1);
        l2 = (LinearLayout)findViewById(R.id.l2);
        if (MainActivity.a == 1) {
            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.GONE);
        }
        if (MainActivity.a == 2) {
            l1.setVisibility(View.GONE);
            l2.setVisibility(View.VISIBLE);
        }
    }

    // 클릭버튼이 하나일때 생성자 함수로 클릭이벤트를 받는다.
    public DialogforSelect(Context context,
                           View.OnClickListener b1, View.OnClickListener b2,
                           View.OnClickListener b3, View.OnClickListener b4
            , View.OnClickListener b5, View.OnClickListener b6, View.OnClickListener b7) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.e_daily = b1;
        this.han = b2;
        this.news = b3;
        this.yeon = b4;
        this.sbs = b5;
        this.jeon = b6;
        this.jo = b7;
        this.context = context;
        MainActivity.a = 1;
//        l2.setVisibility(View.GONE);
    }

    public DialogforSelect(Context context, View.OnClickListener bb1, View.OnClickListener bb2, View.OnClickListener bb3){
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.article = bb1;
        this.corp = bb2;
        this.setting = bb3;

        this.context = context;
        MainActivity.a=2;
//        l1.setVisibility(View.GONE);
    }

}