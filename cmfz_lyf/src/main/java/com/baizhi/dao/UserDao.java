package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.User;

public interface UserDao extends Statement<User>{
	public void updateMD5(@Param("userPassword") String userPassword, @Param("userId") Integer userId);
	public User selectByName(@Param("userName") String userName, @Param("userPassword") String userPassword);
}
