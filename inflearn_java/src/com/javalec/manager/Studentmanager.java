package com.javalec.manager;

import java.util.ArrayList;

public class Studentmanager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		Studentmanager StManager = new Studentmanager();
		
		StManager.addStudent("홍길동", 10, 101010 ,"융합공학부");
		StManager.addStudent("최효진", 12, 10101230 ,"디지털이미징");
		
		System.out.println(StManager.students.get(0).getName());
		System.out.println(StManager.students.get(0).getAge());
		System.out.println(StManager.students.get(0).getStudentNum());
		System.out.println(StManager.students.get(0).getMajor());
		
	}
	
	public void addStudent(String name , int age, int studentNum, String major) {
		
		/*
		Student make_student = new Student(name,age,studentNum,major);
		students.add(make_student);
		*/
		// 위와같은 과정을 아래의 과정으로 단순화 시켰다.
		
		students.add(new Student(name,age,studentNum,major));
		System.out.println(name +" 학생의 정보가 입력되었습니다.");
	}
}
