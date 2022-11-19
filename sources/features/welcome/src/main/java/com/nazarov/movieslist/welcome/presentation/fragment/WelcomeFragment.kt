package com.nazarov.movieslist.welcome.presentation.fragment

import android.view.View
import com.nazarov.movieslist.core.DependenciesProvider
import com.nazarov.movieslist.coreui.fragment.BaseRoutingFragment
import com.nazarov.movieslist.welcome.R
import com.nazarov.movieslist.welcome.databinding.WelcomeFragmentBinding
import com.nazarov.movieslist.welcome.di.WelcomeComponent
import com.nazarov.movieslist.welcome.presentation.router.WelcomeRouter
import com.nazarov.movieslist.welcome.presentation.viewmodel.WelcomeViewModel

private typealias BaseWelcomeRoutingFragment =
        BaseRoutingFragment<WelcomeFragmentBinding, WelcomeViewModel, WelcomeRouter>

class WelcomeFragment: BaseWelcomeRoutingFragment(
    R.layout.welcome_fragment,
    WelcomeViewModel::class.java
) {

    override fun initDaggerComponent(dependenciesProvider: DependenciesProvider) {
        WelcomeComponent.init(dependenciesProvider).inject(this)
    }

    override fun initBinding(view: View): WelcomeFragmentBinding = WelcomeFragmentBinding.bind(view)
}
