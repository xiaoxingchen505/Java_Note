package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class NotepadTest {


    /**
     * 无论我们是否去主动获取Bean对象，spring上下文一加载就会创建Bean对象
     * 无论获取多少次，拿到都是同一个对象
     */
    @Test
    public void test01(){

       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Object notepad1 = (Notepad)context.getBean("notepad");
//       Object notepad2 = (Notepad)context.getBean("notepad");
//        System.out.println(notepad1 == notepad2);
//        context.close();
    }
}
