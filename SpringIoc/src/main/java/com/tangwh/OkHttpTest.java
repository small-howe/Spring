package com.tangwh;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/26 12:53
 */

import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * OkHttp
 */
public class OkHttpTest {

    public static void main(String[] args) {

//        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();  一般使用 构造

// 静态工厂注入
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OkHttpClient okHttpClient = ctx.getBean("httpClient", OkHttpClient.class);

        Request request = new Request.Builder().get().url("http://www.baidu.com").build();


        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                //请求失败的回调

                System.out.println(e.getMessage());

            }

            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {


                System.out.println(response.body().string());


                System.out.println();

            }
        });


    }
}
