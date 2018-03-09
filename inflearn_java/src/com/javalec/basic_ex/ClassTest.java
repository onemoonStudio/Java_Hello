package com.javalec.basic_ex;

public class ClassTest {
	private int age;
	private int height;
	private int weight;
	private String name;
	
	public ClassTest(int age, int height , int weight , String name) {
		this.age = age; this.height = height; this.weight = weight; this.name = name;
	}
	
	public double calculateBMI () {
		System.out.println(age +" "+ weight);
		System.out.println("BMI 계산 방식은 weight / (height*height) 입니다.");
		double result = weight/(height*height);
		return result;
	}
	
	public void callName() {
		System.out.println("제 이름은 "+name+" 입니다.");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
