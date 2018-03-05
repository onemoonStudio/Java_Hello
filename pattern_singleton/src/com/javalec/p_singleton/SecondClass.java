package com.javalec.p_singleton;

public class SecondClass {
	public SecondClass() {
		// TODO Auto-generated constructor stub
		SingletonClass single_second = SingletonClass.getSingletonClass();
		
		single_second.getI();
		single_second.setI(200);
		single_second.getI();
		System.out.println("Second Class is activated");
	}
}
