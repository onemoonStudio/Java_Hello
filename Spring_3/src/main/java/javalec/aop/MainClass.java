package javalec.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javalec.di_ex.Student;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopCTX.xml");
		
		Student student = ctx.getBean("student" , Student.class);
		student.getInfo();
		
		Worker worker = ctx.getBean("worker" , Worker.class);
		worker.getInfo();
		
		ctx.close();
	}

}
