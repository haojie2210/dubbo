package com.haojie.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.haojie.ssm.entity.Student;
import com.haojie.ssm.mapper.StudentMapper;
import com.haojie.ssm.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(interfaceClass=StudentService.class)
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentMapper stuMapper;

	@Override
	public PageInfo<Student> list(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		
		return new PageInfo<>(stuMapper.list());
	}

}
