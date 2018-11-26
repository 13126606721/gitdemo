package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.CounterDao;
import com.baizhi.entity.Counter;
import com.baizhi.service.CounterService;
@Service("counterService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class CounterServiceImpl implements CounterService{
	@Resource(name="counterDao")
	private CounterDao cd;
	public List<Counter> queryAll() {
		return cd.queryAll();
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Counter t) {
		// TODO Auto-generated method stub
		
	}

	public void insert(Counter t) {
		// TODO Auto-generated method stub
		
	}

}
