package com.pum.tomasz.androidmvpgithubfetchtask.mapper

import com.pum.tomasz.androidmvpgithubfetchtask.model.UserView
import com.pum.tomasz.androidmvpgithubfetchtask.model.UserViewModel

class UsersMapper : Mapper<UserView, UserViewModel> {

    override fun mapToViewModel(type: UserView) = UserViewModel(type.id, type.login)
}