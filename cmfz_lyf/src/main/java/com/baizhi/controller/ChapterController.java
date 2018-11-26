package com.baizhi.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;








import com.baizhi.entity.Chapter;
import com.baizhi.service.ChapterService;
@Controller
@RequestMapping("chapter")
public class ChapterController {
	@Resource(name="chapterService")
	private ChapterService as;
	@RequestMapping("select")
	@ResponseBody
	public List<Chapter> select(){
		return as.queryAll();
	}
	@RequestMapping("insert")
	@ResponseBody
	public void insert(Chapter t,MultipartFile cc,HttpSession session) throws Exception, IOException{
		System.out.println("aaaaaaaaaaa"+t);
		String path = cc.getOriginalFilename();
		System.out.println(path);
		String realPath = session.getServletContext().getRealPath("/chapter");
		cc.transferTo(new File(realPath+"/"+path));
		t.setChapterDownloadPath(path); 
		as.insert(t);
	}
	@RequestMapping("download")
	public void download(String name,HttpServletResponse response,HttpSession session) throws Exception, IOException{
		response.setHeader("content-disposition", "attachment;filename="+URLEncoder.encode(name,"utf-8"));
		String realPath = session.getServletContext().getRealPath("/chapter");
		byte[] read = FileUtils.readFileToByteArray(new File(realPath+"/"+name));
		ServletOutputStream out = response.getOutputStream();
		out.write(read);
	}
}
