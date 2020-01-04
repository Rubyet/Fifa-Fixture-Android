package com.example.tournament

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name_select.*
import org.w3c.dom.Text

class nameSelect : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_select)

        val bundle: Bundle? = intent.extras
        val teams = bundle!!.getString("teams")
        val players = bundle!!.getString("players")

        //val txtPlayers = findViewById<View>(R.id.textView2)
        //val txtTeam = findViewById<View>(R.id.textView3)

        textView2.text = teams
        textView3.text = players


    }
}
