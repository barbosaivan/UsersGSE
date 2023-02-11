package com.example.usersgse.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.usersgse.R;
import com.example.usersgse.adapters.UserAdapter;
import com.example.usersgse.interfaces.InterfaceMainActivity;
import com.example.usersgse.models.Users;
import com.example.usersgse.presenters.PresenterMainActivity;

import java.util.ArrayList;

public class ViewMainActivity extends AppCompatActivity implements InterfaceMainActivity.ViewActivity{
    private UserAdapter userAdapter;
    private ArrayList<Users> users;

    InterfaceMainActivity.PresenterActivity presenterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        presenterActivity.bringRetrofitResUsers();
    }

    public void init(){
        presenterActivity = new PresenterMainActivity(this);
        users = new ArrayList<>();
        userAdapter = new UserAdapter();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void valorList(ArrayList<Users> users) {
        userAdapter.addUsers(users);
    }
}