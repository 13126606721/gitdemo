package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.User;

public interface UserService {
	public List<User> queryAll();
	public void  delete(Integer id);
	public void  update(User t);
	public void  insert(User t);
	public void updateMD5(String userPassword, Integer userId);
	public User selectByName(String userName, String userPassword);
}
