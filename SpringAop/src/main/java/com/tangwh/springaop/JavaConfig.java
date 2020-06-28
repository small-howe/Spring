package com.tangwh.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 11:32
 */
@Configuration
@ComponentScan
// 开启自动代理
@EnableAspectJAutoProxy
public class JavaConfig {
}
