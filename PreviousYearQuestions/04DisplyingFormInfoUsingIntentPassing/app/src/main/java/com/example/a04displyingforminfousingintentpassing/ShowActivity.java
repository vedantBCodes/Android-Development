package com.example.a04displyingforminfousingintentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity {



//    INCOMPLETE CODE

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        String username=getIntent().getExtras().getString("name");
        String password=getIntent().getExtras().getString("pass");

        TextView name=findViewById(R.id.user);
        TextView pass=findViewById(R.id.pass);

        name.setText(username);
        pass.setText(password);


    }
}