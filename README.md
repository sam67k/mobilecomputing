# Mobile Computing Lab Task - 7

## Question

```
Complete the PSL Application
```

<div align="center">
    <a href="Capture.png">
        <img src="Capture.png" alt="question" height="300px">
    </a>
</div>

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
    android:orientation="vertical"
    android:weightSum="10" >

    <ImageView
        android:layout_width="380px"
        android:layout_height="230px"
        android:background="@drawable/psl"
        android:layout_gravity="center"
        android:layout_marginTop="30dp" />

    <LinearLayout
        android:layout_marginTop="90dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="5"
        android:weightSum="2" >

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical" >

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Peshawar Zalmi"
                android:layout_gravity="center" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="133/2"
                android:layout_marginTop="20dp"
                android:textSize="30dp"
                android:textStyle="bold"
                android:layout_gravity="center"
                android:id="@+id/pscore" />

            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Update Score"
                android:layout_margin="10dp"
                android:onClick="updatePscore" />

            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Update Wicket"
                android:layout_margin="10dp"
                android:onClick="updatePwicket" />

            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Reset"
                android:layout_margin="10dp" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical" >

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Karachi Kings"
                android:layout_gravity="center" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="120/5"
                android:layout_marginTop="20dp"
                android:textSize="30dp"
                android:textStyle="bold"
                android:layout_gravity="center"
                android:id="@+id/kscore" />

            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Update Score"
                android:layout_margin="10dp"
                android:onClick="updateKscore" />

            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Update Wicket"
                android:layout_margin="10dp"
                android:onClick="updateKwicket" />

            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Reset"
                android:layout_margin="10dp" />
        </LinearLayout>

    </LinearLayout>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="New Match"
        android:layout_gravity="center" />

</LinearLayout>
```

<br/>

### [MainActivity.java :](./MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java)

```
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updatePscore(View view) {
        TextView tv = (TextView)findViewById(R.id.pscore);
        String ps = tv.getText().toString();

        String[] parts = ps.split("/");
        String pscore = parts[0];
        String pwickets = parts[1];

        int updateS = Integer.parseInt(pscore);
        int wickets = Integer.parseInt(pwickets);

        if (wickets >= 10) {
            Toast.makeText(this, "10 Wickets Fallen", Toast.LENGTH_SHORT).show();
        } else {
            updateS++;
        }

        pscore = ""+updateS;
        tv.setText(pscore+"/"+pwickets);
    }

    public void updatePwicket(View view) {
        TextView tv = (TextView)findViewById(R.id.pscore);
        String ps = tv.getText().toString();

        String[] parts = ps.split("/");
        String pscore = parts[0];
        String pwickets = parts[1];

        int wickets = Integer.parseInt(pwickets);

        if (wickets >= 10) {
            Toast.makeText(this, "10 Wickets Fallen", Toast.LENGTH_SHORT).show();
        } else {
            wickets++;
        }

        pwickets = ""+wickets;
        tv.setText(pscore+"/"+pwickets);
    }

    public void updateKscore(View view) {
        TextView tv = (TextView)findViewById(R.id.kscore);
        String ks = tv.getText().toString();

        String[] parts = ks.split("/");
        String kscore = parts[0];
        String kwickets = parts[1];

        int updateS = Integer.parseInt(kscore);
        int wickets = Integer.parseInt(kwickets);

        if (wickets >= 10) {
            Toast.makeText(this, "10 Wickets Fallen", Toast.LENGTH_SHORT).show();
        } else {
            updateS++;
        }

        kscore = ""+updateS;
        tv.setText(kscore+"/"+kwickets);
    }

    public void updateKwicket(View view) {
        TextView tv = (TextView)findViewById(R.id.kscore);
        String ps = tv.getText().toString();

        String[] parts = ps.split("/");
        String kscore = parts[0];
        String kwickets = parts[1];

        int wickets = Integer.parseInt(kwickets);

        if (wickets >= 10) {
            Toast.makeText(this, "10 Wickets Fallen", Toast.LENGTH_SHORT).show();
        } else {
            wickets++;
        }

        kwickets = ""+wickets;
        tv.setText(kscore+"/"+kwickets);
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

<br/>
<br/>

<div align="center">
    <a href="screenshot1.png">
        <img src="screenshot1.png" alt="screenshot[1]" height="400px">
    </a>
</div>

<br/>
<br/>

<div align="center">
    <a href="screenshot2.png">
        <img src="screenshot2.png" alt="screenshot[2]" height="400px">
    </a>
</div>
