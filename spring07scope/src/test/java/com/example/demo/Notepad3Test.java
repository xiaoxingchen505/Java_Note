package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class Notepad3Test {


    @Autowired
    private Notepad3 notepad1;
//
//    @Autowired
//    private Notepad3 notepad2;

    /**
     * 无论我们是否去主动获取Bean对象，spring上下文一加载就会创建Bean对象
     * 无论获取多少次，拿到都是同一个对象
     */
    @Test
    public void test01(){
//
//       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//       Object notepad1 = (Notepad)context.getBean("notepad");
//       Object notepad2 = (Notepad)context.getBean("notepad");
//        System.out.println(notepad1 == notepad2);
    }
}
