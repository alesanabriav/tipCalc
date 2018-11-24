package com.developersoul.tipcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        totalText.visibility = View.INVISIBLE
        calculateBtn.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val percentage = percentageEditText.text.toString().toDouble()
            val tip = bill * percentage / 100
            val total = bill + tip
            totalText.text = "tip: ${simpleDouble(tip)} total: ${simpleDouble(total)}"
            totalText.visibility = View.VISIBLE
        }

    }

    fun simpleDouble(num: Double): String {
        return String.format("%.2f", num);
    }
}
