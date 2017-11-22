package com.pum.tomasz.androidmvpgithubfetchtask.features.users

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.pum.tomasz.androidmvpgithubfetchtask.R
import com.pum.tomasz.androidmvpgithubfetchtask.model.UserViewModel
import javax.inject.Inject

class UsersAdapter @Inject constructor() : RecyclerView.Adapter<UsersAdapter.UserViewHolder>() {

    var users: List<UserViewModel> = arrayListOf()

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.idText.text = user.id.toString()
        holder.loginText.text = user.login
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.view_item_user, parent, false)
        return UserViewHolder(itemView)
    }

    override fun getItemCount() = users.size

    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var idText: TextView
        var loginText: TextView

        init {
            idText = view.findViewById(R.id.viu_id)
            loginText = view.findViewById(R.id.viu_login)
        }
    }

}
