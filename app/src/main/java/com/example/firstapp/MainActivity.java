package com.example.firstapp;

import static android.text.TextUtils.isEmpty;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Name = findViewById(R.id.Name);
        EditText password = findViewById(R.id.Password);
        Button Login = findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = Name.getText().toString();
                String UserPassword = password.getText().toString();
                if (isEmpty(UserName)) {
                   Toast.makeText(MainActivity.this,"Enter Value in Name",Toast.LENGTH_SHORT).show();
                }else if(UserName.length()<=5){
                    Toast.makeText(MainActivity.this,"Name Must Contain 6 Character",Toast.LENGTH_SHORT).show();
                }
                else if(isEmpty(UserPassword)){
                    Toast.makeText(MainActivity.this,"Enter Value in Password",Toast.LENGTH_SHORT).show();
                }else if(UserPassword.length()<=5){
                    Toast.makeText(MainActivity.this,"Password Must Contain 6 Character",Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = new Intent(MainActivity.this, HomePage.class);
                    i.putExtra("Name", UserName);
                    i.putExtra("Password",UserPassword);
                    startActivity(i);
                }
            }
        });
    }
}