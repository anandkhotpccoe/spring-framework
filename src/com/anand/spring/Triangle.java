package com.anand.spring;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean{
	
	List<Point> points;
	
	
	
	
	public void draw()
	{
		
		for (Iterator<Point> iterator = points.iterator(); iterator.hasNext();) {
			Point point = (Point) iterator.next();
			System.out.println("Point : (" + point.getX() + "," + point.getY() + ")");
			
		}
//			System.out.println("PointA = (" + getPointA().getX() + "," + getPointA().getY() + ")");
//			System.out.println("PointB = (" + getPointB().getX() + "," + getPointB().getY() + ")");
//			System.out.println("PointC = (" + getPointC().getX() + "," + getPointC().getY() + ")");
		
		
		
	}




	public List<Point> getPoints() {
		return points;
	}




	public void setPoints(List<Point> points) {
		this.points = points;
	}




	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean Init Method Called For Triangle");
		
	}


	


	

	


	
	
	
	
	
	
	

}
