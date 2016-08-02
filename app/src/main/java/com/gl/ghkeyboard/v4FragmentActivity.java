package com.gl.ghkeyboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


public class v4FragmentActivity extends AppCompatActivity {

    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        init();

        initView();
    }



    private void init() {
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
    }

    private void initView() {
        transaction.replace(R.id.content,new V4Fragmernt());
        transaction.commit();
    }
}
