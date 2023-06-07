package com.example.cc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;


public class Help extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        setTitle("");

        Toolbar toolbar = findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);
        ActionBar actionBar = getSupportActionBar ();
        actionBar.setDisplayHomeAsUpEnabled (true);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId ()) {
            case android.R.id.home:
                finish ();
                return true;
            default:
                return super.onOptionsItemSelected (item);
        }
    }
}
