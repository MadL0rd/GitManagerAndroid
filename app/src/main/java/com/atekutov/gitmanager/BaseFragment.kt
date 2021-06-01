package com.atekutov.gitmanager

import android.util.Log
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes containerLayoutId: Int): Fragment(containerLayoutId) {

    private val logTag = this::class.java.canonicalName

    internal fun log(logMessage: String) {
        Log.d(logTag, logMessage)
    }
}