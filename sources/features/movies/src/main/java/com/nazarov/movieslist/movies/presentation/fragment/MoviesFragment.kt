package com.nazarov.movieslist.movies.presentation.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.nazarov.movieslist.core.DependenciesProvider
import com.nazarov.movieslist.coreui.fragment.BaseRoutingFragment
import com.nazarov.movieslist.movies.R
import com.nazarov.movieslist.movies.databinding.MoviesFragmentBinding
import com.nazarov.movieslist.movies.di.MoviesComponent
import com.nazarov.movieslist.movies.presentation.adapter.MoviesAdapter
import com.nazarov.movieslist.movies.presentation.router.MoviesRouter
import com.nazarov.movieslist.movies.presentation.viewmodel.MoviesViewModel

private typealias BaseMoviesRoutingFragment =
        BaseRoutingFragment<MoviesFragmentBinding, MoviesViewModel, MoviesRouter>

class MoviesFragment : BaseMoviesRoutingFragment(
    R.layout.movies_fragment,
    MoviesViewModel::class.java
) {

    private val adapter by lazy(LazyThreadSafetyMode.NONE) {
        MoviesAdapter { onItemClicked() }
    }

    override fun initDaggerComponent(dependenciesProvider: DependenciesProvider) {
        MoviesComponent.init(dependenciesProvider).inject(this)
    }

    override fun initBinding(view: View): MoviesFragmentBinding = MoviesFragmentBinding.bind(view)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showRecycler()


    }

    private fun showRecycler() {
        binding.moviesRecyclerView.adapter = adapter
        binding.moviesRecyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.getMoviesList()
        viewModel.progressBar.observe(viewLifecycleOwner) {
            binding.moviesProgressBar.visibility = View.VISIBLE
        }

        viewModel.errorMessage.observe(viewLifecycleOwner) {
            binding.moviesErrorMessage.visibility = View.VISIBLE
        }
        viewModel.moviesList.observe(viewLifecycleOwner) { response ->
            Log.d("Data", "$response")
            adapter.submitList(response)
        }
    }

    private fun onItemClicked() {

    }
}
