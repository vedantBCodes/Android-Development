package com.example.a04displyingforminfousingintentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    String Username;
    String Password;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn=findViewById(R.id.btn);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

        Username = username.getText().toString();
        Password = password.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(MainActivity.this,ShowActivity.class);
                intent.putExtra("name",Username);
                intent.putExtra("pass",Password);
                startActivity(intent);
                finish();

            }
        });


    }
}