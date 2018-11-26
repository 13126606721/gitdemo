package com.baizhi.dao;

import java.util.List;

import com.baizhi.entity.Course;

public interface CourseDao extends Statement<Course>{
	public List<Course>	queryByMarking();
}
