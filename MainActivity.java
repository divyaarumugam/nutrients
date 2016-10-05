package com.example.senthil.nutrients;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText Username,Password;
Button Register,Login;
    TextView t;
    SqliteController sqliteController;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        t=(TextView)findViewById(R.id.textView20);
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
                String i = sqliteController.loginCheck(uname,pass);
                if(i.startsWith("AVAILABLE")){
                    Intent i1=new Intent(MainActivity.this,Home.class);
                    startActivity(i1);
                    Username.setText("");
                    Password.setText("");
                    finish();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid UserName and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Forgot Password..?"); //Set Alert dialog title here
                alert.setMessage("Enter Your New UserName"); //Message here


                final EditText input = new EditText(MainActivity.this);
                alert.setView(input);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        String srt = input.getEditableText().toString();
                        ServerIPAddress.setPassword(srt);
                        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                        alert.setTitle("Forgot Password..?"); //Set Alert dialog title here
                        alert.setMessage("Enter Your New Password"); //Message here


                        final EditText input = new EditText(MainActivity.this);
                        alert.setView(input);

                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                                String srt = input.getEditableText().toString();
                                String username=ServerIPAddress.getPassword();

                                int i = sqliteController.updatePassword(username,srt);
                        if(i>0){
                            Toast.makeText(getApplicationContext(), "Values are updated successfully...", Toast.LENGTH_LONG).show();
                            //Intent intent = new Intent(EditForm.this,IPAddressForm.class);
                            //startActivity(intent);
                        }else{
                            Toast.makeText(getApplicationContext(), "Values are not updated...", Toast.LENGTH_LONG).show();
                        }
                                // ServerIPAddress.setserverIPaddress(srt);
                                // ServerIPAddress.seturl(username);
                                // Intent intent = new Intent(MainActivity.this,Menu.class);
                                // startActivity(intent);
                                //Toast.makeText(context,srt,Toast.LENGTH_LONG).show();
                            }
                        });
                        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                // Canceled.
                                dialog.cancel();
                            }
                        }); //End of alert.setNegativeButton
                        AlertDialog alertDialog = alert.create();
                        alertDialog.show();

                        //int i = sqliteController.updatePassword(srt);
                        /*if(i>0){
                            Toast.makeText(getApplicationContext(), "Values are updated successfully...", Toast.LENGTH_LONG).show();
                            //Intent intent = new Intent(EditForm.this,IPAddressForm.class);
                            //startActivity(intent);
                        }else{
                            Toast.makeText(getApplicationContext(), "Values are not updated...", Toast.LENGTH_LONG).show();
                        }*/
                       // ServerIPAddress.setserverIPaddress(srt);
                       // ServerIPAddress.seturl(username);
                       // Intent intent = new Intent(MainActivity.this,Menu.class);
                       // startActivity(intent);
                        //Toast.makeText(context,srt,Toast.LENGTH_LONG).show();
                    }
                });
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Canceled.
                        dialog.cancel();
                    }
                }); //End of alert.setNegativeButton
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
            }
        });
    }

}
