package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class messageIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_intent);
    }

    public void sendtext(View view) {

        EditText To, Message;

        To = (EditText)findViewById(R.id.et1);
        Message = (EditText)findViewById(R.id.et2);

        String to=To.getText().toString();
        String message=Message.getText().toString();

        Uri uri = Uri.parse("smsto:"+to);

        Intent text = new Intent(Intent.ACTION_SENDTO, uri);
        text.putExtra("sms_body", message);

        startActivity(text);

    }
}
