package com.example.servicesinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=findViewById(R.id.btn1);

        Button button2=findViewById(R.id.btn2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(MainActivity.this,MusicService.class));

//                Intent object can also be created and passed in the startService()
//                Intent obj=new Intent(MainActivity.this, MusicService.class);
//                startService(obj);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this,MusicService.class));


//                  Intent object can also be created and passed in the stopService()
//                  Intent obj=new Intent(MainActivity.this, MusicService.class);
//                  stopService(obj);
            }
        });
    }
}