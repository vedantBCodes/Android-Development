package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();

//        TextView textView=findViewById(R.id.textView);


//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//
//                startActivity(intent);
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("logName","onStart activity started");
        Toast.makeText(this, "onStart activity started", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("logName","onResume activity started");
        Toast.makeText(this, "onResume activity started", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("logName","onPause activity started");
        Toast.makeText(this, "onPause activity started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("logName","onRestart activity started");
        Toast.makeText(this, "onRestart activity started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("logName","onStop activity started");
        Toast.makeText(this, "onStop activity started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("logName","onDestroy activity started");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }


}