package com.pum.tomasz.androidmvpgithubfetchtask.di.component

import com.pum.tomasz.androidmvpgithubfetchtask.AndroidApplication
import com.pum.tomasz.androidmvpgithubfetchtask.navigation.RouteActivity
import com.pum.tomasz.androidmvpgithubfetchtask.di.module.ApplicationModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(routeActivity: RouteActivity)

    @Component.Builder
    interface Builder {
        fun build():ApplicationComponent
        @BindsInstance fun application(application: AndroidApplication):Builder
    }
}