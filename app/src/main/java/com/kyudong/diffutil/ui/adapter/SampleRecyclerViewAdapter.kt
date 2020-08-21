package com.kyudong.diffutil.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.kyudong.diffutil.base.BaseAdapter
import com.kyudong.diffutil.model.SampleItem
import kotlin.random.Random

class SampleRecyclerViewAdapter : BaseAdapter<SampleItem, SampleRecyclerViewHolder>(DIFF_CALLBACK) {

    private val sampleItemList = arrayListOf<SampleItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleRecyclerViewHolder {
        return SampleRecyclerViewHolder(parent)
    }

    fun addItem(name: String) {
        val sampleItem = SampleItem(name, (Random.nextInt(0, 30)), Random.nextInt(0, 10))
        sampleItemList.add(sampleItem)
        submitList(sampleItemList.toMutableList())
    }

    fun removeLastItem() {
        if (sampleItemList.isNotEmpty()) {
            sampleItemList.remove(sampleItemList[sampleItemList.size - 1])
            submitList(sampleItemList.toMutableList())
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<SampleItem>() {
            override fun areItemsTheSame(oldItem: SampleItem, newItem: SampleItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: SampleItem, newItem: SampleItem): Boolean {
                return oldItem == newItem
            }
        }
    }
}