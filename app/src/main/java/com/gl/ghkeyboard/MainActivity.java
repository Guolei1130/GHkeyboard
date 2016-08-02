package com.gl.ghkeyboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gl.library.GH;

public class MainActivity extends AppCompatActivity {

    private Button button,v4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GH.init(this);

        initView();
    }

    private void initView() {
        button = (Button) findViewById(R.id.fragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FragmentActivity.class);
                startActivity(intent);
            }
        });

        v4 = (Button) findViewById(R.id.v4fragment);

        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,v4FragmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
