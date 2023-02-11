package com.example.usersgse.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.usersgse.R;
import com.example.usersgse.interfaces.InterfaceMainActivity;
import com.example.usersgse.presenters.PresenterMainActivity;

public class ViewMainActivity extends AppCompatActivity implements InterfaceMainActivity.ViewActivity{
    InterfaceMainActivity.PresenterActivity presenterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenterActivity = new PresenterMainActivity(this);
        presenterActivity.bringRetrofitResUsers();
    }
}