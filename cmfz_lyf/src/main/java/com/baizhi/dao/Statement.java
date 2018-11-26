package com.baizhi.dao;

import java.util.List;

public interface Statement<T> {
	public List<T> queryAll();
	public void  delete(Integer id);
	public void  update(T t);
	public void  insert(T t);
}
