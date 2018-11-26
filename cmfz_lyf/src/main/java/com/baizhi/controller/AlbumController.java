package com.baizhi.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
@Controller
@RequestMapping("album")
public class AlbumController {
	@Resource(name="albumService")
	private AlbumService as;
	@RequestMapping("select")
	@ResponseBody
	public List<Album> select(){
		return as.queryAll();
	}
	@RequestMapping("insert")
	@ResponseBody
	public void insert(Album t,MultipartFile xxx,HttpSession session) throws Exception, IOException{
		String path = xxx.getOriginalFilename();
		System.out.println(path);
		String realPath = session.getServletContext().getRealPath("/img/album");
		xxx.transferTo(new File(realPath+"/"+path));
		t.setAlbumCover(path);
		as.insert(t);
	}
	@RequestMapping("delete")
	@ResponseBody
	public void delete(Album t) {
		System.out.println("vvvvvvvvv"+t);
		as.delete(t.getAlbumId());
	}
}
