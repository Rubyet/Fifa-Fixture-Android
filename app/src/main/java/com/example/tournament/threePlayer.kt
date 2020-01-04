package com.example.tournament

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_four_players.*

class threePlayer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_player)

        val bundle: Bundle? = intent.extras
        val teams = bundle!!.getString("teams").toString()

        val txtP1 = findViewById<EditText>(R.id.txtP1).text.toString()
        val txtP2 = findViewById<EditText>(R.id.txtP2).text.toString()
        val txtP3 = findViewById<EditText>(R.id.txtP3).text.toString()

        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener{
            if(txtP1.trim().length != 0 && txtP2.trim().length != 0 && txtP3.trim().length != 0 )
            {
                if(teams.toInt() == 3)
                {
                    val intent = Intent(this,threeTeam::class.java)
                    save()
                    startActivity(intent)
                }
                else if(teams.toInt() == 6)
                {
                    val intent = Intent(this,sixTeam::class.java)
                    save()
                    startActivity(intent)
                }

            }
            else
            {
                Toast.makeText(this,"Enter All The Player Name", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun save() {
        val sp = getSharedPreferences("playersName", Context.MODE_PRIVATE)
        val editor = sp.edit()

        editor.putString("p1", txtP1.text.toString())
        editor.putString("p2", txtP2.text.toString())
        editor.putString("p3", txtP3.text.toString())

        editor.apply()
    }
}
