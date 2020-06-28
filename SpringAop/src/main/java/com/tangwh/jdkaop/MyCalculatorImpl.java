package com.tangwh.jdkaop;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 10:19
 */

/**
 * 计算器 接口实现类
 */
public class MyCalculatorImpl implements MyCalculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
