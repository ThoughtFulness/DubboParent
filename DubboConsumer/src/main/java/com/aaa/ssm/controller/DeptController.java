package com.aaa.ssm.controller;

import com.aaa.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * className:DeptController
 * discriptoin:
 * author:毛宇
 * createTime:2019-01-02 13:38
 */
@Controller
@RequestMapping("dept")
public class DeptController {

	@Autowired
	DeptService deptService;

	@ResponseBody
	@RequestMapping("list")
	public Object list(){
		return deptService.getPage(null);
	}

	@RequestMapping("tolist")
	public Object tolist(){
		return "dept/list";
	}

}
