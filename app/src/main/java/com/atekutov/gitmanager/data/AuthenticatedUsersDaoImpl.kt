package com.atekutov.gitmanager.data

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.atekutov.gitmanager.domain.AuthenticatedUsersDao
import com.atekutov.gitmanager.entities.AuthenticatedUser
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class AuthenticatedUsersDaoImpl (
    private val sharedPreferences: SharedPreferences
): AuthenticatedUsersDao {

    private val usersData = MutableLiveData(users)
    private var currentUserData = MutableLiveData(currentUser)

    private var users: List<AuthenticatedUser>
        get() = sharedPreferences.getString(AUTHENTICATED_USERS_KEY, null)?.let {
            Json.decodeFromString(it)
        } ?: emptyList()
        set(value) {
            sharedPreferences.edit()
                .putString(
                    AUTHENTICATED_USERS_KEY,
                    Json.encodeToString<List<AuthenticatedUser>>(value)
                )
                .apply()
        }

    private var currentUser: AuthenticatedUser?
        get() = sharedPreferences.getString(CURRENT_AUTHENTICATED_USER_KEY, null)?.let {
            Json.decodeFromString(it)
        }
        set(value) {
            sharedPreferences.edit()
                .putString(
                    CURRENT_AUTHENTICATED_USER_KEY,
                    Json.encodeToString<AuthenticatedUser?>(value)
                )
                .apply()
        }

//    All users

    override fun add(user: AuthenticatedUser) {
        users = users + user
        if (currentUser == null) {
            currentUser = user
        }
    }

    override fun remove(user: AuthenticatedUser) {
        users = users - user
        if (isCurrent(user)) {
            currentUser = users.first()
        }
    }

    override fun getAll(): LiveData<List<AuthenticatedUser>> {
        return usersData
    }

//    Current user

    override fun getCurrent(): LiveData<AuthenticatedUser?> {
        return currentUserData
    }

    override fun setCurrent(user: AuthenticatedUser) {
        if (!users.contains(user)) {
            add(user)
        }
        currentUser = user
    }

    override fun isCurrent(user: AuthenticatedUser): Boolean {
        return currentUser == user
    }

    companion object {
        private const val AUTHENTICATED_USERS_KEY = "AUTHENTICATED_USERS_KEY"
        private const val CURRENT_AUTHENTICATED_USER_KEY = "CURRENT_AUTHENTICATED_USER_KEY"
    }
}