package com.baizhi.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Counter {
	private Integer counterId;
	private String counterTitle;
	private Integer counterCount;
	@JSONField(format="yyyy-MM-d")
	private Date  counterCreateTime;
	private Course course;
	private User user;
	public Integer getCounterId() {
		return counterId;
	}
	public void setCounterId(Integer counterId) {
		this.counterId = counterId;
	}
	public String getCounterTitle() {
		return counterTitle;
	}
	public void setCounterTitle(String counterTitle) {
		this.counterTitle = counterTitle;
	}
	public Integer getCounterCount() {
		return counterCount;
	}
	public void setCounterCount(Integer counterCount) {
		this.counterCount = counterCount;
	}
	public Date getCounterCreateTime() {
		return counterCreateTime;
	}
	public void setCounterCreateTime(Date counterCreateTime) {
		this.counterCreateTime = counterCreateTime;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Counter [counterId=" + counterId + ", counterTitle="
				+ counterTitle + ", counterCount=" + counterCount
				+ ", counterCreateTime=" + counterCreateTime + ", course="
				+ course + ", user=" + user + "]";
	}
	public Counter(Integer counterId, String counterTitle,
			Integer counterCount, Date counterCreateTime, Course course,
			User user) {
		super();
		this.counterId = counterId;
		this.counterTitle = counterTitle;
		this.counterCount = counterCount;
		this.counterCreateTime = counterCreateTime;
		this.course = course;
		this.user = user;
	}
	public Counter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
