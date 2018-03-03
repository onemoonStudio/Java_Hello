package com.javalec.abs_intf;

public class MainClass {
	public static void main(String[] args) {
		
//		Toy_airplane airplane = new Toy_airplane();
//		Light airplane = new Toy_airplane();
		Toy airplane = new Toy_airplane();
		// 객체의 타입으로 Light와 airplane 을 사용할 수 있지만 메서드가 존재하는지
		// 한번 더 확인을 해야한다. 예를들어 여기서 airplane.canLight()는 사용이 불가능하다.
		// 참고로 superclass인 Toy로 한번에 묶어서 처리도 가능하다.
		Toy pooh = new Toy_pooh();
		Toy gundam = new Toy_gundam();
		
		
		// Toy라는 타입으로 통일시켜 Array 에 넣을수 있다.
		
		Toy[] toys = {airplane , pooh , gundam};
		
		for( int i=0 ; i < toys.length ; i++) {
			System.out.println("장난감이 배열에 들어있습니다.");
		}
		
	}
}
