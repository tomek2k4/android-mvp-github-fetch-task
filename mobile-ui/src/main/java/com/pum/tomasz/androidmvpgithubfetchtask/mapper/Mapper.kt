package com.pum.tomasz.androidmvpgithubfetchtask.mapper

interface Mapper<in D, out V> {

    fun mapToViewModel(type: D): V

}
