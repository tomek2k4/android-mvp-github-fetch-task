package com.pum.tomasz.androidmvpgithubfetchtask.navigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pum.tomasz.androidmvpgithubfetchtask.AndroidApplication
import com.pum.tomasz.androidmvpgithubfetchtask.di.component.ApplicationComponent
import javax.inject.Inject


class RouteActivity: AppCompatActivity() {

    private val appComponent:ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (application as AndroidApplication).applicationComponent
    }

    @Inject internal lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        navigator.showMain(this)
    }
}
