package com.sample.easydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find the button in the layout
        val rollButton: Button = findViewById(R.id.rollerBtn)

        //find the text view in the layout
        val resultTextView: TextView = findViewById(R.id.diceValue)

        //set a roll listener on the button to roll the dice when user taps the button
        rollButton.setOnClickListener {
            val resultValue = roll()

            resultTextView.text = resultValue.toString();
        }
    }

    private  fun  roll(): Int {
        //do a random dice and return
        return (1..6).random()
    }
}