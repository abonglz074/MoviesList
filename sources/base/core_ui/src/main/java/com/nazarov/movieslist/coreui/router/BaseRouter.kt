package com.nazarov.movieslist.coreui.router

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

abstract class BaseRouter {

    private var fragmentActivity: FragmentActivity? = null
    private var fragmentManager: FragmentManager? = null

    protected fun getActivity(action: (fragmentActivity: FragmentActivity) -> Unit) {
        val fragmentActivity = fragmentActivity ?: return
        if (!fragmentActivity.supportFragmentManager.isStateSaved) {
            action(fragmentActivity)
        }
    }

    fun bindActivity(fragmentActivity: FragmentActivity) {
        this.fragmentActivity = fragmentActivity
    }

    fun unbindActivity() {
        fragmentActivity = null
    }

    fun unbindFragmentManager() {
        fragmentManager = null
    }

    fun finish() {
        getActivity { fragmentActivity ->
            if (fragmentActivity.supportFragmentManager.backStackEntryCount == 0) {
                fragmentActivity.finish()
            } else {
                fragmentActivity.supportFragmentManager.popBackStack()
            }
        }
    }
}
