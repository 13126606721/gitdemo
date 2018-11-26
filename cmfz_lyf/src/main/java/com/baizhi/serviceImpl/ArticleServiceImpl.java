package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.ArticleDao;
import com.baizhi.entity.Article;
import com.baizhi.service.ArticleService;
@Service("articleService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class ArticleServiceImpl implements ArticleService{
	@Resource(name="articleDao")
	private ArticleDao ad;
	public List<Article> queryAll() {
		return ad.queryAll();
	}
	public void update(Article a) {
		ad.update(a);
	}

}
