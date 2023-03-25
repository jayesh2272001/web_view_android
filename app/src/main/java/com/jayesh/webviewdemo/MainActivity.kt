package com.jayesh.webviewdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etUrl: EditText
    private lateinit var btnGo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUrl = findViewById(R.id.etUrl)
        btnGo = findViewById(R.id.btnGo)

        btnGo.setOnClickListener {
            if (etUrl.text.isNullOrEmpty()) {
                Toast.makeText(this, "Please Provide an URL!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, WebViewDemoActivity::class.java)
                intent.putExtra("url", etUrl.text.toString())
                startActivity(intent)
            }

        }
    }
}