package com.pum.tomasz.androidmvpgithubfetchtask.di.component

import com.pum.tomasz.androidmvpgithubfetchtask.di.module.ActivityModule
import com.pum.tomasz.androidmvpgithubfetchtask.di.scope.ForActivity
import dagger.Subcomponent

@ForActivity
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivitySubcomponent {

    @Subcomponent.Builder
    interface Builder : SubcomponentBuilder<ActivitySubcomponent> {
        fun activityMopdule(activityModule: ActivityModule): Builder
    }
}
