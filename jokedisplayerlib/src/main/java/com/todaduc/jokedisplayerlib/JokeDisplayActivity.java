package com.todaduc.jokedisplayerlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        if (getIntent().hasExtra("joke")){
            Toast.makeText(this, getIntent().getStringExtra("joke"), Toast.LENGTH_SHORT).show();
        }
    }
}
