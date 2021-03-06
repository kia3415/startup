package com.example.mystartup.ui.map

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mystartup.R
import kotlinx.android.synthetic.main.except_map_fragment.*
import kotlinx.android.synthetic.main.google_map.*

class ListAndDetailFragment(val cafeActivity: CafeActivity) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LIFECYCLE","ListAndDetailFragment onCreateView")
        /*val cafeAsyncTask = CafeAsyncTask(cafeActivity)
        cafeAsyncTask.execute()*/
        return inflater.inflate(R.layout.except_map_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("LIFECYCLE","ListAndDetailFragment onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }
}