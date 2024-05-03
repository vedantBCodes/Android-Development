package com.example.a02listingdaysofweeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {       //predefined lines
        super.onCreate(savedInstanceState);                    //predefined lines
        setContentView(R.layout.activity_main);                //predefined lines

        ListView list = findViewById(R.id.days); //Creating object

        ArrayList<String> days=new ArrayList<>(); //Defining ArrayList

        days.add("Sundays");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        //Defining array adapter

        ArrayAdapter<String> adapter =new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,days);

        //Setting array adapter

        list.setAdapter(adapter);

        //adding onItemClickListener

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "clicked " +days.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}