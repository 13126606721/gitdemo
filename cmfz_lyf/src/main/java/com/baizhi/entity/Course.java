package com.baizhi.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Course {
	private Integer courseId;
	private String courseTitle;
	private String courseMarking;
	@JSONField(format="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date courseCreateTime;
	private Integer courseStatus;
	private User user;
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseMarking() {
		return courseMarking;
	}
	public void setCourseMarking(String courseMarking) {
		this.courseMarking = courseMarking;
	}
	public Date getCourseCreateTime() {
		return courseCreateTime;
	}
	public void setCourseCreateTime(Date courseCreateTime) {
		this.courseCreateTime = courseCreateTime;
	}
	public Integer getCourseStatus() {
		return courseStatus;
	}
	public void setCourseStatus(Integer courseStatus) {
		this.courseStatus = courseStatus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle
				+ ", courseMarking=" + courseMarking + ", courseCreateTime="
				+ courseCreateTime + ", courseStatus=" + courseStatus
				+ ", user=" + user + "]";
	}
	public Course(Integer courseId, String courseTitle, String courseMarking,
			Date courseCreateTime, Integer courseStatus, User user) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.courseMarking = courseMarking;
		this.courseCreateTime = courseCreateTime;
		this.courseStatus = courseStatus;
		this.user = user;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
