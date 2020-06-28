package com.tangwh.jdbc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 22:46
 */
public class MainTest {


    JdbcTemplate jdbcTemplate;
    private AccountService accountService;


    /**
     * @Before 是单元测试里面的 不是SpringAop中的
     */
    @Before
    public void befoire() {

//        m1();
        m2();


    }

    /**
     * 配置文件方式 注入
     */
    private void m2() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = ctx.getBean(JdbcTemplate.class);
    }

    /**
     * Java配置
     */
    private void m1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        jdbcTemplate = ctx.getBean(JdbcTemplate.class);

        accountService = ctx.getBean(AccountService.class);
    }


    /**
     * 增删改 都是update
     * 添加操作
     */
    @Test
    public void testadd() {


        jdbcTemplate.update("insert  into user(username,address,favorites) values(?,?,?)", "javaboy", "陕西西安", "coding");

    }


    /**
     * 修改操作
     */
    @Test
    public void testUpdate() {

        jdbcTemplate.update("update user set username = ? where id=?;", "howe", 1);
    }


    /**
     * 删除操作
     */
    @Test
    public void testDelete() {

        jdbcTemplate.update("delete from user where id = ?;", "1");
    }


    /**
     * 查询
     */
    @Test
    public void testGet() {

        List<User> query = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<User>(User.class));

        System.out.println(query);

    }

    /**
     * 转账操作
     * Spring事务
     */
    @Test
    @Transactional
    public void testAffair(){

        accountService.updateMoney();

    }


}
