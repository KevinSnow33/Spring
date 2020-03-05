package com.kevinsnow.InvocationHandler;

import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler, org.springframework.cglib.proxy.InvocationHandler {

    //接收委托对象
    Object client = null;

    //绑定委托对象和代理对象并返回代理对象
    public Object bind(Object client){
        this.client = client;
        //此过程中创建代理对象，并把委托对象中的所有功能全部赋予代理对象（通过反射getInterfaces）
        return Proxy.newProxyInstance(client.getClass().getClassLoader(),client.getClass().getInterfaces(),this);
    }

    //proxy参数为代理对象，method是被调用的方法,args[]是方法形参。以上三个参数在
    // 相应方法调用时自动被传递到invoke方法中并执行invoke方法
    //比如方法调用：calProxy.add(1,2);  proxy就是calProxy，method就是.add（），args[]就是[1,2]
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //按需要打印日志或进行其他操作：
        System.out.println(method.getName() + "方法的参数是： " + Arrays.toString(args));

        //调用原来的委托对象（而非代理对象）的对应方法来处理业务逻辑
        Object result = method.invoke(this.client, args);

        //按需要打印日志或进行其他操作：
        System.out.println(method.getName() + "的结果是" + result);

        //把结果返回作为return值
        return result;
    }
}
