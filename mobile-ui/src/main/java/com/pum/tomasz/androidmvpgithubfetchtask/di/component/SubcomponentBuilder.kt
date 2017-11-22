package com.pum.tomasz.androidmvpgithubfetchtask.di.component

interface SubcomponentBuilder<T> {
    fun build(): T
}