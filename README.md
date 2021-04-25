# Mobile Computing Lab Task - 3

## Question

```
Create a layout using linear layout.
The layout should contain Email, Subject and Message (EditText) and a Send Button.
```

## Solution

### [activity_main.xml :](./MyApplication/app/src/main/res/layout/activity_main.xml)

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical" >

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Email"
        android:layout_weight="1" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Subject"
        android:layout_weight="1" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Message"
        android:gravity="top"
        android:layout_weight="20" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="SEND"
        android:layout_weight="1" />

</LinearLayout>
```

<br/>

## Screenshot

<br/>

<div align="center">
    <a href="screenshot.png">
        <img src="screenshot.png" alt="screenshot[0]" height="400px">
    </a>
</div>
