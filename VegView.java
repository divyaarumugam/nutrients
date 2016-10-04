package com.example.senthil.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class VegView extends AppCompatActivity {
    ListView list;
    String[] itemname ={
            "Cabbage",
            "Tomato",
            "Finger Millet",
            "Soya Beans",
            "Asparagus"

    };

    Integer[] imgid={
            R.drawable.tomato,
            R.drawable.cabbage,
            R.drawable.finger,
            R.drawable.soya,
            R.drawable.asparagus,

    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Selecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();
                Intent i=new Intent(VegView.this,Alarm.class);
                startActivity(i);
            }
        });
    }
}

