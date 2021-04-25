package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class mailIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_intent);
    }

    public void sendmail(View view) {

        EditText To, Subject, Body;

        To = (EditText)findViewById(R.id.et1);
        Subject = (EditText)findViewById(R.id.et2);
        Body = (EditText)findViewById(R.id.et3);

        String to=To.getText().toString();
        String subject=Subject.getText().toString();
        String body=Body.getText().toString();

        String mailto = "mailto:"+ to +
                "?cc=" + "" +
                "&subject=" + Uri.encode(subject) +
                "&body=" + Uri.encode(body);

        Intent email = new Intent(Intent.ACTION_SENDTO);
        email.setData(Uri.parse(mailto));

        startActivity(Intent.createChooser(email, "Complete action using"));

    }
}
