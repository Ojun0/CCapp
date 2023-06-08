package com.example.cc;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.cc.javapapers.android.chat.ChatBubbleActivity;
import java.util.ArrayList;
import java.util.List;

public class Roomlist extends AppCompatActivity {
    RelativeLayout main;
    EditText reserch;
    Dialog dilaog01;

    ConstraintLayout[] room_layouts = new ConstraintLayout[3];
    Button[] room_buttons = new Button[3];
    int roomNum = 0;

    ImageView rimg1, rimg2, rimg3, rimg4;

    TextView rname1, rname2, rname3, rname4;

    boolean roomVisible = true;


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        super.onCreateOptionsMenu(menu);
//        MenuInflater mInflater = getMenuInflater();
//        mInflater.inflate(R.menu.menu, menu);
//
//        return true;
//    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getItemId()){
////            case R.id.item_help:
////                main.setLayoutTransition();
////                return true;
////            case R.id.discord:
////                main;
////                return true;
////            case R.id.notion:
////                main;
////                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle("");

        dilaog01 = new Dialog(Roomlist.this);
        dilaog01.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dilaog01.setContentView(R.layout.dialog01);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        main = (LinearLayout) findViewById(R.id.main);
//        reserch = (EditText) findViewById(R.id.reserch);
        room_layouts[0] = findViewById(R.id.room_layout1);
        room_layouts[1] = findViewById(R.id.room_layout2);
        room_layouts[2] = findViewById(R.id.room_layout3);

        room_buttons[0] = findViewById(R.id.room1);
        room_buttons[1] = findViewById(R.id.room2);
        room_buttons[2] = findViewById(R.id.room3);

        rname1 = (TextView) findViewById(R.id.rname1);
        rname2 = (TextView) findViewById(R.id.rname2);
        rname3 = (TextView) findViewById(R.id.rname3);


        room_buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChatBubbleActivity.class);
                startActivity(intent);
            }
        });

        room_buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChatBubbleActivity.class);
                startActivity(intent);
            }
        });

        room_buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChatBubbleActivity.class);
                startActivity(intent);
            }
        });
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater ().inflate (R.menu.menu, menu);

        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.addRoom:
                showDialog01();
//                room_layouts[roomNum].setVisibility(View.VISIBLE);
//                roomNum += 1;
//                if (roomNum >= room_layouts.length)
//                    roomNum = room_layouts.length - 1;
//                return true;
                return true;
            case R.id.item_help:
                startActivity (new Intent (this, Help.class));
                return true;
            case R.id.discord:
                return true;
            case R.id.notion:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showDialog01() {
        dilaog01.show();

        Button resultBtn = dilaog01.findViewById(R.id.resultBtn);
        if (resultBtn != null) {
            resultBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    room_layouts[roomNum].setVisibility(View.VISIBLE);
                    roomNum += 1;
                    if (roomNum >= room_layouts.length)
                        roomNum = room_layouts.length - 1;
                    dilaog01.dismiss();
                }
            });
        }

    }


}

