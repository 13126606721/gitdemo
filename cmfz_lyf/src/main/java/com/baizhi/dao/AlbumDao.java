package com.baizhi.dao;

import com.baizhi.entity.Album;

public interface AlbumDao extends Statement<Album>{
	public Integer count();
	public void updateCount(Integer albumCount);
}
