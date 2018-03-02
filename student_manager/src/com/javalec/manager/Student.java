package com.javalec.manager;

public class Student {
	private String name;
	private int age;
	private int studentNum;
	private String major;
	
	public Student(String name ,int age ,int studentNum , String major) {
		this.name = name; this.age = age; this.studentNum = studentNum; this.major = major;
	}
	
	public void updateInfo(int i , String info) {
		switch(i) {
		case 1:
			setName(info);
			System.out.println("이름이 "+info+" 로 변경되었습니다.");
			break;
		case 2:
			setAge(Integer.parseInt(info));
			System.out.println("나이가 "+info+" 로 변경되었습니다");
			break;
		case 3:
			setStudentNum(Integer.parseInt(info));
			System.out.println("학번이 "+info+" 로 변경되었습니다.");
			break;
		case 4:
			setMajor(info);
			System.out.println("전공이 "+info+" 로 변경되었습니다.");
			break;
			
		default:
			System.out.println("1.이름 2.나이 3.학번 4.전공 , 변경할 값");
			break;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
