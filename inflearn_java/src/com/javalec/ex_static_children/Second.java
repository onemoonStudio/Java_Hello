package com.javalec.ex_static_children;

import com.javalec.papa.Pouch;;

public class Second {
	
	public Second() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int howMuch) {
		if(Pouch.MONEY - howMuch < 0 ) System.out.println("공유된 지갑의 돈이 충분하지 않습니다. - 둘째");
		else {
			Pouch.MONEY = Pouch.MONEY - howMuch;
			System.out.println("둘째가 " + howMuch + " 만큼의 돈을 가져갔습니다. 남은금액 : " + Pouch.MONEY);
		}
	}
	
}
