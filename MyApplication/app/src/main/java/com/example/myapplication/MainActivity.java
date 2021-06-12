package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        EditText number = (EditText)findViewById(R.id.phone);
        EditText address = (EditText)findViewById(R.id.address);

        String Name = name.getText().toString();
        String Email = email.getText().toString();
        String Pass = pass.getText().toString();
        int Number = Integer.parseInt(number.getText().toString());
        String Address = address.getText().toString();

        DatabaseHelper db = new DatabaseHelper(this);

        boolean insertion = db.insertData(Name, Email, Pass, Number, Address);

        if(insertion) {
            Toast.makeText(this, "Signup Sucessful", Toast.LENGTH_SHORT).show();
            name.setText("");
            email.setText("");
            pass.setText("");
            number.setText("");
            address.setText("");
        }
        else
            Toast.makeText(this, "Signup UnSucessful", Toast.LENGTH_SHORT).show();

    }

    public void tosignin(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}
