package com.example.senthil.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class FocusOnSecond extends AppCompatActivity {
    Button Fruits,Veg;
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option);


        Fruits=(Button)findViewById(R.id.button7_option_fruit);
        Veg=(Button)findViewById(R.id.button15_option_veg);
        Fruits.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
            Intent i=new Intent(FocusOnSecond.this,FruitsViewSecond.class);
                startActivity(i);
            }
        });
        Veg.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i=new Intent(FocusOnSecond.this,VegViewSecond.class);
                startActivity(i);



            }
        });
    }
}
