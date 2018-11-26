package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.AlbumDao;
import com.baizhi.dao.ChapterDao;
import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
@Service("albumService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class AlbumServiceImpl implements AlbumService{
	@Resource(name="albumDao")
	private AlbumDao ad;
	@Resource(name="chapterDao")
	private ChapterDao  cd;
	public List<Album> queryAll() {
		return ad.queryAll();
	}
	@Transactional
	public void delete(Integer id) {
		ad.delete(id);
		cd.delete(id);
	}
	@Transactional
	public void update(Album t) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void insert(Album t) {
		t.setAlbumCount(0);
		t.setAlbumCover("/cmfz_lyf/img/album/"+t.getAlbumCover());
		ad.insert(t);
	}

}
