package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnObj;
        btnObj=findViewById(R.id.btn);
        registerForContextMenu(btnObj);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

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
        return super.onContextItemSelected(item);
    }


}