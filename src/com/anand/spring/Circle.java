package com.anand.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class Circle implements Shape,ApplicationEventPublisherAware {
	
	
	@Autowired
	private MessageSource messageSource;
	
	
	private ApplicationEventPublisher applicationEventPublisher;
	

	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	private Point center;
	@Override
	public void draw() {
		
		System.out.println("Drawing Cicle:");
		System.out.println("Circle: Point is: (" + center.getX() + "," + center.getY() +")");
		
		System.out.println(messageSource.getMessage("greeting", new Object[] {"Anand", "Prachi"}, "Anu",null));
		
		DrawEvent drawEvent = new DrawEvent(this);
		applicationEventPublisher.publishEvent(drawEvent);
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
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher = publisher;
	}
	
	

}
