package com.atekutov.gitmanager.features.authenticated_accounts.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.atekutov.gitmanager.domain.AuthenticatedUsersDao
import com.atekutov.gitmanager.entities.AuthenticatedUser
import com.atekutov.gitmanager.utils.SingleLiveEvent

class AuthenticatedAccountsVM(
    private val authenticatedUsersDao: AuthenticatedUsersDao
): ViewModel() {

    val accauntsState = authenticatedUsersDao.getAll()

    private val _openDetail = SingleLiveEvent<AuthenticatedUser>()
    val openDetail: LiveData<AuthenticatedUser> = _openDetail

    fun onAccauntClick(accaunt: AuthenticatedUser) {

    }
}