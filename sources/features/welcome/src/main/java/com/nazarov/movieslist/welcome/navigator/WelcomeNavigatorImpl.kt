package com.nazarov.movieslist.welcome.navigator

import androidx.fragment.app.FragmentActivity
import com.nazarov.movieslist.coreui.extensions.replaceFragment
import com.nazarov.movieslist.welcome.presentation.fragment.WelcomeFragment
import com.nazarov.movieslist.welcomeapi.WelcomeNavigator
import javax.inject.Inject

class WelcomeNavigatorImpl
@Inject constructor(): WelcomeNavigator {

    override fun openWelcomeFragment(fragmentActivity: FragmentActivity) {
        fragmentActivity.replaceFragment(
            addToBackStack = true,
            fragment = WelcomeFragment()
        )
    }
}
