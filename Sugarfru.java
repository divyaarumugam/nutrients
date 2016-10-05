package com.example.senthil.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class Sugarfru extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Grapes",
            "Orange",
            "WaterMelon",
            "Apple",
            "Banana",
            "Dates",
            "Grapefruit",
            "Blue Berries"

    };

    Integer[] imgid={
            R.drawable.grape,
            R.drawable.orange,
            R.drawable.water,
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.dates,
            R.drawable.blueberry,
            R.drawable.grapefruit

    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);
        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Sugarfru.this,AlarmActivity.class);
                startActivity(i);
            }
        });
    }
}
