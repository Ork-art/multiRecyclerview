package com.example.myapplication.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.enum.NewsType
import com.ork.simpleapp.model.BaseModel
import com.ork.simpleapp.model.BigNewsModel
import com.ork.simpleapp.model.SmallNewsModel

class NewsAdapter (private val newsList: ArrayList<BaseModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            NewsType.BIG_NEWS.ordinal -> {
                BigNewsHolder(parent)
            }
            NewsType.SMALL_NEWS.ordinal -> {
                SmallNewsViewHolder(parent)
            }
            else -> {
                BigNewsHolder(parent)
            }
        }

    }


    override fun getItemCount(): Int = newsList.size


    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {

        when(newsList[position]){
            is BigNewsModel ->{
                (holder as BigNewsHolder).bind(newsList[position] as BigNewsModel)
            }
            is SmallNewsModel ->{
                (holder as SmallNewsViewHolder).bind(newsList[position] as SmallNewsModel)
            }
        }




    }

    override fun getItemViewType(position: Int): Int {
        return when(newsList[position]){
            is BigNewsModel ->{
                NewsType.BIG_NEWS.ordinal
            }
            is SmallNewsModel ->{
                NewsType.SMALL_NEWS.ordinal
            }
            else -> {
                NewsType.BIG_NEWS.ordinal
            }
        }
    }
}