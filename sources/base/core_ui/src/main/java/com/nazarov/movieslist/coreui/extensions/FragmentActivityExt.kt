package com.nazarov.movieslist.coreui.extensions

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

inline fun <reified T : Fragment> FragmentActivity.replaceFragment(
    addToBackStack: Boolean,
    fragment: T
) {
    fragment.openFragment(supportFragmentManager, T::class.java.name, addToBackStack)
}
