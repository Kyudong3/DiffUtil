package com.kyudong.diffutil.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.kyudong.diffutil.R
import com.kyudong.diffutil.databinding.ActivityMainBinding
import com.kyudong.diffutil.model.SampleItem
import com.kyudong.diffutil.ui.adapter.SampleRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sampleRvAdapter : SampleRecyclerViewAdapter

    private lateinit var sampleItemList: MutableList<SampleItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindLayout()
        setAdapter()
    }

    private fun bindLayout() {
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
    }

    private fun setAdapter() {
        sampleItemList = arrayListOf()
        sampleRvAdapter = SampleRecyclerViewAdapter(sampleItemList)
        binding.listRv.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = sampleRvAdapter
        }
    }
}