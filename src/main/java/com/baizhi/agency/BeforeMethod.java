package com.baizhi.agency;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeMethod {
    @Before("execution(* com.baizhi.service.*.*(..))")
    public void before(JoinPoint joinPoint){

        System.out.println("这是一个前置通知");
        System.out.println(joinPoint.getSignature().getName());



    }
}
