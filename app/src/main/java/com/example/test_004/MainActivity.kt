package com.example.test_004

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toRegistration(view:View) {
        val toReg:Intent = Intent(this, Registration::class.java)
        startActivity(toReg)
    }
}