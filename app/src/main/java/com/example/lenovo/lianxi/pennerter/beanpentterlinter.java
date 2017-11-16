package com.example.lenovo.lianxi.pennerter;

import com.example.lenovo.lianxi.bean.bean;
import com.example.lenovo.lianxi.mondel.beanmondel;
import com.example.lenovo.lianxi.mondel.beanmondellinter;
import com.example.lenovo.lianxi.onlintererntlin;
import com.example.lenovo.lianxi.view.beanview;
/**
 * Created by Lenovo on 2017/11/16.
 */
public class beanpentterlinter implements breapenttes,onlintererntlin {
    beanview beanview;
    beanmondel beanmondel;
    public beanpentterlinter(beanview beanview) {
        this.beanview = beanview;
        beanmondel=new beanmondellinter();
    }
    @Override
    public void re() {
             beanmondel.getdata(this);
    }
    @Override
    public void onsunness(bean bean) {
            beanview.recy(bean);
    }
}
