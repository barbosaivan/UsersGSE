package com.example.usersgse.utils;
import com.example.usersgse.interfaces.UsersInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 * Project: UsersGSE
 * From: com.example.usersgse.utils
 * Create by Ivan Barbosa on 11/02/2023 at 11:25 a. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 */

public class Service {
    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder().baseUrl(Credentials.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static UsersInterface userInterface = retrofit.create(UsersInterface.class);

    public static UsersInterface getUsers() {
        return userInterface;
    }
}
