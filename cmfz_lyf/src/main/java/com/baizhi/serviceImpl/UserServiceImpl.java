package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
@Service("userService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class UserServiceImpl implements UserService{
	@Resource(name="userDao")
	private UserDao ud;
	public List<User> queryAll() {
		return ud.queryAll();
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void update(User t) {
		ud.update(t);
	}

	public void insert(User t) {
		ud.insert(t);
	}
	@Transactional
	public void updateMD5(String userPassword,Integer userId) {
		ud.updateMD5(userPassword,userId);
	}

	public User selectByName(String userName, String userPassword) {
		return ud.selectByName(userName, userPassword);
	}

}
