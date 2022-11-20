package com.nazarov.movieslist.movies.domain.entities

data class SingleMovieDto(
    val ended: String,
    val genres: List<String>,
    val id: Int,
    val image: ImageDto,
    val language: String,
    val name: String,
    val premiered: String,
    val rating: RatingDto,
    val status: String,
    val summary: String,
    val url: String,
)
