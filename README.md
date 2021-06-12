# Mobile Computing Lab Task - 13

## Question

```
Create a notification with an icon, ContentTitle and ContentText.
Content title should be your name and content text should be your email address
```

<br/>

## Solution

### [MainActivity.java :](./MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java)

```
package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)

    public void notify(View view) {

        NotificationManager mNotificationManager = (NotificationManager)getSystemService(this.NOTIFICATION_SERVICE);

        NotificationChannel channel = new NotificationChannel("2", "Notification", NotificationManager.IMPORTANCE_HIGH);
        NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(channel);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "2");

        mBuilder.setSmallIcon(R.drawable.notification);
        mBuilder.setContentTitle("Samama");
        mBuilder.setContentText("k67sam@gmail.com");

        mNotificationManager.notify(2, mBuilder.build());

    }
}
```

<br/>

## Screenshot

<br/>

<div align="center">
    <a href="screenshot.gif">
        <img src="screenshot.gif" alt="screenshot[0]" height="400px">
    </a>
</div>
