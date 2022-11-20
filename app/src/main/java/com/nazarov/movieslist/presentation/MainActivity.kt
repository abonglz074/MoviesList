package com.nazarov.movieslist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nazarov.movieslist.MainApp
import com.nazarov.movieslist.R
import com.nazarov.movieslist.coreui.ContainerId
import com.nazarov.movieslist.di.MainActivityComponent
import com.nazarov.movieslist.welcomeapi.WelcomeNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var welcomeNavigator: WelcomeNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            ContainerId.setContainerId(R.id.main_activity_fragment_container)
        }

        MainActivityComponent.init(
            (application as MainApp).getDependenciesProvider()
        ).inject(this)
        welcomeNavigator.openWelcomeFragment(this)
    }
}
