package com.javalec.manager;

import java.util.ArrayList;

public class StudentExpel {
	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		// TODO Auto-generated constructor stub
		expelStudents = new ArrayList<Student>();
	}
	
	public void addExpelStudent(String name , int age , int studentNum , String major) {
		expelStudents.add(new Student(name,age,studentNum,major));
		// new Student를 하는 이유는 상단에서 ArrayList를 선언할때 Student형 List를 만들었기 때문이다. 같은 형태를 만들어줘야 하기 때문에!
	}
	
}
