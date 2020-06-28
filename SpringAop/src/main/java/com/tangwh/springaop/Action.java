package com.tangwh.springaop;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 11:12
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解  切点: 要在哪里打印日志
 */
@Target(ElementType.METHOD)// 使用范围 方法上
@Retention(RetentionPolicy.RUNTIME) // 运行的时候 存在
public @interface Action {
}
