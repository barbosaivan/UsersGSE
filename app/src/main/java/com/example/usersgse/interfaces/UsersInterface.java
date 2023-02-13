package com.example.usersgse.interfaces;
/*
 * Project: UsersGSE
 * From: com.example.usersgse.interfaces
 * Create by Ivan Barbosa on 11/02/2023 at 11:26 a. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 */

import com.example.usersgse.models.Users;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UsersInterface {

    @GET("users")
    Call<ArrayList<Users>> getUsers();

}
