package com.kyudong.diffutil.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseAdapter<ITEM, VH : BaseVH<ITEM, out ViewDataBinding>>(
    diffCallback: DiffUtil.ItemCallback<ITEM>
) : ListAdapter<ITEM, VH>(diffCallback) {
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(getItem(position))

    override fun onCurrentListChanged(
        previousList: MutableList<ITEM>,
        currentList: MutableList<ITEM>
    ) {
        super.onCurrentListChanged(previousList, currentList)
        /* Callback */
    }
}