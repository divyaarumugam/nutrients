package com.example.senthil.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by ALLEN on 03-10-2016.
 */
public class Home extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
         final int interval = 1000; // 1 Second
         Handler handler = new Handler();
         Runnable runnable = new Runnable() {
            public void run() {
                //Toast.makeText(Home.this, "Started", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Home.this,Menu.class);
                startActivity(i);
            }
        };

        handler.postAtTime(runnable, System.currentTimeMillis() + interval);
        handler.postDelayed(runnable, interval);
    }
}