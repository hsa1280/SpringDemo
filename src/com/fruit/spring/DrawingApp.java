package com.fruit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
//		Triangle triangle = new Triangle();
		
		@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)factory.getBean("triangle");
		
		triangle.draw();
	}

}
