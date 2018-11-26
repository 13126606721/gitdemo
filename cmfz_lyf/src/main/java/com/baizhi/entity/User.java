package com.baizhi.entity;

public class User {
	private Integer userId;
	private String userPhone;
	private String userName;
	private String userPassword;
	private String userDharmaName;
	private String userSex;
	private String userSign;
	private String userProfile;
	private String userProvince;
	private String userCity;
	private Integer userStatus;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserDharmaName() {
		return userDharmaName;
	}
	public void setUserDharmaName(String userDharmaName) {
		this.userDharmaName = userDharmaName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserSign() {
		return userSign;
	}
	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}
	public String getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	public String getUserProvince() {
		return userProvince;
	}
	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPhone=" + userPhone
				+ ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userDharmaName=" + userDharmaName + ", userSex=" + userSex
				+ ", userSign=" + userSign + ", userProfile=" + userProfile
				+ ", userProvince=" + userProvince + ", userCity=" + userCity
				+ ", userStatus=" + userStatus + "]";
	}
	public User(Integer userId, String userPhone, String userName,
			String userPassword, String userDharmaName, String userSex,
			String userSign, String userProfile, String userProvince,
			String userCity, Integer userStatus) {
		super();
		this.userId = userId;
		this.userPhone = userPhone;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userDharmaName = userDharmaName;
		this.userSex = userSex;
		this.userSign = userSign;
		this.userProfile = userProfile;
		this.userProvince = userProvince;
		this.userCity = userCity;
		this.userStatus = userStatus;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
