package com.gl.ghkeyboard;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public class FragmentActivity extends AppCompatActivity {

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
        manager = getFragmentManager();
        transaction = manager.beginTransaction();
    }

    private void initView() {
        transaction.replace(R.id.content,new Fragmernt());
        transaction.commit();
    }
}
