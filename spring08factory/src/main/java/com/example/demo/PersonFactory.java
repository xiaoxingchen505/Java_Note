package com.example.demo;

public class PersonFactory {

    /*
     * 静态工厂方法
     * @return
     */
    public static Person createPersonal() {
        System.out.println("静态工厂创建person...");
        return new Person();
    }

    public Person createPerson2(){
        System.out.println("实力工厂创建Person...");
        return new Person();
    }
}
