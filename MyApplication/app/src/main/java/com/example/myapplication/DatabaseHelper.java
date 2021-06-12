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
