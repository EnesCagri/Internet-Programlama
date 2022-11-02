package com.example.intprogramlama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    lateinit var kayitBtn:Button
    lateinit var adSoyad:EditText
    lateinit var apAd:EditText
    lateinit var daireNo:EditText
    lateinit var tel:EditText
    lateinit var email:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val context = this

        kayitBtn = findViewById<Button>(R.id.registerBtn)
        adSoyad = findViewById<EditText>(R.id.textInputAdSoyadKayit)
        apAd = findViewById<EditText>(R.id.textInputApartmanKayit)
        daireNo = findViewById<EditText>(R.id.textInputDaireKayit)
        tel = findViewById<EditText>(R.id.textInputTelKayit)
        email = findViewById<EditText>(R.id.textInputPostaKayit)

        kayitBtn.setOnClickListener {

            if(adSoyad.text.isNotEmpty() && apAd.text.isNotEmpty() && daireNo.text.isNotEmpty() && tel.text.isNotEmpty() && email.text.isNotEmpty()){
                var user = User(adSoyad.text.toString(), apAd.text.toString(), daireNo.text.toString().toInt(), tel.text.toString().toInt(), email.text.toString())
                var db = DataBaseHandler(context)
                db.insertData(user)
            }else{
                Toast.makeText(context, "TÜM ALANLARI DOLDURUNUZ", Toast.LENGTH_LONG).show()
            }

        }


    }

}