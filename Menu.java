package com.example.senthil.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ALLEN on 03-10-2016.
 */
public class Menu extends AppCompatActivity {
    Button Button1,Button2,Button3,Calorie;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Button1=(Button)findViewById(R.id.button10_menu1);
        Button2=(Button)findViewById(R.id.button5_menu2);
        Button3=(Button)findViewById(R.id.button6_menu3);
        Calorie=(Button)findViewById(R.id.button14_menu_calorie);
        Calorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu.this,Calorie.class);
                startActivity(i);
            }
        });
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu.this,FocusOn.class);
                startActivity(i);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu.this,FocusOnSecond.class);
                startActivity(i);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Menu.this,FocusOnSecond.class);
                startActivity(i);
            }
        });
    }
}
