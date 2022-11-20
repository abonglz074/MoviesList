package com.nazarov.movieslist.core.network

sealed class ResponseStatus<T>(
    val isLoading: Boolean = false,
    val data: T? = null,
    val message: String? = null
) {

    class Loading<T>: ResponseStatus<T>(isLoading = true)
    class Success<T>(data: T?) : ResponseStatus<T>(data = data)
    class Error<T>(message: String?) : ResponseStatus<T>(message = message)
}
