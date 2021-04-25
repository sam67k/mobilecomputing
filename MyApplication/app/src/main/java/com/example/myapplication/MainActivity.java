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
