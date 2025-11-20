package com.example.lab4_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val drinkInput = findViewById<EditText>(R.id.editTextTextPersonName)
        val sugarInput = findViewById<RadioGroup>(R.id.radioGroupSugar)
        val iceInput = findViewById<RadioGroup>(R.id.radioGroupIce)

        findViewById<Button>(R.id.button3).setOnClickListener {      //等待button是否被按下
            val sugarId = sugarInput.checkedRadioButtonId
            val iceId = iceInput.checkedRadioButtonId

            val sugarText = findViewById<RadioButton>(sugarId)?.text.toString()
            val iceText = findViewById<RadioButton>(iceId)?.text.toString()

            val intent = Intent()
            intent.putExtra("drink_name", drinkInput.text.toString())
            intent.putExtra("sugar_name", sugarText)
            intent.putExtra("ice_name", iceText)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
