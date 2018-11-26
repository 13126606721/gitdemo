package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.BannerDao;
import com.baizhi.entity.Banner;
import com.baizhi.entity.BannerDto;
import com.baizhi.service.BannerService;
@Service("bannerService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class BannerServiceImpl implements BannerService{
	@Resource(name="bannerDao")
	private BannerDao bd;
	public List<Banner> queryAll() {
		return bd.queryAll();
	}
	@Transactional
	public void delete(Integer id) {
		bd.delete(id);
	}
	@Transactional
	public void update(Banner t) {
		bd.update(t);
	}
	@Transactional
	public void insert(Banner t) {
			t.setBannerPath("/cmfz_lyf/img/banner/"+t.getBannerPath());
			bd.insert(t);
	}

	public BannerDto queryByPaging(Integer page, Integer rows) {
		BannerDto b = new BannerDto();
		b.setRows(bd.queryByPaging(page, rows));
		b.setTotal(bd.count());
		return b;
	}

}
