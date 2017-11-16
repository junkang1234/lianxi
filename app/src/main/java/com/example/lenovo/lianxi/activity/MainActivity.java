package com.example.lenovo.lianxi.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.lianxi.R;
import com.example.lenovo.lianxi.bean.bean;
import com.example.lenovo.lianxi.pennerter.beanpentterlinter;
import com.example.lenovo.lianxi.view.beanview;

public class MainActivity extends AppCompatActivity implements beanview {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        beanpentterlinter beanpentterlinter = new beanpentterlinter(this);
        beanpentterlinter.re();
    }

    @Override
    public void recy(bean bean) {

    }
}
