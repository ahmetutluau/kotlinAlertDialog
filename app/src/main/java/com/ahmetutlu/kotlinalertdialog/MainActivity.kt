package com.ahmetutlu.kotlinalertdialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "Merhaba", Toast.LENGTH_SHORT).show()
    }

    fun save (view: View){
        val alert=AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure")
        alert.setPositiveButton("yes"){Dialog ,which->
            Toast.makeText(applicationContext, "Saved", Toast.LENGTH_SHORT).show()}
        alert.setNegativeButton("no"){Dialog ,which->
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_SHORT).show()
        }
        alert.show()
    }

}