package com.example.tournament

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name_select.*
import org.w3c.dom.Text
import android.content.SharedPreferences
import kotlinx.android.synthetic.main.activity_new.*


class nameSelect : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_select)
        textView3.setText("Hola")

        getdata()


    }

    private fun getdata() {
        val sp = getSharedPreferences("playerName", Context.MODE_PRIVATE)
        val sp2 = getSharedPreferences("teamName", Context.MODE_PRIVATE)
        val name = sp.getString("p2", null)
        val name2 = sp2.getString("t1", null)

        if (name != null) {
            textView2.setText(name)

            textView7.setText(name2)
        }

    }
}
