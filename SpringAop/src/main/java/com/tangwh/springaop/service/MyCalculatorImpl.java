package com.tangwh.springaop.service;

import org.springframework.stereotype.Component;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 11:04
 */

/**
 * 给这俩方法 不改变源码的前提下 添加日志
 * 有两种方式 注解 和 规则
 * 一般开发中 都是使用规则
 */
@Component
public class MyCalculatorImpl implements MyCalculator {

    //自定义注解方式 @Action
    @Override
//    @Action
    public Integer add(int a, int b) {
//        int i =1/0;
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    @Override
//    @Action
    public void main(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));

    }
}
