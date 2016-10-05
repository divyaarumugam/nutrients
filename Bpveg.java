package com.example.senthil.nutrients;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Bpveg extends AppCompatActivity {
    ListView list;
    String[] itemname ={
            "Cabbage",
            "Potato",
            "Carrot",
            "Broccoli",
            "White Beans",
            "Sweet Potato",
            "Pumpkin"

    };

    Integer[] imgid={
            R.drawable.whitepotato,
            R.drawable.cabbage,
            R.drawable.carrot,
            R.drawable.broccoli,
            R.drawable.whitebeans,
            R.drawable.sweetpotato,
            R.drawable.pumpkin


    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);
        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                String Selecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Bpveg.this,AlarmActivity.class);
                startActivity(i);
            }
        });
    }
}
