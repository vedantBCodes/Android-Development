package com.example.insertingdataindatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyDbHelper dbHelper=new MyDbHelper(this);

        dbHelper.addContacts("Vedant","234164778");
        dbHelper.addContacts("Omkar","65546767");
        dbHelper.addContacts("Chetan","75735577");
        dbHelper.addContacts("Aditya","16576476");
    }
}