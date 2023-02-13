package com.example.usersgse.presenters;
/*
 * Project: UsersGSE
 * From: com.example.usersgse.presenters
 * Create by Ivan Barbosa on 11/02/2023 at 11:15 a. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 */

import com.example.usersgse.interfaces.InterfaceMainActivity;
import com.example.usersgse.models.ModelMainActivity;
import com.example.usersgse.models.Users;

import java.util.ArrayList;

public class PresenterMainActivity implements  InterfaceMainActivity.PresenterActivity{

    InterfaceMainActivity.ModelActivity modelActivity;
    InterfaceMainActivity.ViewActivity viewActivity;

    public PresenterMainActivity(InterfaceMainActivity.ViewActivity viewActivity) {
        this.viewActivity = viewActivity;
        this.modelActivity = new ModelMainActivity(this);
    }

    @Override
    public void sendRetrofitResUsers(ArrayList<Users> list) {
        viewActivity.valorList(list);
    }

    @Override
    public void bringRetrofitResUsers() {
        modelActivity.retrofitResUsers();
    }

}
