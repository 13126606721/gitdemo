package com.baizhi.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.Course;
import com.baizhi.service.CourseService;

@Controller
@RequestMapping("course")
public class CourseController {
	@Resource(name="courseService")
	private CourseService cs;
	@RequestMapping("queryByMarking")
	@ResponseBody
	public List<Course> queryByMarking(){
		return cs.queryByMarking();
	}
	@RequestMapping("queryAll")
	@ResponseBody
	public List<Course> queryAll(){
		return cs.queryAll();
	}
	@RequestMapping("insert")
	@ResponseBody
	public void insert(Course t){
		cs.insert(t);
	}
	@RequestMapping("update")
	@ResponseBody
	public void update(Course t){
		cs.update(t);
	}
}
