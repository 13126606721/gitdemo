package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Course;

public interface CourseService {
	public List<Course> queryByMarking();
	public List<Course> queryAll();
	public void  delete(Integer id);
	public void  update(Course t);
	public void  insert(Course t);
}
