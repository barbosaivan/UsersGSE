package com.example.usersgse.models;/*
 * Project: UsersGSE
 * From: com.example.usersgse.models
 * Create by Ivan Barbosa on 11/02/2023 at 11:16 a. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 */

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.usersgse.interfaces.InterfaceMainActivity;
import com.example.usersgse.interfaces.UsersInterface;
import com.example.usersgse.utils.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ModelMainActivity implements InterfaceMainActivity.ModelActivity{

    InterfaceMainActivity.PresenterActivity presenterActivity;

    public ModelMainActivity(InterfaceMainActivity.PresenterActivity presenterActivity){
        this.presenterActivity = presenterActivity;
    }

    @Override
    public void RetrofitResUsers() {

        UsersInterface usersInterface = Service.getUsers();
        Call<ArrayList<Users>> resUsersCall = usersInterface.getUsers();

        resUsersCall.enqueue(new Callback<ArrayList<Users>>() {
            @Override
            public void onResponse(@NonNull Call<ArrayList<Users>> call, @NonNull Response<ArrayList<Users>> response) {
                if (response.code() == 200) {
                    Log.i("Name",response.toString());
                    if(response.body() != null){
                        ArrayList<Users> users = new ArrayList<>(response.body());
                        presenterActivity.sendRetrofitResUsers(users);
                    }
                } else {
                    try {
                            Log.v("Tag", "Error" + Objects.requireNonNull(response.errorBody()).string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<ArrayList<Users>> call, @NonNull Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
