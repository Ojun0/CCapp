package com.example.cc;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends Activity {


    private View _bg__android_large___1_ek2;
    private View rectangle_23;
    private View rectangle_22;
    private Button rectangle_25;
    private Button rectangle_26;
    private Button rectangle_27;
    private ImageView line_1;
    private ImageView line_2;
    private Button rectangle_5;
    private EditText rectangle_3;
    private EditText rectangle_24;
    private View ellipse_2;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_large___1);


        _bg__android_large___1_ek2 = (View) findViewById(R.id._bg__android_large___1_ek2);
        rectangle_23 = (View) findViewById(R.id.rectangle_23);
        rectangle_25 = (Button) findViewById(R.id.rectangle_25);
        rectangle_26 = (Button) findViewById(R.id.rectangle_26);
        rectangle_27 = (Button) findViewById(R.id.rectangle_27);
        line_1 = (ImageView) findViewById(R.id.line_1);
        line_2 = (ImageView) findViewById(R.id.line_2);
        rectangle_5 = (Button) findViewById(R.id.rectangle_5);
        rectangle_3 = (EditText) findViewById(R.id.rectangle_3);
        rectangle_24 = (EditText) findViewById(R.id.rectangle_24);

        //custom code goes here

        rectangle_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //메인화면
                Intent intent = new Intent(getApplicationContext(), Roomlist.class);
                startActivity(intent);
            }

        });

        rectangle_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //비밀번호찾기
            }
        });

        rectangle_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //아이디 찾기
            }
        });

        rectangle_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //회원가입
            }
        });

    }
}