package com.javalec.abs_intf;

public class Toy_airplane implements Light,Missile{
	public Toy_airplane() {
		System.out.println("장난감 비행기 입니다.");
		canLight();
		canMissile();
		// TODO Auto-generated constructor stub
		System.out.println("===================");
	}
	
	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("라이트를 켤수있습니다.");
	}
	
	@Override
	public void canMissile() {
		System.out.println("미사일을 발사할 수 있습니다.");
	};
}
