package com.example.usersgse.adapters;/*
 * Project: UsersGSE
 * From: com.example.usersgse.adapters
 * Create by Ivan Barbosa on 11/02/2023 at 2:59 p. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 */

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.usersgse.R;
import com.example.usersgse.models.Users;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private final ArrayList<Users> listUsers;

    public UserAdapter() {
        listUsers = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       android.view.View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_users, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Users user = listUsers.get(position);
        holder.text_id.setText(String.valueOf(user.getId()));
        holder.textName.setText(user.getName());
        holder.textUser.setText(user.getEmail());
        holder.textEmail.setText(user.getEmail());
        holder.textPhone.setText(user.getPhone());
        holder.textWebsite.setText(user.getEmail());
    }

    @Override
    public int getItemCount() {
        return listUsers.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void addUsers(List<Users> users){
        listUsers.addAll(users);
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView text_id, textName, textUser,  textEmail,  textPhone, textWebsite;
        public ViewHolder(@NonNull android.view.View itemView) {
            super(itemView);

            text_id = itemView.findViewById(R.id.tv_id);
            textName = itemView.findViewById(R.id.tvNameResponse);
            textUser = itemView.findViewById(R.id.tvUserNameResponse);
            textEmail = itemView.findViewById(R.id.tvEmailResponse);
            textPhone = itemView.findViewById(R.id.tvPhoneResponse);
            textWebsite = itemView.findViewById(R.id.tvwebsiteResponse);
        }
    }
}
