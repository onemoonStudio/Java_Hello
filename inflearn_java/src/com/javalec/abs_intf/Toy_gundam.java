package com.javalec.abs_intf;

public class Toy_gundam implements Missile , MoveArmsLegs{
	
	public Toy_gundam() {
		// TODO Auto-generated constructor stub
		System.out.println("건담 입니다.");
		canMissile();
		// this.canMissile() 에서 this가 생략된 것이다.
		canMoveArmsLegs();
		System.out.println("===================");
	}
	
	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사할 수 있습니다.");
	}
	
	@Override
	public void canMoveArmsLegs() {
		// TODO Auto-generated method stub
		System.out.println("팔다리를 움직일 수 있습니다.");
	}
}
