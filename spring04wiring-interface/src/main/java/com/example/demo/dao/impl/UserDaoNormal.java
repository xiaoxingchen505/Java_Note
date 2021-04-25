package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoNormal implements UserDao {

    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        userDao.add();
    }
}
