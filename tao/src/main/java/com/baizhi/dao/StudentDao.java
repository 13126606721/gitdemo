package com.baizhi.dao;

import com.baizhi.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    public List<Student> selectAll();
    public Student selectOne(@Param("studentName") String studentName,@Param("StudentPassword") String studentPassword);
    public void insert(Student stu);
    public void delete(String studentId);
    public void update(Student stu);

}
