package com.example.tournament

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.R.attr.name
import android.R.id.edit
import android.content.Context
import android.content.SharedPreferences
import kotlinx.android.synthetic.main.activity_four_players.*


class fourPlayers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_players)

        val bundle: Bundle? = intent.extras
        val teams = bundle!!.getString("teams").toString()

        val txtP1 = findViewById<EditText>(R.id.txtP1)
        val txtP2 = findViewById<EditText>(R.id.txtP2)
        val txtP3 = findViewById<EditText>(R.id.txtP3)
        val txtP4 = findViewById<EditText>(R.id.txtP4)

        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener{
            if(txtP1.text.toString().trim().isNotEmpty() && txtP2.text.toString().trim().isNotEmpty() && txtP3.text.toString().trim().isNotEmpty() && txtP4.text.toString().trim().isNotEmpty())
            {
                if(teams.toInt() == 4)
                {
                    val intent = Intent(this,fourTeam::class.java)
                    save()
                    startActivity(intent)
                }
                else if(teams.toInt() == 8)
                {
                    val intent = Intent(this,eightTeam::class.java)
                    save()
                    startActivity(intent)
                }

            }
            else
            {
                Toast.makeText(this,"Enter All The players Name", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun save() {
        val sp = getSharedPreferences("playersName", Context.MODE_PRIVATE)
        val editor = sp.edit()

        editor.putString("p1", txtP1.text.toString())
        editor.putString("p2", txtP2.text.toString())
        editor.putString("p3", txtP3.text.toString())
        editor.putString("p4", txtP4.text.toString())

        editor.apply()
    }
}
