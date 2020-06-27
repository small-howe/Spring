package com.tangwh;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/27 14:36
 */

import com.tangwh.javaconfig.JavaConfig;
import com.tangwh.javaconfig.SayHello;
import com.tangwh.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Java配置测试类
 */

public class JavaConfigTest {

    public static void main(String[] args) {

        // 加载配置类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        // name 就是 配置 的方法名
        SayHello sayhello = ctx.getBean("sayHello", SayHello.class);
        System.out.println(sayhello.sayhello("javaboy"));


        System.out.println("------@Service--------");

        //@Service 注入
        UserService bean = ctx.getBean(UserService.class);
        List<String> allUsers = bean.getAllUsers();
        System.out.println(allUsers);
    }

}
