package com.fruit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		
		System.out.println("Circle point is " + center.getX() + ", " + center.getY() );
	}

}
