package com.javalec.robot_ex;

import com.javalec.robot.intf.Fly_Yes;

public class SuperRobot extends Robot{
	public SuperRobot() {
		// TODO Auto-generated constructor stub
		// Main에 set없이 미사일이나 검을 사용하고싶다면
		// superClass 인 robotClass 의 interface 변수를 변경한다.
		Intf_Fly = new Fly_Yes();
		
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot입니다. 멋집니다.");
	}
	
	
}
