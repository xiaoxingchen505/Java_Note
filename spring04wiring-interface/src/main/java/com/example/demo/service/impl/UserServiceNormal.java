package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Component;


@Component
public class UserServiceNormal implements UserService {

    @Override
    public void add() {
        System.out.println("添加用户");
    }
}
