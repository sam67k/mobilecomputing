# Mobile Computing Lab Task - 8

## Question

```
Create a UI as shown in classroom having 6 Radio Buttons and 1 Checkbox as per instructions given
```

<div align="center">
    <a href="Capture.png">
        <img src="Capture.png" alt="question" height="300px">
    </a>
</div>

<br/>

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

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:textSize="40dp"
        android:text="ABC Shop"/>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20dp"
        android:text="Size"/>

    <RadioGroup
        android:id="@+id/sg"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <RadioButton
            android:id="@+id/rbs"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Small"/>

        <RadioButton
            android:id="@+id/rbl"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Large"/>

        <RadioButton
            android:id="@+id/rbxl"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="XLarge"/>

    </RadioGroup>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20dp"
        android:text="Color"/>

    <RadioGroup
        android:id="@+id/cg"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <RadioButton
            android:id="@+id/rbr"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Red"/>

        <RadioButton
            android:id="@+id/rbb"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Blue"/>

        <RadioButton
            android:id="@+id/rbg"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Green"/>

    </RadioGroup>

    <CheckBox
        android:id="@+id/check"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="I Agree"/>

    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Submit"
        android:onClick="btnClicked"/>

</LinearLayout>
```

<br/>

### [MainActivity.java :](./MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java)

```
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup sg;
    RadioGroup cg;

    RadioButton srb;
    RadioButton crb;

    CheckBox cbx;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sg = (RadioGroup)findViewById(R.id.sg);
        cg = (RadioGroup)findViewById(R.id.cg);

        cbx = (CheckBox)findViewById(R.id.check);

    }

    public void btnClicked(View view) {

        int sgrbtn = sg.getCheckedRadioButtonId();
        int cgrbtn = cg.getCheckedRadioButtonId();

        srb = (RadioButton)findViewById(sgrbtn);
        crb = (RadioButton)findViewById(cgrbtn);

        if (cbx.isChecked() && sgrbtn != -1 && cgrbtn != -1) {
            Toast.makeText(this, ""+srb.getText()+" "+crb.getText(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Something Missing", Toast.LENGTH_LONG).show();
        }
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
