package com.example.android.navigation.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.widget.DecorContentParent
import androidx.recyclerview.widget.RecyclerView
import com.example.android.navigation.data.User

class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
    private  var userList = emptyList<User>()

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){ }

    override fun onCreateViewHolder(parent: ViewGroup):MyViewHolder{
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, posiyion)
}