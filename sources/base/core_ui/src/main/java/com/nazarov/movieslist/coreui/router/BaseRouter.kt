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

    protected fun getParentFragmentManager(action: (fragmentManager: FragmentManager) -> Unit) {
        val fragmentManager = fragmentManager ?: return
        if (!fragmentManager.isStateSaved) {
            action(fragmentManager)
        }
    }

    fun bindActivity(fragmentActivity: FragmentActivity) {
        this.fragmentActivity = fragmentActivity
    }

    fun bindFragmentManager(fragmentManager: FragmentManager) {
        this.fragmentManager = fragmentManager
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
