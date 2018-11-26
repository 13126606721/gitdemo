package com.baizhi.entity;

public class Manager {
	private Integer managerId;
	private String managerName;
	private String managerPassword;
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName="
				+ managerName + ", managerPassword=" + managerPassword + "]";
	}
	public Manager(Integer managerId, String managerName, String managerPassword) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerPassword = managerPassword;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
