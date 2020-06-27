package com.tangwh.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/27 14:35
 */

/**
 * Java配置类  @Configuration 配置类的 做用 就类似于 applicationContext.xml
 */
@Configuration
@ComponentScan(basePackages = "com.tangwh")
public class JavaConfig {


    @Bean
    SayHello sayHello(){

        System.out.println("--------------init------------");
        return new SayHello();
    }
}
