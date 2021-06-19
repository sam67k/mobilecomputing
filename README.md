# Mobile Computing Lab Task - 16

## Question

```
Create a web brower using webkit
The webbrowser should be capable to load different urls provided by user
The webview should have a go forward and go backward button aswell
```

<br/>

## Solution

### [MainActivity.java :](./MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java)

```
package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        webView = (WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        editText = (EditText)findViewById(R.id.urltf);
    }

    public void back(View view) {
        webView.goBack();
    }

    public void fwd(View view) {
        webView.goForward();
    }

    public void go(View view) {
        webView.loadUrl(editText.getText().toString());
    }
}
```

<br/>

## Screenshot

<br/>

<div align="center">
    <a href="screenshot.png">
        <img src="screenshot.png" alt="screenshot[0]" height="400px">
    </a>
</div>
