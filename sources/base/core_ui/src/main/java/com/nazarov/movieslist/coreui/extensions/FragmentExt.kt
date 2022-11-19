package com.nazarov.movieslist.coreui.extensions

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.nazarov.movieslist.coreui.ContainerId

fun Fragment.openFragment(
    fragmentManager: FragmentManager,
    tag: String,
    addToBackStack: Boolean
) {
    fragmentManager.beginTransaction().apply {
        if (addToBackStack) addToBackStack(null)
        replace(ContainerId.containerId, this@openFragment, tag)
        commit()
    }
}
