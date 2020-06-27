package com.tangwh;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/26 13:56
 */

import okhttp3.OkHttpClient;

/**
 * 静态工厂实例注入
 */
public class OkHttpStaticFactory {

    private static OkHttpClient okHttpClient;


    public static OkHttpClient getInstance() {
        if (okHttpClient == null){
            okHttpClient=new OkHttpClient.Builder().build();
        }

        return okHttpClient ;
    }


}
