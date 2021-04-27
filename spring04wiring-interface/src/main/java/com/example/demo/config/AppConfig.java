package com.example.demo.config;

import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import com.example.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.example.demo")
// @ComponentScan(basePackages = {"com.example.demo.web","com.example.demo.service","com.example.demo.dao"})
@ComponentScan(basePackageClasses = {UserController.class, UserService.class, UserDao.class})
public class AppConfig {
}
