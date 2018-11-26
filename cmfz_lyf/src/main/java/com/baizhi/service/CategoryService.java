package com.baizhi.service;

import java.util.List;

import com.baizhi.aop.LogAnnotation;
import com.baizhi.entity.Category;

public interface CategoryService {


	public List<Category> queryAll();
	public void  delete(Integer id);
	public void  update(Category t);
	public void  insert(Category t);
}
