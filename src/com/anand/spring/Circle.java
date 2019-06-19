package com.anand.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component
public class Circle implements Shape {

	
	private Point center;
	@Override
	public void draw() {
		
		System.out.println("Drawing Cicle:");
		System.out.println("Circle: Point is: (" + center.getX() + "," + center.getY() +")");
		
	}
	public Point getCenter() {
		return center;
	}
	
	
	@Resource()
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init Method of Circle");
		
	}
	
	@PreDestroy
	public void destroyCicle()
	{
		System.out.println("Destroy Method of Circle");
	}
	
	

}
