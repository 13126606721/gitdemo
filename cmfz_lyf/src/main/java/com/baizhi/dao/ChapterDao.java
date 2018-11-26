package com.baizhi.dao;

import com.baizhi.entity.Chapter;

public interface ChapterDao extends Statement<Chapter>{
	public Integer count(Integer id);
}
