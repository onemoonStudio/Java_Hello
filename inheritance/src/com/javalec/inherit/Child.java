package com.javalec.inherit;

public class Child extends Father{
	
	@Override 
	// override annotation 을 쓰는이유는 사용자가 실제로 오버라이드 했는지 안했는지 알려주기 위해서 사용한다.
	// 실제로 동작상이나 의미상의 차이는 없지만 써 주는것이 좋다.
	public void makeKimchijjige() {
//		super.makeKimchijjige();
		// 자동으로 super이 따라붙는데 ( 자동완성시 ) super는 상속받은 부모객체를 말한다.
		// 따라서 위의 구문을 그대로 사용한다면 상위객체의 메서드가 실행된다는 것을 알아두
		System.out.println("나의 김치찌개");
	}
}
