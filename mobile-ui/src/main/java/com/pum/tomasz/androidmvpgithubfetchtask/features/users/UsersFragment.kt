package com.pum.tomasz.androidmvpgithubfetchtask.features.users

import com.pum.tomasz.androidmvpgithubfetchtask.BaseFragment
import com.pum.tomasz.androidmvpgithubfetchtask.R
import com.pum.tomasz.androidmvpgithubfetchtask.mapper.UsersMapper
import com.pum.tomasz.androidmvpgithubfetchtask.model.UserView
import kotlinx.android.synthetic.main.fragment_users.*
import javax.inject.Inject

class UsersFragment : BaseFragment(), UsersMVP.View {

    @Inject lateinit var usersAdapter: UsersAdapter
    @Inject lateinit var presenter: UsersMVP.Presenter
    @Inject lateinit var mapper: UsersMapper

    override fun layoutId() = R.layout.fragment_users

    override fun showUsers(users: List<UserView>) {
        usersAdapter.users = users.map { mapper.mapToViewModel(it) }
        usersAdapter.notifyDataSetChanged()
    }

    override fun showEmpty() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun showError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun initializeView() {
        ar_list.adapter = usersAdapter
    }

    private fun loadUsers() = presenter.loadUsers()

}