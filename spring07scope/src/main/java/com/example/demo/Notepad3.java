package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton")
//@Scope(scopeName="prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad3 {

    public Notepad3() {
        super();
        System.out.println("Notepad3的构造函数....." + this.toString());
    }

    @PostConstruct
    public void init(){
        System.out.println("Notepad3的初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Notepad3的销毁方法");
    }
}
