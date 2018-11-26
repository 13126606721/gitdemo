package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Album;

public interface AlbumService {
	public List<Album> queryAll();
	public void  delete(Integer id);
	public void  update(Album t);
	public void  insert(Album t);
}
