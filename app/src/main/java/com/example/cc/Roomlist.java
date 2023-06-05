package com.example.cc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cc.javapapers.android.chat.ChatArrayAdapter;
import com.example.cc.javapapers.android.chat.ChatBubbleActivity;

public class Roomlist extends AppCompatActivity {
    RelativeLayout main;
    EditText reserch;
    Button room1, room2, room3, room4;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
//            case R.id.item_help:
//                main.setLayoutTransition();
//                return true;
//            case R.id.discord:
//                main;
//                return true;
//            case R.id.notion:
//                main;
//                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle("");
        main = (RelativeLayout) findViewById(R.id.main);
        reserch = (EditText) findViewById(R.id.reserch);
        room1 = (Button) findViewById(R.id.room1);
        room2 = (Button) findViewById(R.id.room2);
        room3 = (Button) findViewById(R.id.room3);
        room4 = (Button) findViewById(R.id.room4);

        room1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChatBubbleActivity.class);
                startActivity(intent);
            }
        });
   }


}

