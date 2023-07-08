package com.anuj.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //variables
    lateinit var tvName : TextView  // lateinit late initialization
    lateinit var button : Button

    //end
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvName = findViewById(R.id.tvName)
        button = findViewById(R.id.validate)
        //initialization
        var name = intent?.getStringExtra("name")
        var height = intent?.getDoubleExtra("height",0.0)
        System.out.println("name $name")
        tvName.setText(name)
//        clicks


    }

    //funstions
}