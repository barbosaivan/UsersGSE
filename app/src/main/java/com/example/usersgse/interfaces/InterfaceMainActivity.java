package com.example.usersgse.interfaces;/*
 * Project: UsersGSE
 * From: com.example.usersgse.interfaces
 * Create by Ivan Barbosa on 11/02/2023 at 11:16 a. m.
 * Linkedin: https://www.linkedin.com/in/ivanbarbosaortega/
 */

import com.example.usersgse.models.Users;

import java.util.ArrayList;

public interface InterfaceMainActivity {

    interface ViewActivity {

    }

    interface PresenterActivity {
        public void bringRetrofitResUsers();

        public void sendRetrofitResUsers(ArrayList<Users> list);


    }

    interface ModelActivity {
        public void RetrofitResUsers();
    }
}
