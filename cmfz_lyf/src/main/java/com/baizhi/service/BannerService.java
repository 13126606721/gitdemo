package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Banner;
import com.baizhi.entity.BannerDto;

public interface BannerService {
	public List<Banner> queryAll();
	public void  delete(Integer id);
	public void  update(Banner t);
	public void  insert(Banner t);
	public BannerDto queryByPaging(Integer page, Integer rows);
}
