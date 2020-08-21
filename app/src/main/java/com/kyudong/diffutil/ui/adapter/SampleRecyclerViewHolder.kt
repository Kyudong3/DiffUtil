package com.kyudong.diffutil.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kyudong.diffutil.base.BaseVH
import com.kyudong.diffutil.databinding.ItemSampleBinding
import com.kyudong.diffutil.model.SampleItem

class SampleRecyclerViewHolder(
    parent: ViewGroup
) : BaseVH<SampleItem, ItemSampleBinding>(ItemSampleBinding.inflate(LayoutInflater.from(parent.context), parent, false)) {

    override fun bind(item: SampleItem) = with(binding) {
        sampleItem = item
        executePendingBindings()
    }
}