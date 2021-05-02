package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Notepad2TestAutowired {

    @Autowired
    private Notepad2 notepad1;

//    @Autowired
//    private Notepad2 notepad2;

    /**
     * scope ="singleton"
     * 无论我们是否去主动获取或者注入Bean对象，spring上下文一加载就会创建Bean对象
     * 无论获取多少次，拿到都是同一个对象
     *
     * scope = "prototype"
     *  spring上下文加载的时候不会创建bean对象
     *  每次注入，都会拿到不同的bean对象
     */
    @Test
    public void test01(){
//        System.out.println(notepad1 == notepad2);
    }
}
