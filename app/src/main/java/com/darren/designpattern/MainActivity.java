package com.darren.designpattern;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.darren.skin.BaseSkinActivity;

public class MainActivity extends BaseSkinActivity {

    private TextView tvHelloWorld;

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        tvHelloWorld = findViewById(R.id.tv_hello_world);
    }

    @Override
    protected void initClickListener() {
        tvHelloWorld.setOnClickListener(onClickListener);
    }

    @Override
    protected void initData() {
        tvHelloWorld.setText("Hello Darren");
    }

    private View.OnClickListener onClickListener = view -> {
        if (view.getId() == R.id.tv_hello_world) {
            Toast.makeText(getBaseContext(), "Hello Darren", Toast.LENGTH_SHORT).show();
        }
    };

}