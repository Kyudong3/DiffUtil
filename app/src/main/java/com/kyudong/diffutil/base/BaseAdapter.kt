package com.kyudong.diffutil.base

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding

abstract class BaseAdapter<ITEM, VH : BaseVH<ITEM, out ViewBinding>>(
    diffCallback: DiffUtil.ItemCallback<ITEM>
) : ListAdapter<ITEM, VH>(diffCallback) {
}