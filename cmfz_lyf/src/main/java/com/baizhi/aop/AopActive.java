package com.baizhi.aop;

import com.baizhi.entity.Manager;
import com.baizhi.entity.User;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.TryCatchFinally;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class AopActive implements MethodInterceptor {
    private Manager manaer;

    public void setManaer(Manager manaer) {
        this.manaer = manaer;
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        /*
        * 什么人
        * 什么时间
        * 什么事情
        * 是否成功
        * */

        ServletRequestAttributes s1 =(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpSession session = s1.getRequest().getSession();
        Manager username = (Manager) session.getAttribute("ma");

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
        System.out.println("管理员"+username.getManagerName()+"时间:"+format+"事件:"+name+"成功？:"+flag);
        return proceed;
    }
}
