package com.amar.constraintlyt

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.recyclerview.widget.DiffUtil
import com.amar.constraintlyt.databinding.ItemContactBinding
import com.bumptech.glide.Glide

class RecyclerViewAdapterBt(private var contactList: List<Contact>,
                            private var context: Context) : RecyclerView.Adapter<RecyclerViewAdapterBt.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemContactBinding = ItemContactBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(itemContactBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contactList[position]
        holder.itemContactBinding.tvName.text = contact.name
        holder.itemContactBinding.tvDate.text = contact.date
        Glide.with(context).load(contact.imageURL).circleCrop().into(holder.itemContactBinding.ivContact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    inner class ViewHolder(var itemContactBinding: ItemContactBinding) : RecyclerView.ViewHolder(itemContactBinding.root)

    fun setData(newContactList: List<Contact>){
        val diffUtil = MyDiffUtil(contactList, newContactList)
        val diffResults = DiffUtil.calculateDiff(diffUtil)
        contactList = newContactList
        diffResults.dispatchUpdatesTo(this)
    }
}
