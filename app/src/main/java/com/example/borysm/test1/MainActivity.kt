package com.example.borysm.test1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text = R.string.greeting.toString()
        message.setOnClickListener { Toast.makeText(this@MainActivity, R.string.greeting, Toast.LENGTH_SHORT).show() }
    }
}
