package com.pum.tomasz.androidmvpgithubfetchtask.navigation

import android.content.Context
import com.pum.tomasz.androidmvpgithubfetchtask.features.users.UsersActivity
import javax.inject.Inject

class Navigator @Inject constructor() {

    fun showMain(context:Context) = showGithubUsers(context)

    private fun showGithubUsers(context: Context) =
            context.startActivity(UsersActivity.callingIntent(context))

}