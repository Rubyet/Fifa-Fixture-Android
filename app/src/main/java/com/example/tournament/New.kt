package com.example.tournament

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class New : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val txtPlayers = findViewById<EditText>(R.id.txtPlayers)
        val txtTeams = findViewById<EditText>(R.id.txtTeams)

        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener{

            val teams = txtTeams.text.toString()
            val players = txtPlayers.text.toString()

            if(teams.trim().length != 0 && teams.toInt() >= 2 )
            {
                if(players.trim().length != 0 && players.toInt() >= 2)
                {
                    val intent = Intent(this,nameSelect::class.java)
                    intent.putExtra("teams",teams)
                    intent.putExtra("players",players)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this,"Enter a valid number of Teams", Toast.LENGTH_SHORT).show()
                }
            }
            else
            {
                Toast.makeText(this,"Enter a valid number of Players", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
