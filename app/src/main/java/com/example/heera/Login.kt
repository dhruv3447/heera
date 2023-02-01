package com.example.heera

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val login = findViewById<Button>(R.id.Login)
        login.setOnClickListener{
            val intent = Intent( this,Home::class.java)
            startActivity(intent)
        }

    }
}