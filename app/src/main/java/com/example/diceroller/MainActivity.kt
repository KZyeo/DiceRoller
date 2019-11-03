package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val countButton: Button = findViewById(R.id.countUp_button)
        countButton.setOnClickListener{countUp()}

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{reset()}
    }

    private fun rollDice() {
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()

        val randomInt = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun reset() {

        val resultText: TextView = findViewById(R.id.result_text)


        resultText.text = 0.toString()
    }

    private fun countUp(){

        val resultText: TextView = findViewById(R.id.result_text)

        var resultInt = resultText.text.toString().toInt()

        if(resultInt != 6){
            resultInt++
            resultText.text = resultInt.toString()
        }
    }
}

