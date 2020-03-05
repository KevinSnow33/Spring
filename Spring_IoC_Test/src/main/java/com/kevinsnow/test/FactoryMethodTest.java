package com.kevinsnow.test;

import com.kevinsnow.factorymethod.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMethodTest {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryMethod.xml");
        //1.配置 [静态工厂方法] 创建Car对象
        Car carOfStatic = (Car) applicationContext.getBean("carOfStatic");
        System.out.println("carOfStatic" + carOfStatic);

        //2.配置 [静态工厂方法] 创建Car对象
        Car carOfInstance = (Car) applicationContext.getBean("carOfInstance");
        System.out.println("carOfInstance" + carOfInstance);



    }
}
