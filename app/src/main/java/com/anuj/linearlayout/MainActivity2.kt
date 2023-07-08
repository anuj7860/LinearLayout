package com.anuj.linearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var height:EditText
    lateinit var weight :EditText
    lateinit var enter : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name = findViewById(R.id.name)
        height = findViewById(R.id.height)
        enter = findViewById(R.id.enter)

        enter.setOnClickListener {
            if(name.text.isNullOrEmpty()){
                name.error = "Enter your name"
            }else if(height.text.isNullOrEmpty()){
                height.error = "Enter your height"
            }else{
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("name", name.text.toString())
                intent.putExtra("height", name.text.toString().toDouble())
                startActivity(intent)
                finish()
            }
        }

    }
}