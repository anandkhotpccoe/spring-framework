package com.anand.spring;

public class Triangle {
	
	
	
	private String type;
	
	private int height;
	
	public void draw()
	{
		System.out.println(getType() + " Triangle Drawn of Height " + getHeight());
	}
	
	
	public Triangle(int height)
	{
		this.height = height;
	}
	
	public Triangle(String type)
	{
		this.type = type;
	}
	
	
	public Triangle(String type, int height)
	{
		this.type = type;
		this.height = height;
	}
	
	
	
	public String getType() {
		return type;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	/*
	 * public void setType(String type) { this.type = type; }
	 */
	
	

}
