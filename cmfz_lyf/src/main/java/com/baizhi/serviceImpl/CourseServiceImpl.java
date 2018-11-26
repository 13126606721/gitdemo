package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.CourseDao;
import com.baizhi.entity.Course;
import com.baizhi.service.CourseService;
@Service("courseService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class CourseServiceImpl implements CourseService{
	@Resource(name="courseDao")
	private CourseDao cd;
	public List<Course> queryByMarking() {
		return cd.queryByMarking();
	}

	public List<Course> queryAll() {
		return cd.queryAll();
	}
	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void update(Course t) {
		cd.update(t);
	}
	@Transactional
	public void insert(Course t) {
		cd.insert(t);
	}

}
