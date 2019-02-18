package com.baizhi.service;

import com.baizhi.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    public List<Student> selectAll();
    public Student selectOne(String studentName, String studentPassword);
    public void insert(Student stu);
    public void delete(String studentId);
    public void update(Student stu);
}
