package com.haojie.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haojie.ssm.entity.Student;
import com.haojie.ssm.service.StudentService;
import com.github.pagehelper.PageInfo;

@RequestMapping("stu")
@Controller
public class StudentController {
	
	@Reference
	StudentService stuService;
	
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	//@GetMapping
	public String list(HttpServletRequest request) {
		
		PageInfo<Student> pageInfo = stuService.list(1, 10);
		request.setAttribute("pageInfo", pageInfo);
		return "list";
	}
}
