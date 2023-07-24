package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemSmallNewsBinding
import com.ork.simpleapp.model.SmallNewsModel


class SmallNewsViewHolder(
    parent: ViewGroup, private val binding: ItemSmallNewsBinding = ItemSmallNewsBinding.inflate(
        LayoutInflater.from(parent.context), parent, false
    )
) : RecyclerView.ViewHolder(binding.root) {

    private var selectedPosition = -1

    fun bind(newsModel: SmallNewsModel) {
        binding.title.text = newsModel.title

        binding.checkBox.setOnClickListener { view ->
            selectedPosition = adapterPosition
        }

        binding.checkBox.isChecked = selectedPosition == adapterPosition
    }
}