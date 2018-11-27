package com.example.logan.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    private fun showRandomNumber() {
        //gets current count value from other activity
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        //generates random number
        val random = Random()
        var randomInt = 0

        //increments number by 1 since it is exclusive
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        //displays the random number
        findViewById<TextView>(R.id.textview_random).text = String.format("%d", randomInt)
        //substitute the max value into the string resource
        //for the heading, and update the heading
        findViewById<TextView>(R.id.textView_label).text = getString(R.string.random_heading, count)
    }

    fun refreshMe(view: View) {
        showRandomNumber()
    }
}