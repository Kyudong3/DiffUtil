package com.kyudong.diffutil.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseVH<ITEM, B : ViewDataBinding>(
    val binding: B
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun bind(item: ITEM)
}