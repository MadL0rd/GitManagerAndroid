package com.atekutov.gitmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.atekutov.gitmanager.features.authentication.ui.SignIn
import com.atekutov.gitmanager.features.main.ui.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragment = MainFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.mainContainer, fragment, fragment::class.java.canonicalName)
                .commitAllowingStateLoss()
        }
    }
}