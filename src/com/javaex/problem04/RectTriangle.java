package com.javaex.problem04;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (width*height)*0.5;
	}
	
	@Override
	public double getPerimeter() {
		return Math.hypot(width, height)+width+height;
	}
	
}
