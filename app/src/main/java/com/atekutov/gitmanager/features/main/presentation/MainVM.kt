package com.atekutov.gitmanager.features.main.presentation

import androidx.lifecycle.ViewModel
import com.atekutov.gitmanager.domain.AuthenticatedUsersDao

class MainVM(
    private val authenticatedUsersDao: AuthenticatedUsersDao
): ViewModel() {

    val accauntsState = authenticatedUsersDao.getAll()

}