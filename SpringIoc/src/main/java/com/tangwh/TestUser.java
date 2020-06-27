package com.tangwh;

import com.tangwh.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/25 9:23
 */
public class TestUser {

    public static void main(String[] args) {
        //  本来是 控制权在这里
//        User user = new User();
//        System.out.println("user:" + user);

        //  现在 控制权在配置文件中配置后 交给Spring容器 加载配置文件

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //        m1(context);
//        User user2 = context.getBean("user2", User.class);
//        System.out.println(user2);

//        m3(context);


        //对象注入
        User user4 = context.getBean("user5", User.class);
        System.out.println(user4);

    }

    private static void m3(ClassPathXmlApplicationContext context) {
        User user3 = context.getBean("user3", User.class);
        System.out.println(user3);
    }

    private static void m1(ClassPathXmlApplicationContext context) {
        // 问容器 要 1
        User user = (User) context.getBean("user");

        System.out.println(user);
        // 问容器 要 2
        User user1 = context.getBean("user", User.class);
        System.out.println(user1);
        // 问容器 要 3
        User user2 = context.getBean(User.class);
        System.out.println(user2);
    }
}
