package com.example.androidactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       Toast toast = Toast.makeText(this, "SecondOnCreate", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,2,3);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(this, "SecondOnStart", Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(this, "SecondOnStop", Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(this, "SecondOnRestart", Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(this, "SecondOnDestroy", Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}