package com.example.databsehandling;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

                   //INCOMPLETE PROGRAM
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showButton=findViewById(R.id.showBtn);
        Button saveButton=findViewById(R.id.saveBtn);

        EditText edt1=findViewById(R.id.edit1);
        EditText edt2=findViewById(R.id.edit2);

        final dbHelper db = new dbHelper(this);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sroll=Integer.parseInt((edt2.getText().toString()));
                String sname=(edt1.getText().toString());

                db.SaveData(new stud(sroll,sname));

                Toast t=Toast.makeText(MainActivity.this, "saved", Toast.LENGTH_SHORT);
                t.show();
            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("reading","reading all content");
                List<stud> studs =db.showData();

                for(stud cn:studs)
                {
                    String log1 = " Name : " + cn.getSname() + "Id : " + cn.getSroll()  ;
//                    String log2 = ;
                    Log.v("Name :",log1);
//                    Log.v("Name :",log2 );

//                    String log1="id:"+getComponentName().getShortClassName() +"name"+getComponentName().getShortClassName();
                    Toast t=Toast.makeText(MainActivity.this, "Stud record "+ log1 , Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

    }
}