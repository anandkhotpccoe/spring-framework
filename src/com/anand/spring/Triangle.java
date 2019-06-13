package com.anand.spring;

import java.util.Iterator;
import java.util.List;



public class Triangle{
	
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




	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Initializing Bean Init Method Called For Triangle");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("Disposable Bean destroy Method Called For Triangle");
	 * 
	 * }
	 */
	
	
	//Declaring Spring Independent Init and Destroy method
	
	public void myInit()
	{
		System.out.println("MyInit Method Called");
	}
	
	
	public void myDestroy()
	{
		System.out.println("myDestroy method called");
	}

	
	


	

	


	
	
	
	
	
	
	

}
