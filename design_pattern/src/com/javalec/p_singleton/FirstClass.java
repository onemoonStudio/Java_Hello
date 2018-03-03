package com.javalec.p_singleton;

public class FirstClass {
	public FirstClass() {
		// TODO Auto-generated constructor stub
		SingletonClass single_first = SingletonClass.getSingletonClass();
		single_first.getI();
		single_first.setI(100);
		System.out.println("first class is activated");
		
	}
}
