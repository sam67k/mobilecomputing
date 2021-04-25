package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void msgintnt(View view) {
        Intent intent = new Intent(this, messageIntent.class);
        startActivity(intent);

    }

    public void mailintnt(View view) {
        Intent intent = new Intent(this, mailIntent.class);
        startActivity(intent);
    }
}
