package com.example.usersgse.models;/*
 * Project: UsersGSE
 * From: com.example.usersgse.models
 * Create by Ivan Barbosa on 11/02/2023 at 11:42 a. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 */

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResUsers {

    @SerializedName("")
    private ArrayList<Users> user;

    public ArrayList<Users> getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "ResUsers" +
                "user=" + user +
                '}';
    }
}
