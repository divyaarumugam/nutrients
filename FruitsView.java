package com.example.senthil.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class FruitsView extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Grapes",
            "Orange",
            "WaterMelon",
            "Cherry",
            "Apple",
            "Banana",
            "Plums",
            "Avocado",
            "Apricots",
            "Berries",
            "Raisins",
            "Pineapple",
            "Kiwi"

    };

    Integer[] imgid={
            R.drawable.grape,
            R.drawable.orange,
            R.drawable.water,
            R.drawable.cherry,
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.plums,
            R.drawable.avocado,
            R.drawable.apricots,
            R.drawable.berries,
            R.drawable.raisins,
            R.drawable.pineapple,
            R.drawable.kiwi


    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);
                CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
                list=(ListView)findViewById(R.id.list);
                list.setAdapter(adapter);

                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        // TODO Auto-generated method stub
                        String Slecteditem= itemname[+position];
                        Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
Intent i=new Intent(FruitsView.this,Alarm.class);
                        startActivity(i);
                    }
                });
            }
        }
