package com.example.lab6_kotlin

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val listItems = arrayOf("選項一", "選項二", "選項三")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowDialog = findViewById<Button>(R.id.button)
        btnShowDialog.setOnClickListener {
            showDialog()
        }
    }

    private fun findViewById(button: Int) {}

    private fun showDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("請選擇功能")

        builder.setNegativeButton("顯示LIST") { _, _ ->
            showListDialog()
        }

        builder.setPositiveButton("自定義TOAST") { _, _ ->
            showCustomToast(this, "客製化的Toast！")
        }

        builder.setNeutralButton("取消") { _, _ ->
            Toast.makeText(this, "已取消", Toast.LENGTH_SHORT).show()
        }

        builder.show()
    }

    private fun showListDialog() {
        AlertDialog.Builder(this)
            .setTitle("選擇一個項目")
            .setItems(listItems) { _, which ->
                Toast.makeText(this, "你選擇了：${listItems[which]}", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("關閉", null)
            .show()
    }

    private fun showCustomToast(context: Context, message: String) {
        val inflater = LayoutInflater.from(context)
        val layout: View = inflater.inflate(R.layout.custom_toast, null)

        val textView: TextView = layout.findViewById(R.id.textView)
        textView.text = message

        val toast = Toast(context)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
    }
}