package com.example.tournament

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_eight_team.*
import kotlinx.android.synthetic.main.activity_four_players.*

class eightTeam : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight_team)

        val txtTeam1 = findViewById<EditText>(R.id.txtTeam1)
        val txtTeam2 = findViewById<EditText>(R.id.txtTeam2)
        val txtTeam3 = findViewById<EditText>(R.id.txtTeam3)
        val txtTeam4 = findViewById<EditText>(R.id.txtTeam4)
        val txtTeam5 = findViewById<EditText>(R.id.txtTeam5)
        val txtTeam6 = findViewById<EditText>(R.id.txtTeam6)
        val txtTeam7 = findViewById<EditText>(R.id.txtTeam7)
        val txtTeam8 = findViewById<EditText>(R.id.txtTeam8)

        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener{
            if(txtTeam1.text.toString().trim().isNotEmpty() && txtTeam2.text.toString().trim().isNotEmpty() && txtTeam3.text.toString().trim().isNotEmpty() && txtTeam4.text.toString().trim().isNotEmpty() && txtTeam5.text.toString().trim().isNotEmpty() && txtTeam6.text.toString().trim().isNotEmpty() && txtTeam7.text.toString().trim().isNotEmpty() && txtTeam8.text.toString().trim().isNotEmpty())
            {
                val intent = Intent(this,nameSelect::class.java)
                save()
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,"Enter All The Team Name", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun save() {
        val sp = getSharedPreferences("teamName", Context.MODE_PRIVATE)
        val editor = sp.edit()

        editor.putString("t1", txtTeam1.text.toString())
        editor.putString("t2", txtTeam2.text.toString())
        editor.putString("t3", txtTeam3.text.toString())
        editor.putString("t4", txtTeam4.text.toString())
        editor.putString("t5", txtTeam5.text.toString())
        editor.putString("t6", txtTeam6.text.toString())
        editor.putString("t7", txtTeam7.text.toString())
        editor.putString("t8", txtTeam8.text.toString())

        editor.apply()
    }
}
