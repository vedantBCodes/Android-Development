package com.example.optionmenu2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Toolbar toolbar = findViewById(R.id.toolBar);  //written code
        setSupportActionBar(toolbar);    //written code
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater((this));  //written code
        inflater.inflate(R.menu.option_menu, menu);  //written code

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId(); //written code


        if (itemId == R.id.profile) {

            Toast.makeText(this, "profile clicked", Toast.LENGTH_SHORT).show();
        }
        if (itemId == R.id.setting) {

            Toast.makeText(this, "setting option clicked", Toast.LENGTH_SHORT).show();
        }
        if (itemId == R.id.more) {

            Toast.makeText(this, "more option clicked", Toast.LENGTH_SHORT).show();
        }
        if (itemId == R.id.exit) {

            Toast.makeText(this, "exit option clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
