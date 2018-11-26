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

import com.baizhi.entity.Guru;
import com.baizhi.service.GuruService;

@Controller
@RequestMapping("guru")
public class GuruController {
	@Resource(name="guruService")
	private GuruService gs;
	@RequestMapping("queryAll")
	@ResponseBody
	public List<Guru> queryAll(){
		return gs.queryAll();
	}
	@RequestMapping("insert")
	@ResponseBody
	public void insert(Guru g,MultipartFile xxx,HttpSession session) throws IllegalStateException, IOException{
		String path = xxx.getOriginalFilename();
		System.out.println(path);
		String realPath = session.getServletContext().getRealPath("/img/guru");
		xxx.transferTo(new File(realPath+"/"+path));
		g.setGuruProfile(path);
		gs.insert(g);
	}
	@RequestMapping("update")
	@ResponseBody
	public void update(Guru g){
		gs.update(g);
	}
}
