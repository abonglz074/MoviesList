package com.nazarov.movieslist.coreui.fragment

import android.os.Bundle
import android.view.View
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.viewbinding.ViewBinding
import com.nazarov.movieslist.coreui.router.BaseRouter
import com.nazarov.movieslist.coreui.viewmodel.BaseViewModel
import javax.inject.Inject

abstract class BaseRoutingFragment<VB : ViewBinding, VM : BaseViewModel, R : BaseRouter>(
    @LayoutRes private val layoutRes: Int,
    viewModelClass: Class<VM>
) : BaseFragment<VB, VM>(layoutRes, viewModelClass) {

    @Inject
    lateinit var router: R

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        router.bindActivity(requireActivity())
    }

    @CallSuper
    override fun onDestroy() {
        router.unbindActivity()
        super.onDestroy()
    }
}
