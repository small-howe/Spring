package com.tangwh.springaop;


import com.tangwh.springaop.service.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 11:33
 */
public class MainTest {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

        MyCalculator bean = ctx.getBean(MyCalculator.class);
        bean.add(1, 2);
        bean.main(1, 2);
    }

}
