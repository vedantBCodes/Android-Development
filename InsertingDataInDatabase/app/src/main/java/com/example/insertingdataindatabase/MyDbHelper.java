package com.example.insertingdataindatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDbHelper extends SQLiteOpenHelper {


    private static final  String DATABASE_NAME="Contact_db";
    private static final  int DATABASE_VERSION = 1;
    private static final  String TABLE_NAME="Contacts";
    private static final  String ID= "id";
    private static final  String  NAME = "name";
    private static final  String PHONE_NO = "phone_no";

    public MyDbHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {  //Here db is an database object

        db.execSQL("CREATE TABLE " + TABLE_NAME  + "(" + ID + "INTEGER PRIMARY KEY AUTOINCREMENT," + NAME + "TEXT," + PHONE_NO + "TEXT" + ")" );

        //CREATE TABLE contact ( id INTEGER PRIMARY AUTOINCREMENT , name TEXT , Phone_number TEXT );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);

        onCreate(db);

    }

    public void addContacts(String name,String phone_no){

        SQLiteDatabase db =this.getWritableDatabase();

        ContentValues values=new ContentValues();

        values.put(NAME,name);
        values.put(PHONE_NO,phone_no);

        db.insert(TABLE_NAME,null,values);
    }
}
