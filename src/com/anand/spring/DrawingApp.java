package com.anand.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Application Context and Property Initialization
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle)context.getBean("triangle");
		Point point = (Point)context.getBean("point2");
		System.out.println(point.getX());
		
		triangle.draw();
		
		
		//XML Bean factory Initialization
		/*
		 * BeanFactory factory = new XmlBeanFactory(new
		 * FileSystemResource("spring.xml"));
		 * 
		 * Triangle triangle = (Triangle)factory.getBean("triangle");
		 * 
		 * triangle.draw();
		 */

	}

}
