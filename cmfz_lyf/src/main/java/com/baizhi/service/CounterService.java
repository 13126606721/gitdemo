package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Counter;

public interface CounterService {
	public List<Counter> queryAll();
	public void  delete(Integer id);
	public void  update(Counter t);
	public void  insert(Counter t);
}
