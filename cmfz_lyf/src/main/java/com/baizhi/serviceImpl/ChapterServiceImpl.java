package com.baizhi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.dao.AlbumDao;
import com.baizhi.dao.ChapterDao;
import com.baizhi.entity.Chapter;
import com.baizhi.service.ChapterService;
@Service("chapterService")
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class ChapterServiceImpl implements ChapterService{
	@Resource(name="albumDao")
	private AlbumDao ad;
	@Resource(name="chapterDao")
	private ChapterDao  cd;
	public List<Chapter> queryAll() {
		return cd.queryAll();
	}
	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void update(Chapter t) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void insert(Chapter t) {
		t.setChapterDownloadPath("/cmfz/chapter/"+t.getChapterDownloadPath());
		ad.updateCount(cd.count(t.getAlbum().getAlbumId())+1);
		cd.insert(t);
	}

}
