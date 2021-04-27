package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;

public class UserDaoCache implements UserDao {

    @Override
    public void add(){
        System.out.println("添加用户到缓存中......");
    }
}
