package com.pum.tomasz.androidmvpgithubfetchtask.features.users

import android.content.Context
import android.content.Intent
import com.pum.tomasz.androidmvpgithubfetchtask.BaseActivity

class UsersActivity : BaseActivity() {

    companion object {
        fun callingIntent(context: Context) = Intent(context, UsersActivity::class.java)
    }

    override fun fragment() = UsersFragment()
}
