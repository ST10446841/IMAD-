package com.example.historyapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnClear.setOnClickListener {
            etAge.clear()
        }

        btnGenerate.setOnClickListener {
            val age = etAge.toString().toInt()
            val message = ""

            if (age <20) {
                "Age entered is outside the required age range"
            } else if (age >100) {
                "Age entered is outside the reuired age range"
            } else
                if (age == 55) {
                    tvResult.text =
                        "At ${age.toString()} Roman General and statesman, Julius Caeser,+" +
                                " was sadly assassinated by his two closest friends, Antony."

                } else if (age == 36){
                        tvResult.text = "Marylin Monroe was ${age.toString()} when she died of barbiturate +" +
                        " overdose."


                } else if (age == 20){
                    tvResult.text = "Heath Ledger was ${age.toString()} years old when he died."


                }else if (age == 25){
                    tvResult.text = "Angus Cloud died at the age of ${age.toString()}"


                }else if (age == 51){
                    tvResult.text = "You are the same age as Carl Wilson when he passed away"


                }else if (age == 41){
                    tvResult.text = "When Kobe Bryant was ${age.toString()} just like you, he sadly passed away + " +\
                            "due to a helicopter crash."


                }else if (age == 43){
                    tvResult.text = "When Billy Miller was ${age.toString()} just like you,he passed away."


                }else if (age == 81){
                    tvResult.text = "Queen Alexandria Victoria sadly passed away at the age of ${age.toString()}"


                }else if (age == 45){
                    tvResult.text = "Freddie Mercury was ${age.toString()} years old when he passed away."


                }else if (age == 75){
                    tvResult.text = "You are the same age as Tom Wilkinson when he passed away."

                }else{
                    tvResult.text = "No Historical facts were found for the age entered."
                }







        }
    }
}