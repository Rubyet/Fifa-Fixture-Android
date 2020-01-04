package com.example.tournament

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNew = findViewById<Button>(R.id.btnNew)
        btnNew.setOnClickListener{
            val intent = Intent(this,New::class.java)
            startActivity(intent)
        }

        val btnHistory = findViewById<Button>(R.id.btnHistory)




    }
}
