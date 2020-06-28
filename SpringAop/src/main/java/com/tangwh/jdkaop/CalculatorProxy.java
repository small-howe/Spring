package com.tangwh.jdkaop;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 10:26
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class CalculatorProxy {

    public static Object getInstance(final MyCalculatorImpl myCalculator){

        //获取新的代理对象
        return Proxy.newProxyInstance(CalculatorProxy.class.getClassLoader(),
                myCalculator.getClass().getInterfaces(), new InvocationHandler(){
                    /**
                     *
                     * @param proxy 代理对象
                     * @param method 代理的方法
                     * @param args 方法的参数
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName()+":这个方法开始执行了");

                        Object invoke = method.invoke(myCalculator, args);
                        System.out.println(method.getName()+":这个方法结束了");
                        return invoke;


                    }
                });
    }

}
