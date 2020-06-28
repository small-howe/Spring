package com.tangwh;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/27 14:36
 */

import com.tangwh.javaconfig.JavaConfig;
import com.tangwh.javaconfig.SayHello;
import com.tangwh.mapper.ShowCmd;
import com.tangwh.service.UserService;
import javafx.scene.chart.PieChart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Java配置测试类
 */

public class JavaConfigTest {

    public static void main(String[] args) {

        // 加载配置类
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
//        m1(ctx);

//        System.out.println("------@Service--------");
//        m2(ctx);

//        System.out.println("----------------条件注入 根据当前系统环境 获取不同的实例Bean-------------");
//        m3(ctx);

//        System.out.println("--------环境切换-------------");
//        m4();


        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.setConfigLocation("applicationContext.xml");
        ctx.refresh();
//        Datasource bean = ctx.getBean(Datasource.class);
//        System.out.println(bean);
//        单独的Bean 区分id和name的区别
        Datasource ds = ctx.getBean("ds", Datasource.class);
        System.out.println(ds);

    }

    private static void m4() {
        // 先设置当前环境信息
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.register(JavaConfig.class);
        //刷新
        ctx.refresh();
        Datasource bean = ctx.getBean(Datasource.class);
        System.out.println(bean);
    }

    private static void m3(AnnotationConfigApplicationContext ctx) {
        //         条件注入 根据当前系统环境 获取不同的实例Bean

        ShowCmd cmd = (ShowCmd) ctx.getBean("cmd");
        String s = cmd.showCmd();
        System.out.println(s);
    }

    private static void m2(AnnotationConfigApplicationContext ctx) {
        //@Service 注入
        UserService bean = ctx.getBean(UserService.class);
        List<String> allUsers = bean.getAllUsers();
        System.out.println(allUsers);
    }

    private static void m1(AnnotationConfigApplicationContext ctx) {
        // name 就是 配置 的方法名
        SayHello sayhello = ctx.getBean("sayHello", SayHello.class);
        System.out.println(sayhello.sayhello("javaboy"));
    }

}
