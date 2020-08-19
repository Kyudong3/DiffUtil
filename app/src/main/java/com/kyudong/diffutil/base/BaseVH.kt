package com.kyudong.diffutil.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseVH<ITEM, B : ViewBinding>(
    private val binding: B
) : RecyclerView.ViewHolder(binding.root)