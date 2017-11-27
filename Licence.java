package com.example.gim_yongjun.card_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Licence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licence);
        try{

            // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
            // txt 파일을 InpuStream에 넣는다. (open 한다)
            InputStream in = getResources().openRawResource(R.raw.licence);

            if(in != null){

                InputStreamReader stream = new InputStreamReader(in, "utf-8");
                BufferedReader buffer = new BufferedReader(stream);

                String read;
                StringBuilder sb = new StringBuilder("");

                while((read=buffer.readLine())!=null){
                    sb.append(read);
                }

                in.close();

                // id : textView01 TextView를 불러와서
                //메모장에서 읽어온 문자열을 등록한다.
                TextView textView = (TextView)findViewById(R.id.lic);
                textView.setText(sb.toString());
            }

        }catch(Exception e){
            e.printStackTrace();
        }


        // music.mp3 파일 역시 getResources().openRawResource()로
        //가져올 수 있다.
        // 여기서는 MediaPlayer로도 음악 파일을 가져오고
        // start()로 실행할 수 있다.
    }
}
