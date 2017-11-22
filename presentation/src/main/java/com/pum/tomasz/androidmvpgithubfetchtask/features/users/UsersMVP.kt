package com.pum.tomasz.androidmvpgithubfetchtask.features.users

import com.pum.tomasz.androidmvpgithubfetchtask.model.UserView

interface UsersMVP {

    interface Presenter {
        fun loadUsers()
        fun attachView(view: View?)
    }

    interface View {
        fun showUsers(users: List<UserView>)
        fun showEmpty()
        fun showError()
    }
}