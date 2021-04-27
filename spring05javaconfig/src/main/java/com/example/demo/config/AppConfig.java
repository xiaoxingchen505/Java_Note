package com.example.demo.config;


import com.example.demo.dao.UserDao;
import com.example.demo.dao.impl.UserDaoCache;
import com.example.demo.dao.impl.UserDaoNormal;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceNormal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean("normal")
    public UserDao userDaoNormal(){
        System.out.println("创建UserDaoNormal对象");
        return new UserDaoNormal();
    }

    @Bean("cache")
    public UserDao userDaoCache(){
        System.out.println("创建UserDaoCache对象");
        return new UserDaoCache();
    }

    @Bean
    public UserService userServiceNormal(@Qualifier("cache") UserDao userDao){
        System.out.println("创建UserService对象");
        UserServiceNormal userService = new UserServiceNormal();
        // userService.setUserDao(userDao);
        userService.prepare(userDao);
        return userService;
    }
}
