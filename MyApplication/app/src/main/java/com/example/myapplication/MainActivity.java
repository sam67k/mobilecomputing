package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        EditText name = (EditText)findViewById(R.id.name);
        EditText email = (EditText)findViewById(R.id.email);
        EditText pass = (EditText)findViewById(R.id.pass);

        String Value = name.getText().toString();
        String Value2 = email.getText().toString();
        String Value3 = pass.getText().toString();

        SharedPreferences sp = getSharedPreferences("Details",MODE_PRIVATE);

        SharedPreferences.Editor editor = sp.edit();

        editor.putString("Name",Value);
        editor.putString("Email",Value2);
        editor.putString("Password",Value3);

        boolean check=false;
        check = editor.commit();

        if(check) {
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show();
        }
    }

    public void tosignin(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}