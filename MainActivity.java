package com.example.gim_yongjun.card_news;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private DialogforSelect dialogforSelect;
    static int a=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button g_btn = (Button) findViewById(R.id.genre_btn);
        Button corp_btn = (Button)findViewById(R.id.corp_btn);
        Button set_btn = (Button)findViewById(R.id.set_btn);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        g_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(1);
            }
        });
        corp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogforSelect = new DialogforSelect(MainActivity.this,e_daily,han,yeon,sbs,news,jeon,jo);
                dialogforSelect.show();
            }
        });
        set_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogforSelect = new DialogforSelect(MainActivity.this,article,corp,licence);
                dialogforSelect.show();
            }
        });



    }

    @Override
    protected Dialog onCreateDialog(int id) {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("주제");
        builder.setItems(R.array.genre, new DialogInterface.OnClickListener() {
            // 리스트 목록 클릭 이벤트
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Intent intent1 =new Intent(MainActivity.this,Politics.class);
                        startActivity(intent1);
                        break;
//                        Toast.makeText(MainActivity.this, getResources().getStringArray(R.array.genre)[which], Toast.LENGTH_SHORT).show();break;
                    case 1:
                        Intent intent2=new Intent(MainActivity.this,Social.class);
                        startActivity(intent2);
                        break;

                    case 2:
                        Intent intent3=new Intent(MainActivity.this,Economic.class);
                        startActivity(intent3);
                        break;

                    case 3:
                        Intent intent4=new Intent(MainActivity.this,IT.class);
                        startActivity(intent4);
                        break;

                    case 4:
                        Intent intent5=new Intent(MainActivity.this,Live.class);
                        startActivity(intent5);
                        break;

                    case 5:
                        Intent intent6=new Intent(MainActivity.this,Global.class);
                        startActivity(intent6);
                        break;

                    case 6:
                        Intent intent7=new Intent(MainActivity.this,Enter.class);
                        startActivity(intent7);
                        break;



                }

            }

        });
        return builder.create();
    }
    private View.OnClickListener e_daily = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent8 =new Intent(MainActivity.this,E_Daily.class);
            startActivity(intent8);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener han = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent9 =new Intent(MainActivity.this,Han.class);
            startActivity(intent9);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener news = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent10 =new Intent(MainActivity.this,News.class);
            startActivity(intent10);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener yeon = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent11 =new Intent(MainActivity.this,Yeon.class);
            startActivity(intent11);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener sbs = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent12 =new Intent(MainActivity.this,Sbs.class);
            startActivity(intent12);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener jeon = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent13 =new Intent(MainActivity.this,Jeon.class);
            startActivity(intent13);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener jo = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent14 =new Intent(MainActivity.this,Jo.class);
            startActivity(intent14);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener article = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent15 =new Intent(MainActivity.this,Article.class);
            startActivity(intent15);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener corp = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent16 =new Intent(MainActivity.this,Corp.class);
            startActivity(intent16);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener licence = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent17 =new Intent(MainActivity.this,Licence.class);
            startActivity(intent17);
            dialogforSelect.dismiss();
        }
    };

}
