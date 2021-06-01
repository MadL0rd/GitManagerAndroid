package com.atekutov.gitmanager.di

import android.content.Context
import com.atekutov.gitmanager.data.AuthenticatedUsersDaoImpl
import com.atekutov.gitmanager.domain.AuthenticatedUsersDao

object AuthenticatedUsersDaoProvider {

    private var dao: AuthenticatedUsersDao? = null

    fun getDao(context: Context): AuthenticatedUsersDao {
        return dao ?: AuthenticatedUsersDaoImpl(
            context.getSharedPreferences("data", Context.MODE_PRIVATE)
        ).also { dao = it }
    }
}