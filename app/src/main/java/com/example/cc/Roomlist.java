package com.example.cc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.cc.javapapers.android.chat.ChatBubbleActivity;

public class Roomlist extends AppCompatActivity {
    RelativeLayout main;
    EditText reserch;
    Button room1, room2, room3, room4;

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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        main = (LinearLayout) findViewById(R.id.main);
//        reserch = (EditText) findViewById(R.id.reserch);
        room1 = (Button) findViewById(R.id.room1);
        room2 = (Button) findViewById(R.id.room2);
        room3 = (Button) findViewById(R.id.room3);
        room4 = (Button) findViewById(R.id.room4);
        rimg1 = (ImageView) findViewById(R.id.rimg1);
        rimg2 = (ImageView) findViewById(R.id.rimg2);
        rimg3 = (ImageView) findViewById(R.id.rimg3);
        rimg4 = (ImageView) findViewById(R.id.rimg4);
        rname1 = (TextView) findViewById(R.id.rname1);
        rname2 = (TextView) findViewById(R.id.rname2);
        rname3 = (TextView) findViewById(R.id.rname3);
        rname4 = (TextView) findViewById(R.id.rname4);

        rimg1.bringToFront();
        rimg2.bringToFront();
        rimg3.bringToFront();
        rimg4.bringToFront();
        rname1.bringToFront();
        rname2.bringToFront();
        rname3.bringToFront();
        rname4.bringToFront();

        room1.setOnClickListener(new View.OnClickListener() {
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
                    if (roomVisible) {
                        room1.setVisibility(View.INVISIBLE);
                        roomVisible = false;
                    } else {
                        room1.setVisibility(View.VISIBLE);
                        roomVisible = true;
                    }
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


}

