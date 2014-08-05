package com.fruit.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void draw() {
		
		System.out.println("Circle point is " + center.getX() + ", " + center.getY() );
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

}
