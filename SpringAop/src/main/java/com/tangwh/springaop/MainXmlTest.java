package com.tangwh.springaop;

import com.tangwh.springaop.service.MyCalculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 16:58
 */
public class MainXmlTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyCalculator bean = ctx.getBean(MyCalculator.class);
     bean.add(4, 6);
     bean.main(5, 4);

    }
}
