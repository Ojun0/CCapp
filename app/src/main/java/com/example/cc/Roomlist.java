package com.example.cc;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Roomlist extends AppCompatActivity {
    RelativeLayout main;
    EditText reserch;

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
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        main = (RelativeLayout) findViewById(R.id.main);
        reserch = (EditText) findViewById(R.id.reserch);
    }


}

