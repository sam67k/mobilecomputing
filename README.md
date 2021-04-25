# Mobile Computing Lab Task - 4

## Question

```
Design the attached Activity layout using Relative Layout.
```

<br/>

<div align="center">
    <img src="Capture.png" alt="question" height="300px">
</div>

<br/>

## Solution

### [activity_main.xml :](./MyApplication/app/src/main/res/layout/activity_main.xml)

```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <TextView
        android:id="@+id/Email"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Email:"
        android:textSize="30dp"
        />

    <EditText
        android:id="@+id/text1"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:layout_toRightOf="@id/Email"
        />

    <TextView
        android:id="@+id/text2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Pass:"
        android:textSize="30dp"
        android:layout_below="@+id/Email"
        android:layout_marginTop="20dp"
        />

    <EditText
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:layout_below="@id/text1"
        android:layout_toRightOf="@+id/text2"
        android:layout_marginTop="20dp"
        />

    <Button
        android:id="@+id/btn1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Signin"
        android:layout_below="@+id/text2"
        android:layout_marginTop="10dp"
        />

    <Button
        android:id="@+id/btn2"
        android:layout_width="180dp"
        android:layout_height="wrap_content"
        android:text="Signup"
        android:layout_below="@+id/btn1"
        android:gravity="center"
        />

    <Button
        android:id="@+id/btn3"
        android:layout_width="180dp"
        android:layout_height="wrap_content"
        android:text="Forgot Pass"
        android:layout_toRightOf="@+id/btn2"
        android:layout_below="@+id/btn1"
        android:gravity="center"
        />

</RelativeLayout>

```

<br/>

## Screenshot

<br/>

<div align="center">
    <a href="screenshot.png">
        <img src="screenshot.png" alt="screenshot[0]" height="400px">
    </a>
</div>
