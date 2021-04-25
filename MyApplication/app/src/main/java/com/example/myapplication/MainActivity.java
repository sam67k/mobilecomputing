package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.list1);

        String[] values = {"Samama", "Tenet", "Martian", "Interstellar", "Extraction", "Tesla", "The Fifth Estate", "Snowden", "Waar", "Superstar"};

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>
                (this,
                        android.R.layout.activity_list_item,
                        android.R.id.text1,
                        values);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = (String)lv.getItemAtPosition(i);
                Toast.makeText(MainActivity.this, i+" - "+value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}