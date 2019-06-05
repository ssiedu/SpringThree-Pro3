package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleUser {

	
	private Circle circle;
	
	public Circle getCircle() {
		return circle;
	}

	public CircleUser(Circle circle){
		this.circle=circle;
		System.out.println("One Arg Constructor Is Injecting Dependency");
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
		System.out.println("Circle Injected Using Setter");
	}

	public void showArea(){
		circle.area();
	}
	
	public static void main(String args[]){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		CircleUser cu=context.getBean("circleUser",CircleUser.class);
		cu.showArea();
	}
	
}
