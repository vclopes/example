package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heading1 = findViewById<TextView>(R.id.tv_secao_1)
        val heading2 = findViewById<TextView>(R.id.tv_secao_2)

        heading1.setHeading()
        heading2.setHeading()

    }
}