package com.fruit.spring;

public class Triangle {

	private String type;
	private int height;
	private String hello;
	
	public Triangle( String type ) {
		this.type = type;
	}
	
	public Triangle( String type, int height ) {
		this.type = type;
		this.height = height;
	}
	
	public Triangle(String type, int height, String hello) {
		super();
		this.type = type;
		this.height = height;
		this.hello = hello;
	}

	public Triangle( int height ) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println( getType() + " Triangle Drawn, the height is " + getHeight() + " hello content is " + getHello());
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
	
	public String getHello() {
		return hello;
	}

//	public void setType(String type) {
//		this.type = type;
//	}
}
