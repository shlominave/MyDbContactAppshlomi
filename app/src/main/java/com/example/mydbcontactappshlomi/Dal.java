package com.example.mydbcontactappshlomi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


public class Dal extends SQLiteAssetHelper {

    public Dal(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public void Addcontact(String name, String email, String phone, String street, String city)
    {
        SQLiteDatabase db = getWritableDatabase();
        String sql_INSERT = "INSERT INTO contacts (name ,email ,phone ,street ,city) values(?,?,?,?,?)";
        SQLiteStatement statment = db.compileStatement(sql_INSERT);

        statment.bindString(1, name);
        statment.bindString(2, email);
        statment.bindString(3, phone);
        statment.bindString(4, street);
        statment.bindString(5, city);
        statment.execute();
    }
}
