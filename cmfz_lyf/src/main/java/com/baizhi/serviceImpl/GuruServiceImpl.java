package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.GuruDao;
import com.baizhi.entity.Guru;
import com.baizhi.service.GuruService;
@Service("guruService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class GuruServiceImpl implements GuruService{
	@Resource(name="guruDao")
	private GuruDao gd;
	public List<Guru> queryAll() {
		return gd.queryAll();
	}
	@Transactional
	public void insert(Guru g) {
		g.setGuruProfile("/cmfz_lyf/img/guru/"+g.getGuruProfile());
		gd.insert(g);
	}
	@Transactional
	public void update(Guru g) {
		gd.update(g);
	}

}
