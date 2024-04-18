package com.example.fetchingdatafromdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHelper dbHelper=new MyDbHelper(this);

        ArrayList<ContactModel> arrContacts =dbHelper.fetchContacts();

        for(int i=0;i<arrContacts.size();i++)
        {
            Log.v("CONTACT_INFO",
                    "Name : " + arrContacts.get(i).name +
                    " Phone Number : " + arrContacts.get(i).phone_number);
        }
    }
}