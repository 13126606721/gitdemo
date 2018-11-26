package com.baizhi.entity;

import java.util.List;

public class BannerDto {
	private List<Banner> rows;
	private Integer total;
	public List<Banner> getRows() {
		return rows;
	}
	public void setRows(List<Banner> rows) {
		this.rows = rows;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "BannerDto [rows=" + rows + ", total=" + total + "]";
	}
	public BannerDto(List<Banner> rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public BannerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
