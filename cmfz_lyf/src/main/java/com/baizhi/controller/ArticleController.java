package com.baizhi.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.Article;
import com.baizhi.service.ArticleService;
@Controller
@RequestMapping("article")
public class ArticleController {
	@Resource(name="articleService")
	private ArticleService as;
	@RequestMapping("select")
	@ResponseBody
	public List<Article> select(){
		return as.queryAll();
	}
	@RequestMapping("update")
	@ResponseBody
	public void update(Article a){
		as.update(a);
	}
	
}
