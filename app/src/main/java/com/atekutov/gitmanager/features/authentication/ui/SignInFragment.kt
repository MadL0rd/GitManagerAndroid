package com.atekutov.gitmanager.features.authentication.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.atekutov.gitmanager.R
import com.atekutov.gitmanager.common.BaseFragment
import com.atekutov.gitmanager.databinding.SignInFragmentBinding

class SignInFragment: BaseFragment(R.layout.sign_in_fragment) {

    private val viewBinding by viewBinding(SignInFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.singInText.setOnClickListener {
            val intent = Intent(view.context, SignIn::class.java)
            startActivity(intent)
        }
    }
}