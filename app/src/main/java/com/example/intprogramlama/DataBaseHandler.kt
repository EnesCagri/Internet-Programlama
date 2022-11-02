package com.example.intprogramlama

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val DATABASE_NAME = "MyDatabase"
val TABLE_NAME = "Users"
val COL_ID = "id"
val COL_NAME = "name"
val COL_APNAME = "apName"
val COL_DANO = "daNo"
val COL_PHONE = "phone"
val COL_EMAIL = "email"


class DataBaseHandler(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {

        val createTable = ("CREATE TABLE " + TABLE_NAME + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COL_NAME + " VARCHAR(256)," +
                COL_APNAME + " VARCHAR(256)," +
                COL_DANO + " INTEGER," +
                COL_PHONE + " INTEGER," +
                COL_EMAIL + " VARCHAR(256))");

        db?.execSQL(createTable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun insertData(user:User){
        val db = this.writableDatabase
        var cv = ContentValues()

        cv.put(COL_NAME, user.name)
        cv.put(COL_APNAME, user.apName)
        cv.put(COL_DANO, user.daNo)
        cv.put(COL_PHONE, user.phone)
        cv.put(COL_EMAIL, user.email)

        var result = db.insert(TABLE_NAME, null, cv)

        if(result == -1.toLong()){
            Toast.makeText(context, " HATALI EKLEME", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context, " BAŞARILI EKLEME", Toast.LENGTH_LONG).show()
        }

    }
}