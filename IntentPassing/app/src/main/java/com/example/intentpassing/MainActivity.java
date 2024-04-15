package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button obj;
    Intent intentObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obj=findViewById(R.id.Btn);

        obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentObj =new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intentObj);
            }
        });
    }
}