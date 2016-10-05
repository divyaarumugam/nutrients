package com.example.senthil.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class Bpfru extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Grapes",
            "Orange",
            "Apple",
            "Banana",
            "Plums",
            "Avocado",
            "Apricots",
            "Blue Berries",
            "Pineapple",
            "Kiwi",
            "Currants",
            "Pears",
            "Mango",
            "Papaya"


    };

    Integer[] imgid={
            R.drawable.grape,
            R.drawable.orange,
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.plums,
            R.drawable.avocado,
            R.drawable.apricots,
            R.drawable.blueberry,
            R.drawable.pineapple,
            R.drawable.kiwi,
            R.drawable.currant,
            R.drawable.pears,
            R.drawable.mango,
            R.drawable.papaya
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
                Intent i=new Intent(Bpfru.this,AlarmActivity.class);
                startActivity(i);
            }
        });
    }
}
