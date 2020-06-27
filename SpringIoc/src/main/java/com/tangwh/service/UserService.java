package com.tangwh.service;

import com.tangwh.dao.UserDao;
import com.tangwh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/27 16:59
 */
@Service
public class UserService {


    @Autowired            //通过类型去注入
    UserDao userDao;

    public List<String> getAllUsers(){

        String hello = userDao.hello();
        System.out.println(hello);

        List<String> users = new ArrayList<String>();
        for (int i = 0; i <10 ; i++) {

            users.add("javaboy"+i);
        }

        return users;
    }
}
