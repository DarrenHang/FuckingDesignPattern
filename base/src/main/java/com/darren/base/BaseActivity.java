package com.darren.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置布局
        setContentView();

        //初始化 View
        initView();

        //初始化点击事件
        initClickListener();

        //初始化数据
        initData();
    }

    //设置布局
    protected abstract void setContentView();

    //初始化 View
    protected abstract void initView();

    //初始化点击事件
    protected abstract void initClickListener();

    //初始化数据
    protected abstract void initData();
}
