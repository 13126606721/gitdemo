package com.baizhi.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Article {
	private Integer articleId;
	private String articleTitle;
	private String articleContent;
	private String articleImg;
	@JSONField(format="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date articlePublishDate;
	private String articleStatus;
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public String getArticleImg() {
		return articleImg;
	}
	public void setArticleImg(String articleImg) {
		this.articleImg = articleImg;
	}
	public Date getArticlePublishDate() {
		return articlePublishDate;
	}
	public void setArticlePublishDate(Date articlePublishDate) {
		this.articlePublishDate = articlePublishDate;
	}
	public String getArticleStatus() {
		return articleStatus;
	}
	public void setArticleStatus(String articleStatus) {
		this.articleStatus = articleStatus;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", articleTitle="
				+ articleTitle + ", articleContent=" + articleContent
				+ ", articleImg=" + articleImg + ", articlePublishDate="
				+ articlePublishDate + ", articleStatus=" + articleStatus + "]";
	}
	public Article(Integer articleId, String articleTitle,
			String articleContent, String articleImg, Date articlePublishDate,
			String articleStatus) {
		super();
		this.articleId = articleId;
		this.articleTitle = articleTitle;
		this.articleContent = articleContent;
		this.articleImg = articleImg;
		this.articlePublishDate = articlePublishDate;
		this.articleStatus = articleStatus;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
