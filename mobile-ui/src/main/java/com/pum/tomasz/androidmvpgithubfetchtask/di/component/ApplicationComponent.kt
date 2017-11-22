package com.pum.tomasz.androidmvpgithubfetchtask.di.component

import com.pum.tomasz.androidmvpgithubfetchtask.AndroidApplication
import com.pum.tomasz.androidmvpgithubfetchtask.di.module.ApplicationBinders
import com.pum.tomasz.androidmvpgithubfetchtask.di.module.ApplicationModule
import com.pum.tomasz.androidmvpgithubfetchtask.navigation.RouteActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, ApplicationBinders::class))
interface ApplicationComponent {

    fun inject(routeActivity: RouteActivity)

    @Component.Builder
    interface Builder {
        fun build(): ApplicationComponent
        @BindsInstance
        fun application(application: AndroidApplication): Builder
    }

    fun subComponentBuilders(): Map<Class<*>, Provider<SubcomponentBuilder<*>>>
}