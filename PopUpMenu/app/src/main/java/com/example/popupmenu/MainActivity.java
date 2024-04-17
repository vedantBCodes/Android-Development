package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btnPopup);  //Written code
        btn.setOnClickListener(new View.OnClickListener() {  //Written code
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu=new PopupMenu(MainActivity.this,btn);  //Written code
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());  //Written code

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int itemId=item.getItemId();

                        if(itemId==R.id.item1)
                        {
                            Toast.makeText(MainActivity.this, "Item1 clicked", Toast.LENGTH_SHORT).show();
                        }
                        if(itemId==R.id.item2)
                        {
                            Toast.makeText(MainActivity.this, "Item2 clicked", Toast.LENGTH_SHORT).show();
                        }
                        if(itemId==R.id.item3)
                        {
                            Toast.makeText(MainActivity.this, "Item3 clicked", Toast.LENGTH_SHORT).show();
                        }
                        if(itemId==R.id.item4)
                        {
                            Toast.makeText(MainActivity.this, "Item4 clicked", Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }
}