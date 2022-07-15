package com.example.android_sac.fragment.main.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android_sac.R
import com.example.android_sac.databinding.FragmentHomeBinding
import com.example.android_sac.databinding.FragmentLoginBinding

class HomeFragment : Fragment(R.layout.fragment_home){
    private val binding by viewBinding(FragmentHomeBinding::bind)

    lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        recyclerView = binding.rvHome
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
    }

}