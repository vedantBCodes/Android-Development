package com.example.databsehandling;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class dbHelper extends SQLiteOpenHelper {


    public static final String DATABASE_NAME="Vedant_DB";
    public static final String Table_NAME="stud";
    public static final int DATABASE_VERSION = 1;
    public static final String KEY_ID="Sroll"; //student roll number
    public static final String KEY_NAME="Sname";  //student name

    public dbHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createTable="CREATE TABLE Stud(Sroll INTEGER PRIMARY KEY,Sname TEXT)";

        db.execSQL(createTable);

        Log.v("QUERY...", createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public void SaveData(stud stud)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values=new ContentValues();

        values.put(KEY_ID,stud.getSroll());
        values.put(KEY_NAME,stud.getSname());

        db.insert(Table_NAME,null,values);

        db.close();
    }

    public List<stud> showData(){

        List<stud> studList=new ArrayList<>();

        String selectQuery ="SELECT * FROM " + Table_NAME;

        SQLiteDatabase db=this.getWritableDatabase();

        Cursor cursor =db.rawQuery(selectQuery,null);

        if(cursor.moveToFirst()){
            do{
                stud studObj =new stud();

                studObj.setSroll(Integer.parseInt(cursor.getString(0)));
                studObj.setSname(cursor.getString(0));
                studList.add(studObj);
//                System.out.println(Integer.parseInt(cursor.getString(0)) + " " + cursor.getString(0));
            }
            while (cursor.moveToNext());
        }
    return studList;
}
}
