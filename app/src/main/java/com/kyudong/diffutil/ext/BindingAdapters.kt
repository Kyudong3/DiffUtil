package com.kyudong.diffutil.ext

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kyudong.diffutil.base.BaseAdapter

@Suppress("UNCHECKED_CAST")
@BindingAdapter("replaceAll")
fun RecyclerView.replaceAll(items: List<Any>?) {
    (adapter as? BaseAdapter<Any, *>)?.run {
        items?.run(::submitList)
    }
}