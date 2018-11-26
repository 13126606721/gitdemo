package com.baizhi.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.Manager;
import com.baizhi.service.ManagerService;

@Controller
@RequestMapping("manager")
public class ManagerController {
	@Resource(name="managerService")
	private ManagerService ms;
	
	@RequestMapping("selectOne")
	public String findOne(String managerName,String managerPassword,Model model,String enCode,HttpSession session){
		//System.out.println("mmmm"+managerName+"  "+managerPassword+" "+enCode);
		Manager ma= ms.findOne(managerName, managerPassword);
		
		String s =(String) session.getAttribute("validationCode");
		if(ma!=null && s.equals(enCode)){
			session.setAttribute("ma", ma);
			session.setAttribute("flag", "ok");
			return "redirect:/layout.jsp";
		}else{
			return "redirect:/login.jsp";
		}
		
	}
	@ResponseBody
	@RequestMapping("insert")
	public Manager registerOne(String managerName,String managerPassword){
		return ms.findOne(managerName, managerPassword);
	}
	@ResponseBody
	@RequestMapping("updateBySelectOne")
	public Manager updateBySelectOne(Integer managerId){
		return ms.updateBySelectOne(managerId);
	}
	@RequestMapping("update")
	@ResponseBody
	public void update(Manager m){
		 ms.update(m);
		
	}
	@RequestMapping("exit")
	public String exit(HttpSession session){
		session.setAttribute("ma",null);
		session.setAttribute("flag", "no");
		return "redirect:/login.jsp";
	}
}
