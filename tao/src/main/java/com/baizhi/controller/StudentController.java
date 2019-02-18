package com.baizhi.controller;

import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService ss;
    @RequestMapping("queryAll")
    @ResponseBody
    public List<Student> queryAll(){
       return  ss.selectAll();
    }
}
