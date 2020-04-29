package com.example.boogaloopart2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gameButton = findViewById<Button>(R.id.Game)
        val songButton = findViewById<Button>(R.id.Options)
        val opAct = Intent(this, OptionsActivity::class.java)
        val diffAct = Intent(this, DifficultyActivity::class.java)
        gameButton.setOnClickListener { startActivity(opAct) }
        songButton.setOnClickListener {startActivity(diffAct)}
    }
}
