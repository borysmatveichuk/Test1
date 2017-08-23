package com.example.borysm.test1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById(R.id.txt1) as TextView
        txt1.setOnClickListener { Toast.makeText(this@MainActivity, R.string.greeting, Toast.LENGTH_SHORT).show() }
    }
}
