package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Article;

public interface ArticleService {
	public List<Article> queryAll();
	public void update(Article a);
}
