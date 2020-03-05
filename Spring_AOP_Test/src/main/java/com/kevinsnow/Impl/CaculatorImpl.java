package com.kevinsnow.Impl;

import com.kevinsnow.Caculator;
import org.springframework.stereotype.Component;

@Component
//专门处理【业务逻辑】的类，应该尽可能减少其他如打印日志之类的业务（通过提取切片）
public class CaculatorImpl implements Caculator {

    public int add(int num1, int num2) {
//        System.out.println("add方法的参数是["+num1+","+num2+"]");
        int result = num1+num2;
//        System.out.println("add方法的结果是"+result);
        return result;
    }
    public int sub(int num1, int num2) {
//        System.out.println("sub方法的参数是["+num1+","+num2+"]");
        int result = num1-num2;
//        System.out.println("sub方法的结果是"+result);
        return result;
    }

    public int mul(int num1, int num2) {
//        System.out.println("mul方法的参数是["+num1+","+num2+"]");
        int result = num1*num2;
//        System.out.println("mul方法的结果是"+result);
        return result;
    }
    public int div(int num1, int num2) {
//        System.out.println("div方法的参数是["+num1+","+num2+"]");
        int result = num1/num2;
//        System.out.println("div方法的结果是"+result);
        return result;
    }
}
