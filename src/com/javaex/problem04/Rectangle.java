package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
	
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width*height;
	}
	
	@Override
	public double getPerimeter() {
		return (width+height)*2;
	}
	
	@Override
	public void resize(double s) {
	    width=width*s;
	    height=height*s;
	}

	 
	
	
}
