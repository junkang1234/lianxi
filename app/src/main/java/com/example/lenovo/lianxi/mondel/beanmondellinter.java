package com.example.lenovo.lianxi.mondel;


import android.util.Log;

import com.example.lenovo.lianxi.ApiService;
import com.example.lenovo.lianxi.bean.bean;
import com.example.lenovo.lianxi.onlintererntlin;
import com.example.lenovo.lianxi.utils.RetrofitUtils;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Lenovo on 2017/11/16.
 */

public class beanmondellinter implements beanmondel {

    @Override
    public void getdata(onlintererntlin linten) {
        Log.d("beanmondellinter", "111");
        ApiService apiService = RetrofitUtils.getInstance().getApiService("http://tingapi.ting.baidu.com/v1/restserver/", ApiService.class);
        Observable<bean> params = apiService.getNoParams();
        params.subscribeOn(Schedulers.io())//指定IO做耗时操作
                .observeOn(AndroidSchedulers.mainThread())//指定更新UI在主线程
                .subscribe(new Observer<bean>() {
                    @Override
                    public void onCompleted() {//完成

                    }

                    @Override
                    public void onError(Throwable e) {//失败
                        Log.i("x", e.getMessage());
                    }

                    @Override
                    public void onNext(bean bean) {//消费事件
                        Log.i("xxx", bean+"");
                        List<bean.SongListBean> song_list =bean.getSong_list();
                        for (int i = 0; i < song_list.size(); i++) {
                            bean.SongListBean songListBean = song_list.get(i);
                            String language = songListBean.getLanguage();
                            Log.i("xx", language);
                        }

                    }
                });
    }
}
