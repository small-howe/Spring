package com.tangwh.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/28 23:15
 */

/**
 * Spring事务 转账操作
 */
@Service
public class AccountService {

    @Autowired
    JdbcTemplate jdbcTemplate;


    /**
     * 转账 方法
     */
    public void updateMoney(){

        jdbcTemplate.update("update accountuser set money=money-500 where username =? ;","zhangsan");
        int i = 1/0;

        jdbcTemplate.update("update accountuser set money=money+500 where username =? ;","lisi");

    }


}
