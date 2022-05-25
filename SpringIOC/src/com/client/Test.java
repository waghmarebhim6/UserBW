package com.client;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Resource rs=new ClassPathResource("Beans.xml");
		
		BeanFactory beanf=new XmlBeanFactory(rs);
		
		Student st=(Student)beanf.getBean("s");
		System.out.println(st);
		
		
		//ApplicationContext apc=new ClassPathXmlApplicationContext("Beans.xml");
		 
	}

}
