package com.javalec.ex_static;

import com.javalec.children.*;
import com.javalec.papa.Pouch;

public class UseStatic {
	
	public static void main(String[] args) {
		
		First firstChildren = new First();
		firstChildren.takeMoney(100);
		
		Second secondChildren = new Second();
		secondChildren.takeMoney(100);
		
		Third thirdChildren = new Third();
		thirdChildren.takeMoney(100);
		
		System.out.println("papa pouch money " + Pouch.MONEY);
		
	}
}
