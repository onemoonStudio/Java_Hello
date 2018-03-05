package com.javalec.robot_ex;

//import com.javalec.robot.intf.Fly_Yes;
import com.javalec.robot.intf.Kinfe_Lazor;
import com.javalec.robot.intf.Missile_Yes;

public class MainClass {
	public static void main(String[] args) {
		
		Robot super_robot = new SuperRobot();
		super_robot.shape();
		super_robot.actionWalk();
		super_robot.actionRun();
		
		// 만약 set을 Main이 아니라 다른곳에서 정하고싶다면 constructor 쪽에서 설정해줄수도 있다.
//		super_robot.setFly(new Fly_Yes());
		super_robot.actionFly();
		super_robot.setKnife(new Kinfe_Lazor());
		super_robot.actionKnife();
		super_robot.setMissile(new Missile_Yes());
		super_robot.actionMissile();
		
	}
	
}
