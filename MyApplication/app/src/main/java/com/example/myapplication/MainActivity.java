package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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

    public void BtnMethod(View view) {

        EditText text1 = (EditText)findViewById(R.id.num1);
        EditText text2 = (EditText)findViewById(R.id.num2);

        int num1 = Integer.parseInt(text1.getText().toString());
        int num2 = Integer.parseInt(text2.getText().toString());

        String result = Integer.toString(num1+num2);

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();

    }
}