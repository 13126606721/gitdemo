package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Chapter;

public interface ChapterService {
	public List<Chapter> queryAll();
	public void  delete(Integer id);
	public void  update(Chapter t);
	public void  insert(Chapter t);
}
