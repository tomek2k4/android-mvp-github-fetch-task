package com.pum.tomasz.androidmvpgithubfetchtask.framework.extensions

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) =
        beginTransaction().func().commit()
