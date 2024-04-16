package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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

        Toolbar toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=new MenuInflater(this);
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();

        if(itemId==R.id.profile)
        {
            Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId==R.id.setting)
        {
            Toast.makeText(this, "Setting option clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId==R.id.more)
        {
            Toast.makeText(this, "More item option clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId==R.id.exit)
        {
            Toast.makeText(this, "Exit option clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}