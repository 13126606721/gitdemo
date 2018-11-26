package com.baizhi.service;

import java.util.List;

import com.baizhi.entity.Guru;

public interface GuruService {
	public List<Guru> queryAll();
	public void insert(Guru g);
	public void update(Guru g);
}
