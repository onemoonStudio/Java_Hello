package com.javalec.robot_ex;

import com.javalec.robot.intf.Intf_Fly;
import com.javalec.robot.intf.Intf_Knife;
import com.javalec.robot.intf.Intf_Missile;

public abstract class Robot {
	
	//shape 함수는 추상메소드
	public abstract void shape();
	
	public void actionWalk() {
		System.out.println("걸을수 있습니다.");
	}
	
	public void actionRun() {
		System.out.println("뛸수 있습니다.");
	}
	
	// using interface 
	Intf_Fly Intf_Fly;
	Intf_Missile Intf_Missile;
	Intf_Knife Intf_Knife;
	
	// setter
	public void setFly(Intf_Fly set_fly) {
		this.Intf_Fly = set_fly;
	}
	
	public void setMissile(Intf_Missile set_missile) {
		this.Intf_Missile = set_missile;
	}
	
	public void setKnife(Intf_Knife set_knife) {
		this.Intf_Knife = set_knife;
	}
	
	// action
	
	public void actionFly() {
		this.Intf_Fly.fly();
	}
	
	public void actionMissile() {
		this.Intf_Missile.missile();
	}
	
	public void actionKnife() {
		this.Intf_Knife.knife();
	}
}
