package com.example.demo.soundsystem;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CompactDiscTest {


    @Autowired
    private CompactDisc compactDisc1;

    @Autowired
    private CompactDisc compactDisc2;
    @Autowired
    private CompactDisc compactDisc3;

    @Test
    public void test01(){
        compactDisc1.play();
//        compactDisc2.play();
//        compactDisc3.play();
    }
}
