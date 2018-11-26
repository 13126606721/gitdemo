package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.Banner;

public interface BannerDao extends Statement<Banner>{
	public List<Banner> queryByPaging(@Param("page") Integer page, @Param("rows") Integer rows);
	public Integer count();
}
