package com.example.android_sac.fragment.auth.signup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android_sac.R
import com.example.android_sac.databinding.FragmentSignupBinding

class SignupFragment : Fragment(R.layout.fragment_signup) {
    private val binding by viewBinding(FragmentSignupBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}