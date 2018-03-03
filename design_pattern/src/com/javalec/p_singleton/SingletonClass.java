package com.javalec.p_singleton;

public class SingletonClass {
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
	// 여기에는 힙메모리의 어딘가에 존재하는 SingletonClass의 주소값이 있다. static이기 때문
	// 할당해준것이 자기가 속해있는 클래스가 만든 객체의 메모리 주소
	public int i = 1;
	
	private SingletonClass() {
		// private 이다! 
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getSingletonClass() {
//		if( SINGLETON_CLASS_INSTANCE == null ) {
//			SINGLETON_CLASS_INSTANCE = new SingletonClass();
//		}
//		불필요한 코드 제거 
		return SINGLETON_CLASS_INSTANCE;
	}
	
	public void getI() {
		System.out.println("singleton i is " + this.i);
	}
	
	public void setI(int num) {
		System.out.println("singleton i is redefined by "+num);
		this.i = num;
	}
}
