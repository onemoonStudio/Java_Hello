package com.javalec.abs_intf;

public class Toy_pooh implements MoveArmsLegs{
	
	public Toy_pooh() {
		System.out.println("곰인형 푸 입니다.");
		// TODO Auto-generated constructor stub
		canMoveArmsLegs();
		System.out.println("===================");
	}
	@Override
	public void canMoveArmsLegs() {
		// TODO Auto-generated method stub
		System.out.println("팔다리를 움직일 수 있습니다.");
	}
}
