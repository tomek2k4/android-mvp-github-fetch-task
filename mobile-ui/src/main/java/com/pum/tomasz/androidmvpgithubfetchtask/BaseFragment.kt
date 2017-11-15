package com.pum.tomasz.androidmvpgithubfetchtask

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import com.pum.tomasz.androidmvpgithubfetchtask.di.component.ApplicationComponent

abstract class BaseFragment : Fragment() {
    init {
        retainInstance = true
    }

    abstract fun layoutId(): Int

    val appComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (activity.application as AndroidApplication).applicationComponent
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater?.inflate(layoutId(), container, false)

    open fun onBackPressed() {}

    internal fun firstTimeCreated(savedInstanceState: Bundle?) = savedInstanceState == null
}