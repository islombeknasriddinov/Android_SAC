package com.example.android_sac.fragment.splash

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.View
import com.example.android_sac.R
import com.example.android_sac.extantion.activityNavController
import com.example.android_sac.extantion.navigateSafely
import com.example.android_sac.manager.AuthManager

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        countDownTimer()
    }

    private fun countDownTimer() {
        object : CountDownTimer(2000, 1000){
            override fun onTick(millisUntilFinished: Long) { }

            override fun onFinish() {
                when{
                    AuthManager.isAuthorized -> {
                        activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
                    }
                    !AuthManager.isAuthorized -> {
                        activityNavController().navigateSafely(R.id.action_global_loginFlowFragment)
                    }
                }
            }
        }.start()
    }
}