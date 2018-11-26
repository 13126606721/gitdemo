package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.baizhi.aop.LogAnnotation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.CategoryDao;
import com.baizhi.entity.Category;
import com.baizhi.service.CategoryService;
@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService{
	@Resource(name="categoryDao")
	private CategoryDao cd;
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	@LogAnnotation(value="查所有")
	public List<Category> queryAll() {
		return cd.queryAll();
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Category t) {
		// TODO Auto-generated method stub
		
	}

	public void insert(Category t) {
		// TODO Auto-generated method stub
		
	}

}
