package com.baizhi.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource(name="userService")
	private UserService us;
	@RequestMapping("queryAll")
	@ResponseBody
	public List<User> queryAll(){
		return us.queryAll();
	}
	@RequestMapping("queryByName")
	public String  queryByName(String userName,String userPassword){
		System.out.println(userName+"  ------ "+userPassword);
		String pass = DigestUtils.md5DigestAsHex(userPassword.getBytes());
		 User user = us.selectByName(userName,pass);
		 System.out.println(user);
		 if(user==null){
			 System.out.println("no");
		 }else{
			 System.out.println("yes");
		 }
		 return "redirect:/index.js】3333p";
	}
	@RequestMapping("update")
	@ResponseBody
	public void update(User t){
		us.update(t);
	}
	@RequestMapping("insert")
	@ResponseBody
	public void insert(User t){
		us.insert(t);
	}
}
