package com.kevinsnow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        System.out.println(applicationContext.getBean("stu1"));
        System.out.println(applicationContext.getBean("stu2"));
    }
}
