package com.example.a01_displayingforminformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText usernameObj=findViewById(R.id.username);
        EditText passwordObj=findViewById(R.id.password);

        RadioButton radioBtn1=findViewById(R.id.male);
        RadioButton radioBtn2=findViewById(R.id.female);
        RadioButton radioBtn3=findViewById(R.id.other);

        CheckBox checkBox1=findViewById(R.id.bca);
        CheckBox checkBox2=findViewById(R.id.mba);
        CheckBox checkBox3=findViewById(R.id.mca);

        Button register=findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=usernameObj.getText().toString();
                String password=passwordObj.getText().toString();
                String male=radioBtn1.getText().toString();
                String female=radioBtn2.getText().toString();
                String other=radioBtn3.getText().toString();

                String bca=checkBox1.getText().toString();
                String mba=checkBox2.getText().toString();
                String mca=checkBox3.getText().toString();

                Toast.makeText(MainActivity.this, "Username : "+ username, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Password : "+ password, Toast.LENGTH_SHORT).show();


                if(checkBox1.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Course : "+ bca, Toast.LENGTH_SHORT).show();

                }
                else if(checkBox2.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Course : "+ mba, Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Course : "+ mca, Toast.LENGTH_SHORT).show();
                }


                if(radioBtn1.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Gender : "+ male, Toast.LENGTH_SHORT).show();

                }
                else if(radioBtn2.isChecked()==true)
                {
                    Toast.makeText(MainActivity.this, "Gender : "+ female, Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Gender : "+ other, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}