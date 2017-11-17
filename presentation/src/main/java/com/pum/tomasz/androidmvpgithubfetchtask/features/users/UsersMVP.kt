package com.pum.tomasz.androidmvpgithubfetchtask.features.users

interface UsersMVP {

    interface Presenter {
        fun attachView(view: View)
        fun detachView()
        fun loadUsers()


    }

    interface View {

    }



}