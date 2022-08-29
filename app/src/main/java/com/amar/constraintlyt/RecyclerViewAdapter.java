package com.amar.constraintlyt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.constraintlyt.databinding.ItemContactBinding;
import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<Contact> contactList;
    Context context;
    public RecyclerViewAdapter(List<Contact> contactList, Context context) {
        this.contactList = contactList;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemContactBinding itemContactBinding = ItemContactBinding.inflate(layoutInflater,parent,false);
        return new ViewHolder(itemContactBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.itemContactBinding.tvName.setText(contact.getName());
        holder.itemContactBinding.tvDate.setText(contact.getDate());
        Glide.with(this.context).load(contact.getImageURL()).circleCrop().into(holder.itemContactBinding.ivContact);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemContactBinding itemContactBinding;
        public ViewHolder(@NonNull ItemContactBinding itemContactBinding) {
            super(itemContactBinding.getRoot());
            this.itemContactBinding = itemContactBinding;
        }
    }
}
