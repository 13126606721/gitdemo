package com.baizhi.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.Category;
import com.baizhi.service.CategoryService;

@Controller
@RequestMapping("cate")
public class CategoryController {
	@Resource(name="categoryService")
	private CategoryService cs;
	@RequestMapping("queryAll")
	@ResponseBody
	public List<Category> queryAll(){
		return cs.queryAll();
	}
}
