package com.example.lab4_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    private val launcher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            val drink = result.data?.getStringExtra("drink_name")
            val sugar = result.data?.getStringExtra("sugar_name")
            val ice = result.data?.getStringExtra("ice_name")

            resultTextView.text = "飲料：$drink\n甜度：$sugar\n冰塊：$ice"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.textView3)

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            launcher.launch(intent)
        }
    }
}