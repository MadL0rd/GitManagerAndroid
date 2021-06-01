package com.atekutov.gitmanager.features.main.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.atekutov.gitmanager.R
import com.atekutov.gitmanager.common.BaseFragment
import com.atekutov.gitmanager.databinding.MainScreenBinding
import com.atekutov.gitmanager.databinding.SignInFragmentBinding
import com.atekutov.gitmanager.features.authentication.ui.SignIn
import com.atekutov.gitmanager.features.authentication.ui.SignInFragment

class MainFragment: BaseFragment(R.layout.main_screen) {

    private val viewBinding by viewBinding(MainScreenBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragment = SignInFragment()
        childFragmentManager.beginTransaction()
            .replace(viewBinding.mainScreenContainer.id, fragment, fragment::class.java.canonicalName)
            .commitAllowingStateLoss()
    }
}