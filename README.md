# Mobile Computing Lab Task - 12

## Question

```
Database Name should be your name
Table Name should be User
Table should consist of 5 Attributes (Name,Email,Password,PhoneNumber,Address)

Activity Structure:
On starting Starting application show signup Page
The Application should have a login page as well
Login to the application using the saved credentials in database
```

<br/>

## Solution

### [MainActivity.java :](./MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java)

```
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        EditText name = (EditText)findViewById(R.id.name);
        EditText email = (EditText)findViewById(R.id.email);
        EditText pass = (EditText)findViewById(R.id.pass);
        EditText number = (EditText)findViewById(R.id.phone);
        EditText address = (EditText)findViewById(R.id.address);

        String Name = name.getText().toString();
        String Email = email.getText().toString();
        String Pass = pass.getText().toString();
        int Number = Integer.parseInt(number.getText().toString());
        String Address = address.getText().toString();

        DatabaseHelper db = new DatabaseHelper(this);

        boolean insertion = db.insertData(Name, Email, Pass, Number, Address);

        if(insertion) {
            Toast.makeText(this, "Signup Sucessful", Toast.LENGTH_SHORT).show();
            name.setText("");
            email.setText("");
            pass.setText("");
            number.setText("");
            address.setText("");
        }
        else
            Toast.makeText(this, "Signup UnSucessful", Toast.LENGTH_SHORT).show();

    }

    public void tosignin(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}
```

<br/>

### [MainActivity2.java :](./MyApplication/app/src/main/java/com/example/myapplication/MainActivity2.java)

```
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void signin(View view) {
        EditText email = (EditText)findViewById(R.id.email);
        EditText pass = (EditText)findViewById(R.id.pass);

        String Email = email.getText().toString();
        String Password = pass.getText().toString();

        DatabaseHelper db = new DatabaseHelper(this);

        if (!(db.authenticate(Email, Password))) {
            Toast.makeText(this, "Signin Failed", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Signin Successful", Toast.LENGTH_SHORT).show();
            email.setText("");
            pass.setText("");
        }

        db.close();
    }
}
```

<br/>

### [DatabaseHelper.java :](./MyApplication/app/src/main/java/com/example/myapplication/DatabaseHelper.java)

```
package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "Samama.db";
    public static final int DB_VERSION = 1;
    public static final String TABLE_NAME = "user";
    SQLiteDatabase db;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table "+TABLE_NAME+"" +
                "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "EMAIL TEXT," +
                "PASSWORD TEXT," +
                "CELLNUMBER INTEGER," +
                "ADDRESS TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name, String email, String password, int number, String address) {
        ContentValues cv = new ContentValues();
        cv.put("NAME",name);
        cv.put("EMAIL",email);
        cv.put("PASSWORD",password);
        cv.put("CELLNUMBER",number);
        cv.put("ADDRESS",address);
        long result = db.insert(TABLE_NAME,null,cv);
        if(result == -1) {
            return false;
        }
        else
            return true;
    }

    public boolean authenticate(String email, String pass) {
        String[] columns = {"EMAIL", "PASSWORD"};
        String selection = "EMAIL=? and PASSWORD=?";
        String[] selectionArgs = {email, pass};

        Cursor cursor = db.query(TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);

        int count = cursor.getCount();

        if(count > 0){
            return true;
        } else {
            return false;
        }
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

<br/>

<div align="center">
    <a href="screenshot1.png">
        <img src="screenshot1.png" alt="screenshot[1]" height="400px">
    </a>
</div>
