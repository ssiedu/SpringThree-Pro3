package com.ssi;

public class Test {
	private int p, q;

	public Test(){
		System.out.println("Test Object Created");
	}

	public void start(){
		System.out.println("Start of Test");
	}
	
	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
		System.out.println("Property P from Test Set");
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
		System.out.println("Property Q from Test Set");
	}
	
	
}
