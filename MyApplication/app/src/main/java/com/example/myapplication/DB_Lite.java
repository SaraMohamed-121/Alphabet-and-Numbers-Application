package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.Nullable;

public class DB_Lite extends SQLiteOpenHelper {

    private static String DataBaseName = "AppDataBase";
    SQLiteDatabase AppDataBase;

    //constructor
    public DB_Lite(Context context1) {
        super(context1,DataBaseName , null, 1);
    }

    // database creation
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users ( id text  primary key  ,name text not null, age text not null )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists users");
        onCreate(db);
    }
    // adding new record
    public void AddNewUser (String id , String name , String age ){
        ContentValues row = new ContentValues();
        row.put("id",id);
        row.put("name",name);
        row.put("age",age);
        AppDataBase= getWritableDatabase();
        AppDataBase.insert("users",null,row);
        AppDataBase.close();
    }
    public boolean loginCheck (String id , String name ){
        AppDataBase=getReadableDatabase();
        String [] RowDetails= {"id","name"};
        Cursor cursor =AppDataBase.rawQuery("select * from users where id =? and name =?",new String[] {id , name});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
    // checking whether the id already exists or not
    public boolean exist (String id){

        AppDataBase=getReadableDatabase();
        Cursor cursor =AppDataBase.rawQuery("select * from users where id =? ",new String[] {id});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
