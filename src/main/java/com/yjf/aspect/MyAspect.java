package com.yjf.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 余俊锋
 * @date 2020/9/30 11:41
 * @Description
 */
@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com..services.*.*(..))")
    public void point(){

    }

    @Before("point()")
    public void before(){
        System.out.println("前置通知");
    }

    @AfterReturning("point()")
    public void afterReturning(){
        System.out.println("后置通知");
    }

    @Around("point()")
    public Object around(ProceedingJoinPoint around) throws Throwable {         //环绕通知

        System.out.println("环绕通知之前");
        Object proceed = around.proceed();          //执行目标方法
        System.out.println("环绕通知之后");
        return proceed;                             //将目标方法的返回值返回
    }

    @After("point()")
    public void after(){
        System.out.println("最终通知");
    }

    @AfterThrowing("point()")
    public void afterThrowing(){
        System.out.println("异常抛出通知");
    }
}
