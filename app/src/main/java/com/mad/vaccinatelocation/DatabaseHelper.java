package com.mad.vaccinatelocation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="vaccinate.db";
    public static final String TABLE_NAME="Vaccinate Details";
    public static final String col_1="ID";
    public static final String col_2="Name";
    public static final String col_3="Age";
    public static final String col_4="NIC";
    public static final String col_5="Gender";
    public static final String col_6="Date_of_Birth";
    public static final String col_7="Telephone_No";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TABLE_NAME + " (" +
                col_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                col_2 + " TEXT NOT NULL, " +
                col_3 + " TEXT NOT NULL, " +
                col_4 + " TEXT NOT NULL, " +
                col_5 + " INTEGER NOT NULL, " +
                col_6 + " INTEGER NOT NULL, " +
                col_7 + " INTEGER NOT NULL);"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);


    }
}
