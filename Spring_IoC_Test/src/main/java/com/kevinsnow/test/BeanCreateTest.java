package com.kevinsnow.test;

import com.kevinsnow.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCreateTest {
    public static void main(String[] args) {
        //IoC方式创建对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanCreate.xml");
        Student student = (Student)applicationContext.getBean("stu1");
        System.out.println(student);
        //传统方式创建对象
        Student student1 = new Student();
        System.out.println(student1);
    }
}
