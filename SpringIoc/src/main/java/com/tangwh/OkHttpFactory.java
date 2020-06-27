package com.tangwh;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/26 14:04
 */

import okhttp3.OkHttpClient;

/**
 * 实例工厂方法注入
 */
public class OkHttpFactory {


    private  OkHttpClient okHttpClient;


    public  OkHttpClient getInstance() {
        if (okHttpClient == null){
            okHttpClient=new OkHttpClient.Builder().build();
        }

        return okHttpClient ;
    }
}
