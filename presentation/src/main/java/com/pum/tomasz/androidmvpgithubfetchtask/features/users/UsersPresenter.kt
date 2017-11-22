package com.pum.tomasz.androidmvpgithubfetchtask.features.users

import javax.inject.Inject

class UsersPresenter @Inject constructor() : UsersMVP.Presenter {
    private var view: UsersMVP.View? = null

    override fun attachView(view: UsersMVP.View?) {
        this.view = view
    }

    override fun loadUsers() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}