package javalec.di_ex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//public class Student implements InitializingBean,DisposableBean{
public class Student{

	private String name;
	private int age;
	private String[] hobbys;
	
	public Student(String name , int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void getHobbys() {
		for(String hello : this.hobbys) {
			System.out.print(hello + " ");
		}
	}

	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		// right after bean has been created
//		System.out.println("bean is created");
//		
//	}
//
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		// when bean is destroyed
//		System.out.println("bean is destroyed");
//		
//	}

	@PostConstruct
	public void initMethod() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroy");
	}
	
	

}
