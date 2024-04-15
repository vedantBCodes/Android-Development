package com.example.spinnerinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerObj;  //Creating an object
    ArrayList<String> Ids=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerObj=findViewById(R.id.spin);
        Ids.add("Aadhar card");
        Ids.add("Pan card");
        Ids.add("Driving licence");
        Ids.add("Voter ID card");

        ArrayAdapter adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Ids);

        spinnerObj.setAdapter(adapter);

    }
}