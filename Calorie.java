package com.example.senthil.nutrients;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by ALLEN on 04-10-2016.
 */
public class Calorie extends AppCompatActivity {
    EditText Age,Height,Weight;
    TextView Result;
    Button Calculate;
    RadioGroup rg;
    RadioButton b1,b2;
    String result;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calorie);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        Age=(EditText)findViewById(R.id.editText8_age);
        Height=(EditText)findViewById(R.id.editText_height);
        Weight=(EditText)findViewById(R.id.editText2_weight);
        Result=(TextView)findViewById(R.id.textView10_result);
        Calculate=(Button)findViewById(R.id.button_calculate);
        b1=(RadioButton)findViewById(R.id.radioButton3_male);
        b2=(RadioButton)findViewById(R.id.radioButton4_female);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.radioButton3_male) {
                    result="Male";
                } else if(checkedId == R.id.radioButton4_female) {
                    result = "Female";
                }
            }
        });
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sex=result.toString();
                if(sex.equals("Male")){
                    String age=Age.getText().toString().trim();
                    String height=Height.getText().toString();
                    String weight=Weight.getText().toString();
                    double age_n=Double.parseDouble(age);
                    double h=Double.parseDouble(height);
                    double w=Double.parseDouble(weight);
                 double bmr=(4.7 * h) + (4.35*w) - (4.7*age_n);
                    double bmr_res=bmr+655;
                    Result.setText("Your Body Mass Ratio is:"+String.valueOf(bmr_res));

                }
                else if(sex.equals("Female")){
                    String age=Age.getText().toString().trim();
                    String height=Height.getText().toString();
                    String weight=Weight.getText().toString();
                    double age_n=Double.parseDouble(age);
                    double h=Double.parseDouble(height);
                    double w=Double.parseDouble(weight);
                    double bmr=(12.7 *h) + (6.23*w) - (6.8*age_n);
                    double bmr_res=bmr+66;
                    Result.setText("Your Body Mass Ratio is:"+String.valueOf(bmr_res));

                }

            }
        });
    }
}
