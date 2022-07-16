package com.example.android_sac.fragment.splash

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android_sac.R
import com.example.android_sac.databinding.FragmentSignupBinding
import com.example.android_sac.databinding.FragmentSplashBinding
import com.example.android_sac.fragment.BaseFlowFragment
import com.example.android_sac.manager.AuthManager

class SplashFragment :  SplashFlowFragment(){
    private val binding by viewBinding(FragmentSplashBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        countDownTimer()
    }

    private fun countDownTimer() {
        object : CountDownTimer(20000, 10000) {
            override fun onTick(p0: Long) {}
            override fun onFinish() {

            }
        }.start()
    }
}