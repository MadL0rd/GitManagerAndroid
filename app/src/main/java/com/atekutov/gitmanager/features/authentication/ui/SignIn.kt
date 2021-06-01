package com.atekutov.gitmanager.features.authentication.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import com.atekutov.gitmanager.R
import com.atekutov.gitmanager.databinding.AuthenticatedAccauntsScreenBinding
import com.atekutov.gitmanager.entities.SupportedApiProviders

class SignIn : AppCompatActivity() {

    private val clientId = "0a73c3a488f79a02b4b4"
    private val clientSecret = "fc0496b8b87a616926bc3923de1f53e9656d9905"
    private val redirectUri = "gitmanager://callback/"
    private val requestString = "https://github.com/login/oauth/authorize/?client_id=$clientId&redirect_uri=$redirectUri&scope=repo"

//    private val appId = "b837d141c5118aa0cd85d53c2b986fdf4ea670d82538a13f54d42fab0a8b031f"
//    private val clientSecret = "ad78d49c037fc103304e38c8f18e5bae4ddd1c4355d2e78c3bb3b13d8491da22"
//    private val redirectUri = "gitmanagergitlab://callback/"
//    private val requestString = "https://gitlab.com/oauth/authorize?client_id=$appId&redirect_uri=$redirectUri&response_type=code&scope=api+read_user+read_api+read_repository+write_repository+read_registry+write_registry+sudo+openid+profile+email"

    var apiProvider: SupportedApiProviders = SupportedApiProviders.gitHub

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        findViewById<ImageButton>(R.id.buttonSignInGitLab).setOnClickListener {
            showProvidorAuthenticationPage(SupportedApiProviders.gitLab)
        }
        findViewById<ImageButton>(R.id.buttonSignInGitHub).setOnClickListener {
            showProvidorAuthenticationPage(SupportedApiProviders.gitHub)
        }
        findViewById<ImageView>(R.id.backArrow).setOnClickListener {
            onBackPressed()
        }
    }

    override fun onResume() {
        super.onResume()

        val uri = intent.data
        Log.i("kek", "Data: $uri")
        uri?.getQueryParameter("code")?.let {
            Log.i("kek", "Kek wait: $it")
        }
        uri?.getQueryParameter("error")?.let {
            Log.i("kek", "Lol what: $it")
        }
//        onBackPressed()
    }

    fun showProvidorAuthenticationPage(provider: SupportedApiProviders) {
        apiProvider = provider
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(requestString)
        )
        startActivity(intent)
    }
}