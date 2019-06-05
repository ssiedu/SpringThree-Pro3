package com.ssi;

public class Demo {
	private int x, y;
	
	public Demo(){
		System.out.println("Demo Object Created");
	}
	public void start(){
		System.out.println("Start of Demo");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		System.out.println("Property X from Demo Set");
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		System.out.println("Property Y from Demo Set");
	}
	
	
	
}
