package com.example.fetchingdatafromdatabase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

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

    public ArrayList<ContactModel> fetchContacts()
    {
        SQLiteDatabase db=this.getReadableDatabase();

        Cursor  cursor=db.rawQuery("SELECT * FROM " + TABLE_NAME ,null);

        ArrayList<ContactModel> arrContacts =new ArrayList<>();

        while (cursor.moveToNext()==true)
        {
            ContactModel model = new ContactModel();
            model.id=cursor.getInt(0);
            model.name=cursor.getString(1);
            model.phone_number=cursor.getString(2);

            arrContacts.add(model);

        }
        return arrContacts;
    }
}
