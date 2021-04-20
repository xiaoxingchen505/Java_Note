package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;

public class UserDaoNormal implements UserDao {

    @Override
    public void add() {
        System.out.println("添加用户到数据库中....");
    }
}
