package com.example.senthil.nutrients;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ALLEN on 05-10-2016.
 */
public class Describe extends AppCompatActivity{
    String result;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        result=ServerIPAddress.getIpaddress();
        if(result.equals("Grapes")){
            setContentView(R.layout.grape);
        }
        else if(result.equals("Orange")){
            setContentView(R.layout.orange);
        }
        else if(result.equals("WaterMelon")){
            setContentView(R.layout.watermelon);
        }
        else if(result.equals("Cherry")){
            setContentView(R.layout.cherries);
        }
        else if(result.equals("Apple")){
            setContentView(R.layout.cherries);
        }
        else if(result.equals("Banana")){
            setContentView(R.layout.banana);
        }
        else if(result.equals("Avocado")){
            setContentView(R.layout.avacoda);
        }
        else if(result.equals("Plums")){
            setContentView(R.layout.plums);
        }
        else if(result.equals("Apricots")){
            setContentView(R.layout.apricots);
        }
        else if(result.equals("Berries")){
            setContentView(R.layout.blueberry);
        }
        else if(result.equals("Raisins")){
            setContentView(R.layout.raisins);
        }
        else if(result.equals("Pineapple")){
            setContentView(R.layout.pineapple);
        }
        else if(result.equals("Kiwi")) {
            setContentView(R.layout.kiwi);
        }

        else if(result.equals("Cabbage")) {
            setContentView(R.layout.cabbe);
        }
        else if(result.equals("Tomato")) {
            setContentView(R.layout.tomato);
        }
        else if(result.equals("Finger Millet")) {
            setContentView(R.layout.fingermillet);
        }
        else if(result.equals("Soya Beans")) {
            setContentView(R.layout.soyabeans);
        }
        else if(result.equals("Asparagus")) {
            setContentView(R.layout.asparagus);
        }
        else
        {
            setContentView(R.layout.grape);
        }


    }
}
