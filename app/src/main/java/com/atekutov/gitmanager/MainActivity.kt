package com.atekutov.gitmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSignInScreen()
    }

    private fun showSignInScreen() {
        val intent = Intent(this, SignIn::class.java)
        startActivity(intent)
    }
}