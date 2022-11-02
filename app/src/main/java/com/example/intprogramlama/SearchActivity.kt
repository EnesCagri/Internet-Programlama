package com.example.intprogramlama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SearchActivity : AppCompatActivity() {
    lateinit var araBtn:Button
    lateinit var kullaniciListe:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

    }
}