package com.example.senthil.nutrients;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText Username,Password;
Button Register,Login;
    SqliteController sqliteController;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        sqliteController=new SqliteController(this);
        Username=(EditText)findViewById(R.id.editText_home_username);
        Password=(EditText)findViewById(R.id.editText2_home_password);
        Login=(Button)findViewById(R.id.button_home_login);
        Register=(Button)findViewById(R.id.button2_home_register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Register.class);
                startActivity(i);
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=Username.getText().toString().trim();
                String pass=Password.getText().toString().trim();
                Intent i1=new Intent(MainActivity.this,Home.class);
                startActivity(i1);
                //String i = sqliteController.loginCheck(uname,pass);
               /* if(i.startsWith("AVAILABLE")){
                    Intent i1=new Intent(MainActivity.this,Home.class);
                    startActivity(i1);
                    Username.setText("");
                    Password.setText("");
                    finish();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid UserName and Password", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }

}
