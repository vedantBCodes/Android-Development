package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit=findViewById(R.id.edit);

        RadioButton male=findViewById(R.id.male);
        RadioButton female=findViewById(R.id.female);
        RadioButton other=findViewById(R.id.other);

        CheckBox cricket=findViewById(R.id.cricket);
        CheckBox football=findViewById(R.id.football);
        CheckBox tableTenis=findViewById(R.id.tableTenis);

        Button btn=findViewById(R.id.submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username=edit.getText().toString();
                Toast.makeText(MainActivity.this, "Username : " + username, Toast.LENGTH_SHORT).show();

                if(male.isChecked()==true)
                {
                    String gender1=male.getText().toString();
                    Toast.makeText(MainActivity.this, "Gender : "+ gender1 , Toast.LENGTH_SHORT).show();
                }
                else if(female.isChecked()==true)
                {
                    String gender2=female.getText().toString();
                    Toast.makeText(MainActivity.this, "Gender : "+ gender2, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String gender3=other.getText().toString();
                    Toast.makeText(MainActivity.this, "Gender : "+ gender3, Toast.LENGTH_SHORT).show();
                }

                String hobby1=cricket.getText().toString();
                String hobby2=football.getText().toString();
                String hobby3=tableTenis.getText().toString();

                if(cricket.isChecked()==true && football.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Hobbies : "+ hobby1 + "and" + hobby2 , Toast.LENGTH_SHORT).show();
                }
                else if(football.isChecked()==true && tableTenis.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Hobbies : "+ hobby2 + "and" + hobby3 , Toast.LENGTH_SHORT).show();
                }
                else if(cricket.isChecked()==true && tableTenis.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Hobbies : "+ hobby1 + "and" + hobby3 , Toast.LENGTH_SHORT).show();
                }
                else if(cricket.isChecked()==true && football.isChecked()==true &&tableTenis.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Hobbies : "+ hobby1 + "," + hobby2 + "and" + hobby3, Toast.LENGTH_SHORT).show();
                }
                else if(cricket.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Hobby : "+ hobby1, Toast.LENGTH_SHORT).show();
                }
                else if(football.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Hobby : "+ hobby2, Toast.LENGTH_SHORT).show();
                }
                else if(tableTenis.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Hobby : "+ hobby3, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}