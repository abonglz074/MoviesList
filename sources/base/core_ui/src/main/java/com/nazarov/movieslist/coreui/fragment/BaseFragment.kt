package com.nazarov.movieslist.coreui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.nazarov.movieslist.core.App
import com.nazarov.movieslist.core.DependenciesProvider
import com.nazarov.movieslist.coreui.viewmodel.BaseViewModel
import javax.inject.Inject

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>(
    @LayoutRes private val layoutRes: Int,
    private val viewModelClass: Class<VM>
) : Fragment() {

    protected lateinit var viewModel: VM

    private var _binding: VB? = null
    protected val binding get() = checkNotNull(_binding) {
        "Binding isn't initialized"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onAttach(context: Context) {
        super.onAttach(context)
        initDaggerComponent((requireActivity().application as App).getDependenciesProvider())
        viewModel = ViewModelProvider(viewModelStore, viewModelFactory)[viewModelClass]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(layoutRes, container, false)
        _binding = initBinding(view)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    protected abstract fun initDaggerComponent(dependenciesProvider: DependenciesProvider)

    protected abstract fun initBinding(view: View): VB
}
