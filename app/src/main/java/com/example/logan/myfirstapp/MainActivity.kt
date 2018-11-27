package com.example.logan.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        //gets the text view
        val showCountTextView = findViewById<TextView>(R.id.textView)
        //gets the value of the text view
        val countString = showCountTextView.text.toString()
        //convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++
        //Display the new value in the text view
        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View) {
        //creates intent to start 2nd activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        val showCountTextView = findViewById<TextView>(R.id.textView)

        val countString = showCountTextView.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        //starts 2nd activity
        startActivity(randomIntent)
    }
}
