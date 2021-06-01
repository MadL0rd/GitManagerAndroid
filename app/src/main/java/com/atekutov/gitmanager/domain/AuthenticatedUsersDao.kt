package com.atekutov.gitmanager.domain

import androidx.lifecycle.LiveData
import com.atekutov.gitmanager.entities.AuthenticatedUser

interface AuthenticatedUsersDao {

    fun add(user: AuthenticatedUser)
    fun remove(user: AuthenticatedUser)
    fun getAll():  LiveData<List<AuthenticatedUser>>

    fun getCurrent() : LiveData<AuthenticatedUser?>
    fun setCurrent(user: AuthenticatedUser)
    fun isCurrent(user: AuthenticatedUser): Boolean
}