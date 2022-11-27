package com.nazarov.movieslist.movies.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nazarov.movieslist.movies.data.entities.MoviesListResponse
import com.nazarov.movieslist.movies.databinding.MoviesListItemBinding

class MoviesAdapter(
    private val clickListener: () -> Unit
) : ListAdapter<MoviesListResponse, MoviesViewHolder>(MoviesDiffUtil) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MoviesListItemBinding.inflate(inflater, parent, false)

        binding.root.setOnClickListener {
            clickListener()
        }

        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class MoviesViewHolder(
    private val binding: MoviesListItemBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bind(model: MoviesListResponse) {
        binding.moviesItemListName.text = model.name
    }
}
