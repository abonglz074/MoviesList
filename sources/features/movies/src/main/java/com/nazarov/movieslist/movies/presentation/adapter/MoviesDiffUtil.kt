package com.nazarov.movieslist.movies.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.nazarov.movieslist.movies.data.entities.MoviesListResponseItem

object MoviesDiffUtil: DiffUtil.ItemCallback<MoviesListResponseItem>() {

    override fun areItemsTheSame(oldItem: MoviesListResponseItem, newItem: MoviesListResponseItem): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: MoviesListResponseItem, newItem: MoviesListResponseItem): Boolean {
        return oldItem == newItem
    }
}
