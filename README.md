# Mobile Computing Lab Task - 9

## Question

```
1. Create a Dynamic Listview
2. The first item should be your name.
2. Remaining 9 items should be Movies name's.
3. On clicking the item it displays its position number in the list and name.
```

## Solution

### [activity_main.xml :](./MyApplication/app/src/main/res/layout/activity_main.xml)

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <ListView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/list1"/>

</LinearLayout>
```

<br/>

### [MainActivity.java :](./MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java)

```
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
```

<br/>

## Screenshots

<br/>

<div align="center">
    <a href="screenshot.png">
        <img src="screenshot.png" alt="screenshot[0]" height="400px">
    </a>
</div>
