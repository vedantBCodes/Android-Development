package com.example.edittexttolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list1=findViewById(R.id.listId);

        ArrayList<String> names=new ArrayList<>();

        names.add("Vedant");
        names.add("Omkar");
        names.add("Pratik");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,names);

        list1.setAdapter(adapter);

        EditText editText=findViewById(R.id.edit);

        Button btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=editText.getText().toString();
                names.add(name);

                ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,names);

                list1.setAdapter(adapter);
            }
        });

    }
}