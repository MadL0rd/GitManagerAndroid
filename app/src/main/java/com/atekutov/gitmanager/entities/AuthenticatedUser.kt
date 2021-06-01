package com.atekutov.gitmanager.entities

import android.os.Parcelable

data class AuthenticatedUser(

    val token: String,
    val providerType: SupportedApiProviders
)
