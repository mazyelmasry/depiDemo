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
    lateinit var leftButton:Button
    lateinit var rightButton:Button
    lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        leftButton = findViewById(R.id.left_button)
        rightButton = findViewById(R.id.right_button)
//        textView = findViewById(R.id.textView)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        leftButton.setOnClickListener()
        {
            leftButtonClicked()
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
        leftButton.text = "Left Button"
    }
    fun leftButtonClicked()
    {
//        textView.text = "Left button clicked"
//        leftButton.text = "Clicked"
//        leftButton.setBackgroundColor(R.color.black)
//        leftButton.setTextColor(R.color.white)
//        rightButton.setBackgroundColor(R.color.white)
//        rightButton.setTextColor(R.color.black)
        rightButton.text = "Right Button"
    }
}