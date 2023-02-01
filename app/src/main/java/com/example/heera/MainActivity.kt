package com.example.heera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.Login)
        login.setOnClickListener{
            val intent = Intent( this,Login::class.java)
            startActivity(intent)
        }
        val register = findViewById<Button>(R.id.Register)
        register.setOnClickListener{
            val intent = Intent( this,Register::class.java)
            startActivity(intent)
        }

    }
}