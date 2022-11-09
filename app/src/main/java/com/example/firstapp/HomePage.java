package com.example.firstapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        TextView UserName = findViewById(R.id.Name);
        TextView UserPassword = findViewById(R.id.password);
        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        UserName.setText(Name);
        String Password = intent.getStringExtra("Password");
        UserPassword.setText(Password);
        Button listData=findViewById(R.id.ListShow);
        listData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this, RecyclerList.class);
                startActivity(i);
            }
        });
    }
}