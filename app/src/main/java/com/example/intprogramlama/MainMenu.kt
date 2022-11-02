package com.example.intprogramlama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clicklistener()
    }

    fun clicklistener(){
        var cardRegister = findViewById<CardView>(R.id.cardRegister)
        var cardSearchAcc = findViewById<CardView>(R.id.cardSearch)
        var cardAskFuel = findViewById<CardView>(R.id.cardAskFuel)
        var cardCreateFee = findViewById<CardView>(R.id.cardCreateFee)
        var cardWriteCheck = findViewById<CardView>(R.id.cardWriteCheck)
        var cardPayFee = findViewById<CardView>(R.id.cardPayFee)

        cardRegister.setOnClickListener {openRegisterActivity()}
        cardSearchAcc.setOnClickListener {openSearchActivity()}
        cardAskFuel.setOnClickListener {openAskFeeActivity()}
        cardCreateFee.setOnClickListener {openCreateFeeActivity()}
        cardWriteCheck.setOnClickListener {openWriteCheckActivity()}
        cardPayFee.setOnClickListener {openPayFeeActivity()}


    }

    fun openRegisterActivity(){
        startActivity(Intent(this@MainMenu, RegisterActivity::class.java))
    }

    fun openSearchActivity(){
        startActivity(Intent(this@MainMenu, SearchActivity::class.java))
    }

    fun openAskFeeActivity(){
        startActivity(Intent(this@MainMenu, AskFeeActivity::class.java))
    }

    fun openCreateFeeActivity(){
        startActivity(Intent(this@MainMenu, CreateFeeActivity::class.java))
    }

    fun openWriteCheckActivity(){
        startActivity(Intent(this@MainMenu, AskFeeActivity::class.java))
    }

    fun openPayFeeActivity(){
        startActivity(Intent(this@MainMenu, PayActivity::class.java))
    }


}