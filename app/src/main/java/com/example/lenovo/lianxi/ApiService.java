package com.example.lenovo.lianxi;

/**
 * Created by Lenovo on 2017/11/16.
 */

import com.example.lenovo.lianxi.bean.bean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public  interface ApiService {
    /**
     * @param
     * @return
     */
    @GET("ting?method=baidu.ting.billboard.billList&type=1&size=10&offset=0")
    Observable<bean> getNoParams();
//    /**
//     * 结合RxJava
//     * @param user
//     * @return
//     * https://api.github.com/users/forever
//     */
//    @GET("users/{user}")
//    Observable<bean>  getHasParams(@Path("user")String user);
}
