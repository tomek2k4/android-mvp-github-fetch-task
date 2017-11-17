package com.pum.tomasz.androidmvpgithubfetchtask

import android.app.Application
import com.pum.tomasz.androidmvpgithubfetchtask.di.component.ApplicationComponent
import com.pum.tomasz.androidmvpgithubfetchtask.di.component.DaggerApplicationComponent

class AndroidApplication: Application() {

    val applicationComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerApplicationComponent.builder().application(this).build()
    }
}