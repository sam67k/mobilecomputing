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
