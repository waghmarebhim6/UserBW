package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Testapc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext apc=new ClassPathXmlApplicationContext("Beans.Xml");
		
		Student stu=(Student) apc.getBean("s");
		System.out.println(stu);
	}

}
