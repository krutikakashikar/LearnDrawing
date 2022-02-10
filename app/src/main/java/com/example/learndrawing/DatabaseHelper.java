package com.example.learndrawing;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "KrutiDb";
    public static final String TABLE_NAME = "Feedback";
    public static final String COL_1 = "FirstName";
    public static final String COL_2 = "MiddleName";
    public static final String COL_3 = "LastName";
    public static final String COL_4 = "EmailId";
    public static final String COL_5 = "PhoneNo";
    public static final String COL_6 = "Message";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table Feedback(ID integer Primary Key AutoIncrement,FirstName Text,MiddleName Text, LastName Text,EmailId Text,PhoneNo Text,Message Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public long addUser(String FirstName, String MiddleName, String LastName, String EmailId, String PhoneNo, String Message) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("FirstName", FirstName);
        contentValues.put("MiddleName", MiddleName);
        contentValues.put("LastName", LastName);
        contentValues.put("EmailId", EmailId);
        contentValues.put("PhoneNo", PhoneNo);
        contentValues.put("Message", Message);

        long res = db.insert("Feedback", null, contentValues);
        db.close();
        return res;
    }
}




