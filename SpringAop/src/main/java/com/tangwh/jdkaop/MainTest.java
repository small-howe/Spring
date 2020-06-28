package com.tangwh.jdkaop;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 10:36
 */

/**
 * java动态代理的Aop
 */
public class MainTest {

    public static void main(String[] args) {
        MyCalculatorImpl myCalculator= new MyCalculatorImpl();

        MyCalculator calculator = (MyCalculator) CalculatorProxy.getInstance(myCalculator);
        int add = calculator.add(4, 4);
        System.out.println(add);


    }
}
