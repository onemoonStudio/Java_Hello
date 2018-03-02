package com.javalec.ex;

import java.util.Scanner;

public class CallEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 점수의 평균을 구합니다.");
		System.out.print("국어 점수는 몇점인가요?");
		int kor = sc.nextInt();
		System.out.print("수학 점수는 몇점인가요?");
		int math = sc.nextInt();
		System.out.print("영어 점수는 몇점인가요?");
		int eng = sc.nextInt();
		
		System.out.println("세 점수의 평균은 -> " + (kor+math+eng)/3 + " 입니다.");
		
		
	}
}
