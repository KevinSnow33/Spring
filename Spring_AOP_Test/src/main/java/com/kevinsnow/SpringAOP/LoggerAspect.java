package com.kevinsnow.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect  //切片注解，将此类表明为切片类，是具有特殊功能的类
@Component  //把这个类交给Spring管理，将该类的对象注⼊入到 IoC 容器。
            //采用此注解方式进行IoC时，不指定bean的名称，对象名默认为类名首字母小写

//除了切面类需要Component注解外，目标类也需要添加 @Component
public class LoggerAspect {

    //*(..)中的*可以替换为目标类中具体业务方法名，*代表所有方法；（..）表示形参
    @Before(value = "execution(public int com.kevinsnow.Impl.CaculatorImpl.*(..))")
    public void before(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        //获取参数
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"方法的参数是： "+ args);
    }

    @After(value = "execution(public int com.kevinsnow.Impl.CaculatorImpl.* (..))")
    public void after(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执⾏行行完毕");
    }

    @AfterReturning(value = "execution(public int com.kevinsnow.Impl.CaculatorImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果是"+result);
    }

    @AfterThrowing(value = "execution(public int com.kevinsnow.Impl.CaculatorImpl.*(..))",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,Exception exception){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"⽅方法抛出异常： "+exception);
    }
}
