package com.example.test_004

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    fun toLogin(view: View) {
        val toLogin: Intent = Intent(this, MainActivity::class.java)
        startActivity(toLogin)
    }
}