package com.example.depiandstudio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    lateinit var rightButton:Button
    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        rightButton = findViewById(R.id.right_button)
//        textView = findViewById(R.id.textView)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        rightButton.setOnClickListener()
        {

            rightButtonClicked()
        }

    }

    fun rightButtonClicked()
    {
//        textView.text = "Right button clicked"
//        rightButton.text = "Clicked"
//        rightButton.setBackgroundColor(R.color.black)
//        rightButton.setTextColor(R.color.white)
//        leftButton.setBackgroundColor(R.color.white)
//        leftButton.setTextColor(R.color.black)
    }
}