package javalec.di_ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	
		//String configPath = "classpath:applicationCTX.xml";
		String configPath = "classpath:studentAppCTX.xml";
		String pencilConfigPath ="classpath:pencilAppCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(pencilConfigPath,configPath);
		AnnotationConfigApplicationContext newCtx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		//MyCalculator myCal = ctx.getBean("myCalculator" ,MyCalculator.class );
		//myCal.sum();
		
//		StudentInfo stdinfo = ctx.getBean("studentInfo",StudentInfo.class);
//		stdinfo.getStudentInfo();
//		
//		Student student1 = ctx.getBean("student1",Student.class);
//		stdinfo.setStudentInfo(student1);
//		stdinfo.getStudentInfo();
		
//		Pencil pencil = ctx.getBean("pencil" , Pencil.class);
//		pencil.use();
		
		Student student4 = newCtx.getBean("student4",Student.class);
		System.out.println(student4.getName() + " is student 4 name");
		System.out.println(student4.getAge() + " is student 4 age");
		student4.getHobbys();
		System.out.print(" is student 4 hobbys\n");
		
		Student student5 = newCtx.getBean("student5",Student.class);
		System.out.println(student5.getName() + " is student 5 name");
		System.out.println(student5.getAge() + " is student 5 age");
		student5.getHobbys();
		System.out.println(" is student 5 hobbys\n");
		
		
		
		ctx.close();
		
		
	}
	
	
	
}
