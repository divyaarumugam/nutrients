package com.example.senthil.nutrients;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.StringTokenizer;

/**
 * Created by ALLEN on 03-10-2016.
 */
public class Register extends AppCompatActivity {
    EditText Username,Password,Email,PhoneNumber;
    Button Submit;
    StringTokenizer stringTokenizer;
    SqliteController sqliteController;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        sqliteController=new SqliteController(this);

        Username=(EditText)findViewById(R.id.editText15_username);
        Password=(EditText)findViewById(R.id.editText16_password);
        Email=(EditText)findViewById(R.id.editText18_email);
        PhoneNumber=(EditText)findViewById(R.id.editText19_contactnumber);
        Submit=(Button)findViewById(R.id.button17_register);
        String details = sqliteController.getUserInfo();
        Toast.makeText(getApplicationContext(), "One User only Register at a Time", Toast.LENGTH_SHORT).show();
        if(details!=null && details.startsWith("VALID")){stringTokenizer = new StringTokenizer(details,"$");
            stringTokenizer.nextToken();
            String name = stringTokenizer.nextToken();
            String pass = stringTokenizer.nextToken();
            String mail = stringTokenizer.nextToken();
            String cno = stringTokenizer.nextToken();
            Username.setText(name);
            Password.setText(pass);
            Email.setText(mail);
            PhoneNumber.setText(cno);
            finish();
            Toast.makeText(getApplicationContext(),"You Already Registered",Toast.LENGTH_LONG).show();

        }
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=Username.getText().toString().trim();
                String pass=Password.getText().toString().trim();
                String mail=Email.getText().toString().trim();
                String number=PhoneNumber.getText().toString().trim();
                long i = sqliteController.insertdetail(uname, pass,mail,number);
                if(i>0){
                    Toast.makeText(getApplicationContext(), "Values are inserted successfully...", Toast.LENGTH_LONG).show();
                    finish();
                    Intent intent = new Intent(Register.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Values are not inserted...", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    }

