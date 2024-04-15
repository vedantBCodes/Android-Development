package com.example.listviewinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list ; //Creating object
    ArrayList<String> subjects=new ArrayList<>(); //Defining ArrayList

    @Override
    protected void onCreate(Bundle savedInstanceState) {       //predefined lines
        super.onCreate(savedInstanceState);                    //predefined lines
        setContentView(R.layout.activity_main);                //predefined lines

        subjects.add("Android");
        subjects.add("Digial Marketing");
        subjects.add("Cloud computing");
        subjects.add("python");

        list = findViewById(R.id.subjectId);

        //Defining array adapter

        ArrayAdapter<String> adapter =new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,subjects);

        //Setting array adapter

        list.setAdapter(adapter);

        //adding onItemClickListener

         list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(MainActivity.this, "clicked " +subjects.get(position), Toast.LENGTH_SHORT).show();
             }
         });
    }
}