package com.baizhi.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.entity.Counter;
import com.baizhi.service.CounterService;

@Controller
@RequestMapping("counter")
public class CounterController {
	@Resource(name="counterService")
	private CounterService cs;
	@RequestMapping("queryAll")
	@ResponseBody
	public List<Counter> queryAll(){
		return cs.queryAll();
	}
}
