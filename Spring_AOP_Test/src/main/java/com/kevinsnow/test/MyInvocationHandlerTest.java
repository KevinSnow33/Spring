package com.kevinsnow.test;

import com.kevinsnow.Caculator;
import com.kevinsnow.Impl.CaculatorImpl;
import com.kevinsnow.InvocationHandler.MyInvocationHandler;

public class MyInvocationHandlerTest {
    public static void main(String[] args) {
        //委托对象（对应处理业务逻辑的类）
        Caculator calClient = new CaculatorImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        //通过bind函数拿到代理对象
        Caculator calProxy = (Caculator) myInvocationHandler.bind(calClient);
        //通过代理对象调用委托对象的各种业务逻辑的方法，同时还能让代理对象（切片）中的其他代码生效
        calProxy.add(1,2);
        calProxy.sub(1,2);
        calProxy.mul(1,2);
        calProxy.div(1,2);

    }
}
