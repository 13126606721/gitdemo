package com.baizhi.entity;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Banner {
	private Integer bannerId;
	private String bannerTitle;
	private String bannerPath;
	private String bannerStatus;
	@JSONField(format="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String bannerCreateTime;
	public Integer getBannerId() {
		return bannerId;
	}
	public void setBannerId(Integer bannerId) {
		this.bannerId = bannerId;
	}
	public String getBannerTitle() {
		return bannerTitle;
	}
	public void setBannerTitle(String bannerTitle) {
		this.bannerTitle = bannerTitle;
	}
	public String getBannerPath() {
		return bannerPath;
	}
	public void setBannerPath(String bannerPath) {
		this.bannerPath = bannerPath;
	}
	public String getBannerStatus() {
		return bannerStatus;
	}
	public void setBannerStatus(String bannerStatus) {
		this.bannerStatus = bannerStatus;
	}
	public String getBannerCreateTime() {
		return bannerCreateTime;
	}
	public void setBannerCreateTime(String bannerCreateTime) {
		this.bannerCreateTime = bannerCreateTime;
	}
	@Override
	public String toString() {
		return "Banner [bannerId=" + bannerId + ", bannerTitle=" + bannerTitle
				+ ", bannerPath=" + bannerPath + ", bannerStatus="
				+ bannerStatus + ", bannerCreateTime=" + bannerCreateTime + "]";
	}
	public Banner(Integer bannerId, String bannerTitle, String bannerPath,
			String bannerStatus, String bannerCreateTime) {
		super();
		this.bannerId = bannerId;
		this.bannerTitle = bannerTitle;
		this.bannerPath = bannerPath;
		this.bannerStatus = bannerStatus;
		this.bannerCreateTime = bannerCreateTime;
	}
	public Banner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
