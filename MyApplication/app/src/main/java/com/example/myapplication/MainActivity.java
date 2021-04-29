package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Question 1.(a) Answer
        String[] details = {"Peshawar", "Hayatabad", "Charsadda", "Umerzai"};

        SharedPreferences sp = getSharedPreferences("Samama-BSSE-A",MODE_PRIVATE);

        SharedPreferences.Editor editor = sp.edit();

        editor.putString("City1",details[0]);
        editor.putString("Spot1",details[1]);

        editor.putString("City2",details[2]);
        editor.putString("Spot2",details[3]);

        editor.commit();
        // END

        // Question 1.(b) Answer Java Code Part
        ListView lv = (ListView)findViewById(R.id.listview);
        CustomAdapter ca = new CustomAdapter();
        lv.setAdapter(ca);
        // END

        // Question 1.(c) Answer
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv = (TextView)view.findViewById(R.id.spot);
                String spot = tv.getText().toString();

                Uri intentpath = Uri.parse("geo:0,0?q="+spot);
                Intent intent = new Intent(Intent.ACTION_VIEW, intentpath);
                intent.setPackage("com.google.android.apps.maps");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        // END

        // Question 1.(d) Answer
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                ca.remove(i);
                return false;
            }
        });
        // END
    }

    // Question 1.(b) Answer Java Code Part - Extended
    class CustomAdapter extends BaseAdapter {

        SharedPreferences sp = getSharedPreferences("Samama-BSSE-A",MODE_PRIVATE);

        String city1 = sp.getString("City1", "city1");
        String spot1 = sp.getString("Spot1", "spot1");

        String city2 = sp.getString("City2", "city1");
        String spot2 = sp.getString("Spot2", "spot1");

        ArrayList<String> cities = new ArrayList<String>();
        ArrayList<String> spots = new ArrayList<String>();

        {
            cities.add(city1);
            cities.add(city2);

            spots.add(spot1);
            spots.add(spot2);
        }

        @Override
        public int getCount() {
            return cities.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.listlayout, null);
            TextView tv1 = (TextView)convertView.findViewById(R.id.city);
            TextView tv2 = (TextView)convertView.findViewById(R.id.spot);

            tv1.setText(cities.get(position));
            tv2.setText(spots.get(position));

            return convertView;
        }

        // Question 1.(d) Answer - Extended -Excluded from Question 1.(b) Answer
        public void remove(int i) {
            cities.remove(i);
            spots.remove(i);
            notifyDataSetChanged();
        }
        // END
    }
    // END
}
