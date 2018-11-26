package com.baizhi.controller;

import com.baizhi.entity.Banner;
import com.baizhi.entity.BannerDto;
import com.baizhi.service.BannerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
@Controller
@RequestMapping("banner")
public class Bannercontroller {
	@Resource(name="bannerService")
	private BannerService bs;
	@RequestMapping("queryByPaging")
	@ResponseBody
	public BannerDto queryByPaging(Integer page,Integer rows){
		return bs.queryByPaging(page, rows);
	}
	@RequestMapping("update")
	@ResponseBody
	public void update(Banner b){
		bs.update(b);
	}
	@RequestMapping("delete")
	@ResponseBody
	public void delete(Integer bannerId){
		bs.delete(bannerId);
	}
	@RequestMapping("insert")
	@ResponseBody
	public void insert(Banner b,MultipartFile xx,HttpSession session) throws Exception, IOException{
		String path = xx.getOriginalFilename();
		System.out.println(path);
		String realPath = session.getServletContext().getRealPath("/img/banner");
		xx.transferTo(new File(realPath+"/"+path));
		b.setBannerPath(path);
		bs.insert(b);
	}
	@RequestMapping("queryAll")
	@ResponseBody
	public List<Banner> queryAll(){
		 return bs.queryAll();
	}
}
