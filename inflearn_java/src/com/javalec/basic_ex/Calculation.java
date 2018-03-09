package com.javalec.basic_ex;

import java.util.Scanner;
//import com.javalec.ex.ClassTest;
//? 같은 패키지 내에 있으면 굳이 import를 안해줘도 상관없는듯 하다.

public class Calculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		int i = scanner.nextInt();
//		
//		System.out.println("3 나누기 시스템 i % 3 -> " + (i%3) );
		
		/*

//		 사용자에게 숫자를 입력받아서 구구단을 만들어보자 - 한 파일 내에서 클래스선
		
		System.out.print("구구단을 만들고 싶은 숫자를 입력해주세요 ! : ");
		int userNum = scanner.nextInt();
		
		Calculation gugudan = new Calculation();
		gugudan.gugudan(userNum);
		
		*/
		
		// BMI 를 계산해보자 - 다른 파일에서 class 호출
		// 먼저 import 를 해줘야 한다.
		
		ClassTest man = new ClassTest(27,187,95,"김현태");
		man.callName();
		double result = man.calculateBMI();
		System.out.println(result);
		
	}
	
	public void gugudan(int input) {
		System.out.println("구구단을 시작합니다.");
		for( int i = 1; i <10 ; i++) {
			System.out.print(i + " * " + input + " = " + (i*input)+ "\t" );
		}
	}
}
