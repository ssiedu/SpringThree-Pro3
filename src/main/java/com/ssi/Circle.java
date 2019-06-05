package com.ssi;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public void area(){
		System.out.println("Area of Circle : "+(3.14*radius*radius));
	}
}
