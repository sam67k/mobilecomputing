# Mobile Computing Lab Task - 2

## Question

```
Create a Login page containing Username, Password, Login Btn, CreateNewAcc Btn and ForgotPassword Btn.
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

    <TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Username"
    android:textSize="30dp" />

    <EditText
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />

    <TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Password"
    android:textSize="30dp" />

    <EditText
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />

    <Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Sign In"
    android:textSize="20dp" />

    <Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Sign Up"
    android:textSize="20dp" />

    <Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Forgot Password"
    android:textSize="20dp" />

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
