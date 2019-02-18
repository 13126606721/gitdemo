package com.baizhi.serviceimpl;

import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentdao;
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<Student> selectAll() {
        return studentdao.selectAll();
    }

    @Override
    public Student selectOne(String studentName, String studentPassword) {
        return studentdao.selectOne(studentName,studentPassword);
    }

    @Override
    public void insert(Student stu) {
        studentdao.insert(stu);
    }

    @Override
    public void delete(String studentId) {
        studentdao.delete(studentId);
    }

    @Override
    public void update(Student stu) {
        studentdao.update(stu);
    }
}
