package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void signin(View view) {
        EditText email = (EditText)findViewById(R.id.email);
        EditText pass = (EditText)findViewById(R.id.pass);

        String Email = email.getText().toString();
        String Password = pass.getText().toString();

        SharedPreferences sp = getSharedPreferences("Details",MODE_PRIVATE);

        String EMAIL = sp.getString("Email", "someone@something.com");
        String PASSWORD = sp.getString("Password", "########");

        if (EMAIL.equals(Email) && PASSWORD.equals(Password)) {
            Toast.makeText(this, "Signin Successful", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Signin Failed", Toast.LENGTH_SHORT).show();
        }

    }
}
