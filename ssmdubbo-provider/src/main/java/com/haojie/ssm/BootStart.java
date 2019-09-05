package com.haojie.ssm;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.haojie.ssm.entity.Student;
import com.haojie.ssm.service.StudentService;
import com.github.pagehelper.PageInfo;
/**
 * 
 * @author zhuzg
 *
 */
public class BootStart {
	
	/**
	 * 
	 */
	static Logger log= Logger.getLogger(BootStart.class);
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		log.trace("������������");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); 
		
		StudentService ss = context.getBean(StudentService.class);
		PageInfo<Student> pageInfo = ss.list(1, 5);
		System.out.print("  pageInfo is " + pageInfo);
		
		log.trace("����ok������������������");
		System.in.read();
		
	}

}
