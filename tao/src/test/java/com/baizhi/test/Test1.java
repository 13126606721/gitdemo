package com.baizhi.test;

import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");
        StudentDao sf = (StudentDao) cpx.getBean("studentDao");
        List<Student> students = sf.selectAll();
        System.out.println(students);
    }
}
