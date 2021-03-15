package com.example.diceroller_week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView                                       // data member // lateinit for latter declaration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)                                  // Father class
        setContentView(R.layout.activity_main)                              // Layout; R = resource;

        val rollButton: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)

        rollButton.setOnClickListener {                                     // lambda expression
            rollDice()

         }
    }

    private fun rollDice() {
        // Use "Dots" for chaining call

        //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show() // "this" means this class
        //val textResult: TextView = findViewById(R.id.text_result)


        //generate random number for dice
        val randomInt = (1..6).random()                                     // range (object)

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

            //else -> R.drawable.empty_dice                                   //must include else
        }

        //textResult.text = randomInt.toString()                            //toString is type conversion
        diceImage.setImageResource(drawableResource)
        //Toast.makeText(this,randomInt.toString(),Toast.LENGTH_SHORT).show()
    }
}