package com.nazarov.movieslist.movies.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.nazarov.movieslist.movies.data.entities.MoviesListResponse

object MoviesDiffUtil: DiffUtil.ItemCallback<MoviesListResponse>() {

    override fun areItemsTheSame(oldItem: MoviesListResponse, newItem: MoviesListResponse): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: MoviesListResponse, newItem: MoviesListResponse): Boolean {
        return oldItem == newItem
    }
}
