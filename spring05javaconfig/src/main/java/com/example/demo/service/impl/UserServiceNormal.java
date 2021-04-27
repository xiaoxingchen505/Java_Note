package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;

public class UserServiceNormal implements UserService {

    private UserDao userDao;

    public UserServiceNormal() {
        super();
    }

    public UserServiceNormal(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void add(){
        userDao.add();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void prepare(UserDao userDao){
        this.userDao = userDao;
    }
}
