package com.baizhi.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AopActive implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        /*
        * 什么人
        * 什么时间
        * 什么事情
        * 是否成功
        * */
        Date date=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        String format = s.format(date);
        Method method = mi.getMethod();
        LogAnnotation annotation = method.getAnnotation(LogAnnotation.class);
        String name = annotation.value();
        boolean flag=false;
        Object proceed =null;
        try {
            proceed=mi.proceed();
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        System.out.println("时间:"+format+"事件:"+name+"成功？:"+flag);
        return proceed;
    }
}
