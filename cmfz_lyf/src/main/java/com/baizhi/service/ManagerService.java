package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Manager;

public interface ManagerService {
	public Manager findOne(String managerName, String managerPassword);
	public List<Manager> queryAll();
	public void  delete(Integer id);
	public void  update(Manager t);
	public void  insert(Manager t);
	public Manager updateBySelectOne(Integer ManagerId);

}
