package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.ManagerDao;
import com.baizhi.entity.Manager;
import com.baizhi.service.ManagerService;
@Service("managerService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class ManagerServiceImpl implements ManagerService{
	@Resource(name="managerDao")
	private ManagerDao md;
	public Manager findOne(String managerName, String managerPassword) {
		return md.selectOne(managerName, managerPassword);
	}
	
	public List<Manager> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void update(Manager t) {
		md.update(t);
	}
	@Transactional
	public void insert(Manager t) {
		md.insert(t);
	}

	public Manager updateBySelectOne(Integer ManagerId) {
		return md.updateBySelectOne(ManagerId);
	}

}
