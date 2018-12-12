package com.baizhi.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//在方法上使用
@Target({ElementType.METHOD})
//类一旦运行起作用
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {
    public String value();
}
