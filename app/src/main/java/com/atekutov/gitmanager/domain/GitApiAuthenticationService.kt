package com.atekutov.gitmanager.domain

import android.net.Uri
import com.atekutov.gitmanager.entities.AuthenticatedUser
import retrofit2.Call

interface GitApiAuthenticationService {

    fun getOauthUri(): Uri
    fun completeAuthentication(code: String): Call<AuthenticatedUser>
}