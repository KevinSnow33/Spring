package com.kevinsnow.test;

import com.kevinsnow.Caculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {
    public static void main(String[] args) {
        //让 Spring 框架结合切面类和目标类⾃自动生成动态代理对象时，采用正常的IoC方式获取代理对象即可
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Caculator calProxy = (Caculator)applicationContext.getBean("caculatorImpl");

        //calProxy已经是代理对象，调用方法时会将代理中的非业务代码(输出日志代码)一起执行
        calProxy.add(1,2);
        calProxy.sub(1,2);
        calProxy.mul(1,2);
        calProxy.div(1,2);
    }



}
