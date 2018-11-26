package com.baizhi.entity;

import java.util.List;

public class Category {
	private Integer categoryId;
	private String  categoryName;
	private String categoryUrl;
	private String categoryIcon;
	
	private List<Category> category;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryUrl() {
		return categoryUrl;
	}

	public void setCategoryUrl(String categoryUrl) {
		this.categoryUrl = categoryUrl;
	}

	public String getCategoryIcon() {
		return categoryIcon;
	}

	public void setCategoryIcon(String categoryIcon) {
		this.categoryIcon = categoryIcon;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", categoryUrl=" + categoryUrl
				+ ", categoryIcon=" + categoryIcon + ", category=" + category
				+ "]";
	}

	public Category(Integer categoryId, String categoryName,
			String categoryUrl, String categoryIcon, List<Category> category) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryUrl = categoryUrl;
		this.categoryIcon = categoryIcon;
		this.category = category;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
