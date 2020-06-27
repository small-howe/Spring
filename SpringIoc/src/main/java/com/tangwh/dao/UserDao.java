package com.tangwh.dao;

import org.springframework.stereotype.Repository;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/27 17:55
 */
@Repository  // 或者@mapper
public class UserDao {


    public String hello() {
        return "Hello";
    }

}
