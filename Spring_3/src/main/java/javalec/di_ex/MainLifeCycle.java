package javalec.di_ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainLifeCycle {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); 
		// create
		
		ctx.load("classpath:studentAppCTX.xml");
		// setting
		ctx.refresh();
		
		Student student = ctx.getBean("student1" , Student.class);
		System.out.println("이름  " + student.getName());
		// use
		
		ctx.close();
		// close 
	}


}
