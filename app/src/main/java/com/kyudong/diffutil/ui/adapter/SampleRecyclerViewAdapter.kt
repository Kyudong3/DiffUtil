package com.kyudong.diffutil.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.kyudong.diffutil.databinding.ItemSampleBinding
import com.kyudong.diffutil.model.SampleItem

class SampleRecyclerViewAdapter(
    private val sampleItemList: MutableList<SampleItem>
) : RecyclerView.Adapter<SampleRecyclerViewAdapter.RecyclerViewVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewVH {
        val binding = ItemSampleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecyclerViewVH(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewVH, position: Int) {
        holder.bind(sampleItemList[position])
    }

    override fun getItemCount(): Int = sampleItemList.size

    inner class RecyclerViewVH(private val binding: ItemSampleBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SampleItem) {
            binding.executePendingBindings()
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<SampleItem>() {
            override fun areItemsTheSame(oldItem: SampleItem, newItem: SampleItem): Boolean {
                TODO("Not yet implemented")
            }

            override fun areContentsTheSame(oldItem: SampleItem, newItem: SampleItem): Boolean {
                TODO("Not yet implemented")
            }
        }
    }
}