package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("festival")
public class UserServiceFestival implements UserService {

    @Override
    public void add() {
        System.out.println("注册用户发送优惠劵");
    }
}
