package com.example.senthil.nutrients;

import android.util.Log;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
 
public class SqliteController  extends SQLiteOpenHelper {
    private static final String LOGCAT = null;
    
    
    public SqliteController(Context applicationcontext) {
        super(applicationcontext, "Nutrients.db", null, 1);
        Log.d(LOGCAT,"Created");
    }
     
    @Override
    public void onCreate(SQLiteDatabase database) {
        String query;
        query = "CREATE TABLE userdetails (slno TEXT,name TEXT,pass TEXT,emailId TEXT,cno TEXT)";
        database.execSQL(query);
        Log.d(LOGCAT,"userdetails Created");
    }
    @Override
    public void onUpgrade(SQLiteDatabase database, int version_old, int current_version) {
        String query;
        query = "DROP TABLE IF EXISTS userdetails";
        database.execSQL(query);
        onCreate(database);
    }
    
    
    public String  getFirstRow(){
    	String  device1= null;
    	
    	 SQLiteDatabase database = this.getReadableDatabase();
    	 String selectQuery = "SELECT  * from userdetails where slno='1'";
    	 Cursor cursor = database.rawQuery(selectQuery, null);
    	 if(cursor.moveToFirst()){
    		 do {
    			 device1 = cursor.getString(0);
    			 device1 = "AVAILABLE";
    			
    			 Log.d(LOGCAT,"Test....."+device1);
    			 //Toast.makeText(context, altermobileNoEmailId, Toast.LENGTH_LONG).show();
    		 }while (cursor.moveToNext());
    	 }else{
    		 device1 = "NOTAVAILABLE";
    	 }
    	 database.close();
    	return device1;
    }
	//slno TEXT,name TEXT,pass TEXT,emailId TEXT,cno TEXT
     
    public long insertdetail(String name,String pass,String emailId,String cno) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("slno","1");
        values.put("name", name);
        values.put("pass", pass);
        values.put("emailId", emailId);
        values.put("cno", cno);

        
                    
        long i = database.insert("userdetails", null, values);
        if(i>0){
        	Log.d(LOGCAT, "Values are inserted successfully");
        }else{
        	Log.d(LOGCAT, "Values are Not inserted successfully");
        }
        database.close();
        return i;
    }
     
    
    public String  getPassword(){
    	String  password= null;
    	
    	 SQLiteDatabase database = this.getReadableDatabase();
    	 String selectQuery = "SELECT  pass from userdetails where SLNO='1'";
    	 Cursor cursor = database.rawQuery(selectQuery, null);
    	 if(cursor.moveToFirst()){
    		 do {
    			 password = cursor.getString(1);
    			Log.d(LOGCAT,"password....."+password);
    			 //Toast.makeText(context, altermobileNoEmailId, Toast.LENGTH_LONG).show();
    		 }while (cursor.moveToNext());
    	 }else{
    		 password = "NOTAVAILABLE";
    	 }
    	 database.close();
    	return password;
    }
    
    public String  getUserInfo(){
    	String name= null;
    	String pass = null;
    	String email = null;
    	String number = null;
String details=null;
		//slno TEXT,name TEXT,pass TEXT,emailId TEXT,cno TEXT
    	 SQLiteDatabase database = this.getReadableDatabase();
    	 String selectQuery = "SELECT  name,pass,emailId,cno from userdetails where SLNO='1'";
    	 Cursor cursor = database.rawQuery(selectQuery, null);
    	 if(cursor.moveToFirst()){
    		 do {
    			 name = cursor.getString(0);
    			 pass = cursor.getString(1);
    			 email = cursor.getString(2);
    			 number = cursor.getString(3);

    			 details = "VALID$"+name+"$"+pass+"$"+email+"$"+number;
    				
    			 Log.d(LOGCAT,"details....."+details);
    			 //Toast.makeText(context, altermobileNoEmailId, Toast.LENGTH_LONG).show();
    		 }while (cursor.moveToNext());
    	 }else{
    		 details = "INVALID";
    	 }
    	 database.close();
    	return details;
    }
	public String loginCheck(String uname,String pwd){
		String device2=null;
		SQLiteDatabase database = this.getReadableDatabase();
		String selectQuery = "SELECT  * from userdetails where name='"+uname+"' and pass='"+pwd+"' ";
		Cursor cursor = database.rawQuery(selectQuery, null);
		if(cursor.moveToFirst()){
			do {
				// device2 = cursor.getString(0);
				device2 = "AVAILABLE";

				Log.d(LOGCAT,"Test....."+device2);
				//Toast.makeText(context, altermobileNoEmailId, Toast.LENGTH_LONG).show();
			}while (cursor.moveToNext());
		}else{
			device2 = "NOTAVAILABLE";
		}
		database.close();
		return device2;
	}


	public int updatePassword(String name,String pass) {
        SQLiteDatabase database = this.getWritableDatabase();   
        ContentValues values = new ContentValues();
        
        values.put("name", name);
        values.put("pass", pass);

        
        return database.update("userdetails", values, "SLNO" + " = ?", new String[] {"1"});
    }
    
      
}
