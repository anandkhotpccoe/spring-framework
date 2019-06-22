package com.anand.spring;

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;*/

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Application Context and Property Initialization
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		//Triangle triangle = (Triangle)context.getBean("triangle");
		
		Shape shape = (Shape)context.getBean("circle");
		
	//	System.out.println(context.getMessage("greeting", null, "Anu",null));
		
		
		shape.draw();
		
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
