package com.haojie.ssm.service;

import com.haojie.ssm.entity.Student;
import com.github.pagehelper.PageInfo;

public interface StudentService {
	
	PageInfo<Student> list(Integer pageNum,Integer pagesize);
	

}
