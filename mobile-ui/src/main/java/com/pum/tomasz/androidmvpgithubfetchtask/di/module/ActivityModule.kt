package com.pum.tomasz.androidmvpgithubfetchtask.di.module

import com.pum.tomasz.androidmvpgithubfetchtask.BaseActivity
import com.pum.tomasz.androidmvpgithubfetchtask.di.scope.ForActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity: BaseActivity) {
    @Provides @ForActivity fun provideActivity() = activity

}